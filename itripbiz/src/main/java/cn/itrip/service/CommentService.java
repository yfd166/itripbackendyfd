package cn.itrip.service;

import cn.itrip.beans.pojo.Comment;
import cn.itrip.beans.pojo.Image;
import cn.itrip.beans.vo.comment.ItripListCommentVO;
import cn.itrip.beans.vo.comment.ItripScoreCommentVO;
import cn.itrip.common.Page;

import java.util.List;
import java.util.Map;

public interface CommentService {
    /**
     * 根据酒店的id查询并计算所有点评的位置、设施、服务、卫生和综合评分-add by donghai
     * @param hotelId 酒店的id
     */
    public ItripScoreCommentVO getAvgAndTotalScore(Long hotelId) throws Exception;

    Integer getItripCommentCountByMap(Map<String, Object> param)throws Exception;

    Page<ItripListCommentVO> queryItripCommentPageByMap(Map<String, Object> param, Integer pageNo, Integer pageSize)throws Exception;

    boolean itriptxAddItripComment(Comment obj, List<Image> itripImages)throws Exception;
}
