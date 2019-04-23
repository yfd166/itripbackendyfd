package cn.itrip.service.impl;

import cn.itrip.beans.pojo.LabelDic;
import cn.itrip.dao.LabelDicMapper;
import cn.itrip.service.LabelDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class LabelDicServiceImpl implements LabelDicService {

    @Resource
    private LabelDicMapper labelDicMapper;

    @Override
    public List<LabelDic> getItripLabelDicListByMap(Map<String, Object> param) throws Exception {
        return labelDicMapper.getItripLabelDicListByMap(param);
    }
}
