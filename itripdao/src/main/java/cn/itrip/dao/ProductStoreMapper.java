package cn.itrip.dao;

import cn.itrip.beans.pojo.ProductStore;

public interface ProductStoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_product_store
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_product_store
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int insert(ProductStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_product_store
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int insertSelective(ProductStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_product_store
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    ProductStore selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_product_store
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKeySelective(ProductStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_product_store
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    int updateByPrimaryKey(ProductStore record);
}