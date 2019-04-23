package cn.itrip.service.impl;

import cn.itrip.beans.pojo.Comment;
import cn.itrip.beans.pojo.Image;
import cn.itrip.beans.vo.comment.ItripListCommentVO;
import cn.itrip.beans.vo.comment.ItripScoreCommentVO;
import cn.itrip.common.BigDecimalUtil;
import cn.itrip.common.Constants;
import cn.itrip.common.EmptyUtils;
import cn.itrip.common.Page;
import cn.itrip.dao.CommentMapper;
import cn.itrip.dao.HotelOrderMapper;
import cn.itrip.dao.ImageMapper;
import cn.itrip.service.CommentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {

    private Logger logger = Logger.getLogger(CommentServiceImpl.class);

    @Resource
    private CommentMapper commentMapper;

    @Resource
    private ImageMapper imageMapper;

    @Resource
    private HotelOrderMapper hotelOrderMapper;

    @Override
    public ItripScoreCommentVO getAvgAndTotalScore(Long hotelId) throws Exception {
        return commentMapper.getCommentAvgScore(hotelId);
    }

    @Override
    public Integer getItripCommentCountByMap(Map<String,Object> param)throws Exception{
        return commentMapper.getItripCommentCountByMap(param);
    }

    @Override
    public Page<ItripListCommentVO> queryItripCommentPageByMap(Map<String,Object> param, Integer pageNo, Integer pageSize)throws Exception{
        Integer total = commentMapper.getItripCommentCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripListCommentVO> itripCommentList = commentMapper.getItripCommentListByMap(param);
        page.setRows(itripCommentList);
        return page;
    }

    @Override
    public boolean itriptxAddItripComment(Comment obj, List<Image> itripImages) throws Exception {
        if(null != obj ){
            //计算综合评分，综合评分=(设施+卫生+位置+服务)/4
            float score = 0;
            int sum = obj.getFacilitiesscore()+obj.getHygienescore()+obj.getPositionscore()+obj.getServicescore();
            score = BigDecimalUtil.OperationASMD(sum,4, BigDecimalUtil.BigDecimalOprations.divide,1, BigDecimal.ROUND_DOWN).floatValue();
            //对结果四舍五入
            obj.setScore(Math.round(score));
            Long commentId = 0L;
            if(commentMapper.insertItripComment(obj) > 0 ){
                commentId = obj.getId();
                logger.debug("新增评论id：================ " + commentId);
                if(null != itripImages && itripImages.size() > 0 && commentId > 0){
                    for (Image itripImage:itripImages) {
                        itripImage.setTargetid(commentId);
                        imageMapper.insert(itripImage);
                    }
                }
                //更新订单表-订单状态为4（已评论）
                hotelOrderMapper.updateHotelOrderStatus(obj.getOrderid(),obj.getCreatedby());
                return true;
            }
        }
        return false;

    }
}
