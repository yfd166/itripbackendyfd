package cn.itrip.service;

import cn.itrip.beans.vo.hotelroom.ItripHotelRoomVO;

import java.util.List;
import java.util.Map;

public interface HotelRoomService {


    List<ItripHotelRoomVO> getItripHotelRoomListByMap(Map<String, Object> param)throws Exception;


}
