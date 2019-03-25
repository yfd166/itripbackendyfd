package cn.itrip.beans.pojo;

import java.util.Date;

public class OrderLinkUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.orderId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.linkUserId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long linkuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.linkUserName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String linkusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_order_link_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public OrderLinkUser(Long id, Long orderid, Long linkuserid, String linkusername, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.orderid = orderid;
        this.linkuserid = linkuserid;
        this.linkusername = linkusername;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public OrderLinkUser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.id
     *
     * @return the value of itrip_order_link_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.id
     *
     * @param id the value for itrip_order_link_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.orderId
     *
     * @return the value of itrip_order_link_user.orderId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.orderId
     *
     * @param orderid the value for itrip_order_link_user.orderId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.linkUserId
     *
     * @return the value of itrip_order_link_user.linkUserId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getLinkuserid() {
        return linkuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.linkUserId
     *
     * @param linkuserid the value for itrip_order_link_user.linkUserId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLinkuserid(Long linkuserid) {
        this.linkuserid = linkuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.linkUserName
     *
     * @return the value of itrip_order_link_user.linkUserName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getLinkusername() {
        return linkusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.linkUserName
     *
     * @param linkusername the value for itrip_order_link_user.linkUserName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.creationDate
     *
     * @return the value of itrip_order_link_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.creationDate
     *
     * @param creationdate the value for itrip_order_link_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.createdBy
     *
     * @return the value of itrip_order_link_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.createdBy
     *
     * @param createdby the value for itrip_order_link_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.modifyDate
     *
     * @return the value of itrip_order_link_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.modifyDate
     *
     * @param modifydate the value for itrip_order_link_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_order_link_user.modifiedBy
     *
     * @return the value of itrip_order_link_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_order_link_user.modifiedBy
     *
     * @param modifiedby the value for itrip_order_link_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}