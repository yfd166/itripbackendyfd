package cn.itrip.service.impl;

import cn.itrip.beans.pojo.AreaDic;
import cn.itrip.dao.AreaDicMapper;
import cn.itrip.service.AreaDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AreaDicServiceImpl implements AreaDicService {

    @Resource
    private AreaDicMapper areaDicMapper;

    @Override
    public List<AreaDic> getItripAreaDicListByMap(Map<String, Object> param) throws Exception {
        return areaDicMapper.getItripAreaDicListByMap(param);
    }

}
