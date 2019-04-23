package cn.itrip.service;

import cn.itrip.beans.pojo.AreaDic;

import java.util.List;
import java.util.Map;

public interface AreaDicService {
    List<AreaDic> getItripAreaDicListByMap(Map<String, Object> param)throws Exception;
}
