package cn.itrip.dao;

import cn.itrip.beans.pojo.TradeEnds;

public interface TradeEndsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int insert(TradeEnds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int insertSelective(TradeEnds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    TradeEnds selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKeySelective(TradeEnds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKey(TradeEnds record);
}