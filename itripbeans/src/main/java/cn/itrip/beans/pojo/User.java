package cn.itrip.beans.pojo;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.userCode
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String usercode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.userPassword
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String userpassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.userType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer usertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.flatID
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long flatid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.userName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.weChat
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String wechat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.QQ
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.weibo
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String weibo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.baidu
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String baidu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long modifiedby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_user.activated
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer activated;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_user
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public User(Long id, String usercode, String userpassword, Integer usertype, Long flatid, String username, String wechat, String qq, String weibo, String baidu, Date creationdate, Long createdby, Date modifydate, Long modifiedby, Integer activated) {
        this.id = id;
        this.usercode = usercode;
        this.userpassword = userpassword;
        this.usertype = usertype;
        this.flatid = flatid;
        this.username = username;
        this.wechat = wechat;
        this.qq = qq;
        this.weibo = weibo;
        this.baidu = baidu;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
        this.activated = activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_user
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.id
     *
     * @return the value of itrip_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.id
     *
     * @param id the value for itrip_user.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.userCode
     *
     * @return the value of itrip_user.userCode
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.userCode
     *
     * @param usercode the value for itrip_user.userCode
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.userPassword
     *
     * @return the value of itrip_user.userPassword
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.userPassword
     *
     * @param userpassword the value for itrip_user.userPassword
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.userType
     *
     * @return the value of itrip_user.userType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.userType
     *
     * @param usertype the value for itrip_user.userType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.flatID
     *
     * @return the value of itrip_user.flatID
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getFlatid() {
        return flatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.flatID
     *
     * @param flatid the value for itrip_user.flatID
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setFlatid(Long flatid) {
        this.flatid = flatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.userName
     *
     * @return the value of itrip_user.userName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.userName
     *
     * @param username the value for itrip_user.userName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.weChat
     *
     * @return the value of itrip_user.weChat
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.weChat
     *
     * @param wechat the value for itrip_user.weChat
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.QQ
     *
     * @return the value of itrip_user.QQ
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.QQ
     *
     * @param qq the value for itrip_user.QQ
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.weibo
     *
     * @return the value of itrip_user.weibo
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.weibo
     *
     * @param weibo the value for itrip_user.weibo
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.baidu
     *
     * @return the value of itrip_user.baidu
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getBaidu() {
        return baidu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.baidu
     *
     * @param baidu the value for itrip_user.baidu
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setBaidu(String baidu) {
        this.baidu = baidu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.creationDate
     *
     * @return the value of itrip_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.creationDate
     *
     * @param creationdate the value for itrip_user.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.createdBy
     *
     * @return the value of itrip_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.createdBy
     *
     * @param createdby the value for itrip_user.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.modifyDate
     *
     * @return the value of itrip_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.modifyDate
     *
     * @param modifydate the value for itrip_user.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.modifiedBy
     *
     * @return the value of itrip_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.modifiedBy
     *
     * @param modifiedby the value for itrip_user.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_user.activated
     *
     * @return the value of itrip_user.activated
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getActivated() {
        return activated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_user.activated
     *
     * @param activated the value for itrip_user.activated
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setActivated(Integer activated) {
        this.activated = activated;
    }
}