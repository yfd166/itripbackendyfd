package cn.itrip.service.impl;

import cn.itrip.beans.vo.hotelroom.ItripHotelRoomVO;
import cn.itrip.dao.HotelRoomMapper;
import cn.itrip.service.HotelRoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {

    @Resource private HotelRoomMapper hotelRoomMapper;

    @Override
    public List<ItripHotelRoomVO> getItripHotelRoomListByMap(Map<String, Object> param) throws Exception {
        return hotelRoomMapper.getItripHotelRoomListByMap(param);
    }
}
