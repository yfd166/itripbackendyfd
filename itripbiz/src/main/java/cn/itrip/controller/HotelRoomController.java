package cn.itrip.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.vo.hotelroom.ItripHotelRoomVO;
import cn.itrip.beans.vo.hotelroom.SearchHotelRoomVO;
import cn.itrip.common.DateUtil;
import cn.itrip.common.DtoUtil;
import cn.itrip.common.EmptyUtils;
import cn.itrip.service.HotelRoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@Api(value = "API", basePath = "/http://api.itrip.com/api")
@RequestMapping("/api/hotelroom")
public class HotelRoomController {

    private Logger logger = Logger.getLogger(HotelRoomController.class);

    @Resource private HotelRoomService hotelRoomService;

    @ApiOperation(value = "查询酒店房间列表", httpMethod = "POST",
            protocols = "HTTP", produces = "application/json",
            response = Dto.class, notes = "查询酒店房间列表" +
            "<p>成功：success = ‘true’ | 失败：success = ‘false’ 并返回错误码，如下：</p>" +
            "<p>错误码：</p>" +
            "<p>100303 : 酒店id不能为空,酒店入住及退房时间不能为空,入住时间不能大于退房时间</p>" +
            "<p>100304 : 系统异常</p>")
    @RequestMapping(value = "/queryhotelroombyhotel", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Dto<List<ItripHotelRoomVO>> queryHotelRoomByHotel(@RequestBody SearchHotelRoomVO vo) {
        List<List<ItripHotelRoomVO>> hotelRoomVOList = null;
        try {
            Map<String, Object> param = new HashMap();
            if (EmptyUtils.isEmpty(vo.getHotelId())) {
                return DtoUtil.returnFail("酒店ID不能为空", "100303");
            }
            if (EmptyUtils.isEmpty(vo.getStartDate()) || EmptyUtils.isEmpty(vo.getEndDate())) {
                return DtoUtil.returnFail("必须填写酒店入住及退房时间", "100303");
            }
            if (EmptyUtils.isNotEmpty(vo.getStartDate()) && EmptyUtils.isNotEmpty(vo.getEndDate())) {
                if (vo.getStartDate().getTime() > vo.getEndDate().getTime()) {
                    return DtoUtil.returnFail("入住时间不能大于退房时间", "100303");
                }
                List<Date> dates = DateUtil.getBetweenDates(vo.getStartDate(), vo.getEndDate());
                param.put("timesList", dates);
            }

            vo.setIsHavingBreakfast(EmptyUtils.isEmpty(vo.getIsHavingBreakfast()) ? null : vo.getIsHavingBreakfast());
            vo.setIsBook(EmptyUtils.isEmpty(vo.getIsBook()) ? null : vo.getIsBook());
            vo.setIsTimelyResponse(EmptyUtils.isEmpty(vo.getIsTimelyResponse()) ? null : vo.getIsTimelyResponse());
            vo.setRoomBedTypeId(EmptyUtils.isEmpty(vo.getRoomBedTypeId()) ? null : vo.getRoomBedTypeId());
            vo.setIsCancel(EmptyUtils.isEmpty(vo.getIsCancel()) ? null : vo.getIsCancel());
            vo.setPayType(EmptyUtils.isEmpty(vo.getPayType()) ? null : vo.getPayType());

            param.put("hotelId", vo.getHotelId());
            param.put("isBook", vo.getIsBook());
            param.put("isHavingBreakfast", vo.getIsHavingBreakfast());
            param.put("isTimelyResponse", vo.getIsTimelyResponse());
            param.put("roomBedTypeId", vo.getRoomBedTypeId());
            param.put("isCancel", vo.getIsCancel());
            param.put("payType", vo.getPayType()==3?null:vo.getPayType());

            List<ItripHotelRoomVO> originalRoomList = hotelRoomService.getItripHotelRoomListByMap(param);
            hotelRoomVOList = new ArrayList();
            for (ItripHotelRoomVO roomVO : originalRoomList) {
                List<ItripHotelRoomVO> tempList = new ArrayList<ItripHotelRoomVO>();
                tempList.add(roomVO);
                hotelRoomVOList.add(tempList);
            }
            return DtoUtil.returnSuccess("获取成功", hotelRoomVOList);
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("获取酒店房型列表失败", "100304");
        }
    }

}
