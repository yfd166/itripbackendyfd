package cn.itrip.service;

import cn.itrip.beans.vo.ItripImageVO;

import java.util.List;
import java.util.Map;

public interface ImageService {

    List<ItripImageVO> getItripImageListByMap(Map<String, Object> param)throws Exception;

}
