package cn.itrip.beans.pojo;

import java.util.Date;

public class UserLinkUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.linkUserName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String linkusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.linkIdCard
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String linkidcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.linkPhone
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String linkphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.userId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long modifiedby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user_link_user.linkIdCardType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer linkidcardtype;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_user_link_user
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public UserLinkUser(Long id, String linkusername, String linkidcard, String linkphone, Integer userid, Date creationdate, Long createdby, Date modifydate, Long modifiedby, Integer linkidcardtype) {
        this.id = id;
        this.linkusername = linkusername;
        this.linkidcard = linkidcard;
        this.linkphone = linkphone;
        this.userid = userid;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
        this.linkidcardtype = linkidcardtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_user_link_user
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public UserLinkUser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.id
     *
     * @return the value of itrip_user_link_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.id
     *
     * @param id the value for itrip_user_link_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.linkUserName
     *
     * @return the value of itrip_user_link_user.linkUserName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getLinkusername() {
        return linkusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.linkUserName
     *
     * @param linkusername the value for itrip_user_link_user.linkUserName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.linkIdCard
     *
     * @return the value of itrip_user_link_user.linkIdCard
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getLinkidcard() {
        return linkidcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.linkIdCard
     *
     * @param linkidcard the value for itrip_user_link_user.linkIdCard
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLinkidcard(String linkidcard) {
        this.linkidcard = linkidcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.linkPhone
     *
     * @return the value of itrip_user_link_user.linkPhone
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getLinkphone() {
        return linkphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.linkPhone
     *
     * @param linkphone the value for itrip_user_link_user.linkPhone
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.userId
     *
     * @return the value of itrip_user_link_user.userId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.userId
     *
     * @param userid the value for itrip_user_link_user.userId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.creationDate
     *
     * @return the value of itrip_user_link_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.creationDate
     *
     * @param creationdate the value for itrip_user_link_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.createdBy
     *
     * @return the value of itrip_user_link_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.createdBy
     *
     * @param createdby the value for itrip_user_link_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.modifyDate
     *
     * @return the value of itrip_user_link_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.modifyDate
     *
     * @param modifydate the value for itrip_user_link_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.modifiedBy
     *
     * @return the value of itrip_user_link_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.modifiedBy
     *
     * @param modifiedby the value for itrip_user_link_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user_link_user.linkIdCardType
     *
     * @return the value of itrip_user_link_user.linkIdCardType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getLinkidcardtype() {
        return linkidcardtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user_link_user.linkIdCardType
     *
     * @param linkidcardtype the value for itrip_user_link_user.linkIdCardType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLinkidcardtype(Integer linkidcardtype) {
        this.linkidcardtype = linkidcardtype;
    }
}