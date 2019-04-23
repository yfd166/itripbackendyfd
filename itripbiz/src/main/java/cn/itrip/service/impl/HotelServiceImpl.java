package cn.itrip.service.impl;

import cn.itrip.beans.pojo.AreaDic;
import cn.itrip.beans.pojo.LabelDic;
import cn.itrip.beans.vo.hotel.HotelVideoDescVO;
import cn.itrip.beans.vo.hotel.ItripSearchDetailsHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchFacilitiesHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchPolicyHotelVO;
import cn.itrip.dao.HotelMapper;
import cn.itrip.service.HotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Resource
    private HotelMapper hotelMapper;

    @Override
    public HotelVideoDescVO getVideoDescByHotelId(Long id) throws Exception {
        HotelVideoDescVO hotelVideoDescVO = new HotelVideoDescVO();
        List<AreaDic> itripAreaDicList = new ArrayList<>();
        itripAreaDicList = hotelMapper.getHotelAreaByHotelId(id);
        List<String> tempList1 = new ArrayList<>();
        for (AreaDic itripAreaDic:itripAreaDicList) {
            tempList1.add(itripAreaDic.getName());
        }
        hotelVideoDescVO.setTradingAreaNameList(tempList1);

        List<LabelDic> itripLabelDicList = new ArrayList<>();
        itripLabelDicList = hotelMapper.getHotelFeatureByHotelId(id);
        List<String> tempList2 = new ArrayList<>();
        for (LabelDic itripLabelDic:itripLabelDicList) {
            tempList2.add(itripLabelDic.getName());
        }
        hotelVideoDescVO.setHotelFeatureList(tempList2);

        hotelVideoDescVO.setHotelName(hotelMapper.getItripHotelById(id).getHotelname());
        return hotelVideoDescVO;
    }

    @Override
    public ItripSearchFacilitiesHotelVO getItripHotelFacilitiesById(Long id) throws Exception {
        return hotelMapper.getItripHotelFacilitiesById(id);
    }

    @Override
    public ItripSearchPolicyHotelVO queryHotelPolicy(Long id) throws Exception {
        return hotelMapper.queryHotelPolicy(id);
    }

    @Override
    public List<ItripSearchDetailsHotelVO> queryHotelDetails(Long id) throws Exception {
        List<LabelDic> itripLabelDicList = new ArrayList<>();
        itripLabelDicList = hotelMapper.getHotelFeatureByHotelId(id);
        ItripSearchDetailsHotelVO vo = new ItripSearchDetailsHotelVO();
        List<ItripSearchDetailsHotelVO> list = new ArrayList<ItripSearchDetailsHotelVO>();
        vo.setName("酒店介绍");
        vo.setDescription(hotelMapper.getItripHotelById(id).getDetails());
        list.add(vo);
        for (LabelDic itripLabelDic:itripLabelDicList) {
            ItripSearchDetailsHotelVO vo2 = new ItripSearchDetailsHotelVO();
            vo2.setName(itripLabelDic.getName());
            vo2.setDescription(itripLabelDic.getDescription());
            list.add(vo2);
        }
        return list;

    }
}
