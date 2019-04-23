package cn.itrip.service;

import cn.itrip.beans.pojo.LabelDic;

import java.util.List;
import java.util.Map;

public interface LabelDicService {
    List<LabelDic> getItripLabelDicListByMap(Map<String, Object> param)throws Exception;
}
