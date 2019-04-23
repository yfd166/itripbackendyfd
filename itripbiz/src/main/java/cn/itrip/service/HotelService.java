package cn.itrip.service;

import cn.itrip.beans.vo.hotel.HotelVideoDescVO;
import cn.itrip.beans.vo.hotel.ItripSearchDetailsHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchFacilitiesHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchPolicyHotelVO;

import java.util.List;

public interface HotelService {
    /**
     * 根据酒店id查询酒店特色、商圈、酒店名称
     */
    HotelVideoDescVO getVideoDescByHotelId(Long id)throws Exception;

    ItripSearchFacilitiesHotelVO getItripHotelFacilitiesById(Long id)throws Exception;

    ItripSearchPolicyHotelVO queryHotelPolicy(Long id)throws Exception;

    List<ItripSearchDetailsHotelVO> queryHotelDetails(Long id)throws Exception;

}
