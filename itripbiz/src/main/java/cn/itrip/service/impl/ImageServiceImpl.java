package cn.itrip.service.impl;

import cn.itrip.beans.vo.ItripImageVO;
import cn.itrip.dao.ImageMapper;
import cn.itrip.service.ImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ImageServiceImpl implements ImageService {

    @Resource
    private ImageMapper imageMapper;

    @Override
    public List<ItripImageVO> getItripImageListByMap(Map<String, Object> param) throws Exception {
        return imageMapper.getItripImageListByMap(param);
    }
}
