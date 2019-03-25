package cn.itrip.dao;

import cn.itrip.beans.pojo.Hotel;
import cn.itrip.beans.pojo.HotelWithBLOBs;

public interface HotelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int insert(HotelWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int insertSelective(HotelWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    HotelWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKeySelective(HotelWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(HotelWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKey(Hotel record);
}