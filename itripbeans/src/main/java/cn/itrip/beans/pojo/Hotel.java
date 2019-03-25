package cn.itrip.beans.pojo;

import java.util.Date;

public class Hotel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.hotelName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String hotelname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.countryId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long countryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.provinceId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.cityId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long cityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.address
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.hotelType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer hoteltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.hotelLevel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer hotellevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.isGroupPurchase
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer isgrouppurchase;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.redundantCityName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String redundantcityname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.redundantProvinceName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String redundantprovincename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.redundantCountryName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String redundantcountryname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.redundantHotelStore
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer redundanthotelstore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Hotel(Long id, String hotelname, Long countryid, Long provinceid, Long cityid, String address, Integer hoteltype, Integer hotellevel, Integer isgrouppurchase, String redundantcityname, String redundantprovincename, String redundantcountryname, Integer redundanthotelstore, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.hotelname = hotelname;
        this.countryid = countryid;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.address = address;
        this.hoteltype = hoteltype;
        this.hotellevel = hotellevel;
        this.isgrouppurchase = isgrouppurchase;
        this.redundantcityname = redundantcityname;
        this.redundantprovincename = redundantprovincename;
        this.redundantcountryname = redundantcountryname;
        this.redundanthotelstore = redundanthotelstore;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Hotel() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.id
     *
     * @return the value of itrip_hotel.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.id
     *
     * @param id the value for itrip_hotel.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.hotelName
     *
     * @return the value of itrip_hotel.hotelName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getHotelname() {
        return hotelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.hotelName
     *
     * @param hotelname the value for itrip_hotel.hotelName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.countryId
     *
     * @return the value of itrip_hotel.countryId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCountryid() {
        return countryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.countryId
     *
     * @param countryid the value for itrip_hotel.countryId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.provinceId
     *
     * @return the value of itrip_hotel.provinceId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.provinceId
     *
     * @param provinceid the value for itrip_hotel.provinceId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.cityId
     *
     * @return the value of itrip_hotel.cityId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.cityId
     *
     * @param cityid the value for itrip_hotel.cityId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.address
     *
     * @return the value of itrip_hotel.address
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.address
     *
     * @param address the value for itrip_hotel.address
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.hotelType
     *
     * @return the value of itrip_hotel.hotelType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getHoteltype() {
        return hoteltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.hotelType
     *
     * @param hoteltype the value for itrip_hotel.hotelType
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setHoteltype(Integer hoteltype) {
        this.hoteltype = hoteltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.hotelLevel
     *
     * @return the value of itrip_hotel.hotelLevel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getHotellevel() {
        return hotellevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.hotelLevel
     *
     * @param hotellevel the value for itrip_hotel.hotelLevel
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setHotellevel(Integer hotellevel) {
        this.hotellevel = hotellevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.isGroupPurchase
     *
     * @return the value of itrip_hotel.isGroupPurchase
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getIsgrouppurchase() {
        return isgrouppurchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.isGroupPurchase
     *
     * @param isgrouppurchase the value for itrip_hotel.isGroupPurchase
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setIsgrouppurchase(Integer isgrouppurchase) {
        this.isgrouppurchase = isgrouppurchase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.redundantCityName
     *
     * @return the value of itrip_hotel.redundantCityName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getRedundantcityname() {
        return redundantcityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.redundantCityName
     *
     * @param redundantcityname the value for itrip_hotel.redundantCityName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setRedundantcityname(String redundantcityname) {
        this.redundantcityname = redundantcityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.redundantProvinceName
     *
     * @return the value of itrip_hotel.redundantProvinceName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getRedundantprovincename() {
        return redundantprovincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.redundantProvinceName
     *
     * @param redundantprovincename the value for itrip_hotel.redundantProvinceName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setRedundantprovincename(String redundantprovincename) {
        this.redundantprovincename = redundantprovincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.redundantCountryName
     *
     * @return the value of itrip_hotel.redundantCountryName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getRedundantcountryname() {
        return redundantcountryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.redundantCountryName
     *
     * @param redundantcountryname the value for itrip_hotel.redundantCountryName
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setRedundantcountryname(String redundantcountryname) {
        this.redundantcountryname = redundantcountryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.redundantHotelStore
     *
     * @return the value of itrip_hotel.redundantHotelStore
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getRedundanthotelstore() {
        return redundanthotelstore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.redundantHotelStore
     *
     * @param redundanthotelstore the value for itrip_hotel.redundantHotelStore
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setRedundanthotelstore(Integer redundanthotelstore) {
        this.redundanthotelstore = redundanthotelstore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.creationDate
     *
     * @return the value of itrip_hotel.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.creationDate
     *
     * @param creationdate the value for itrip_hotel.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.createdBy
     *
     * @return the value of itrip_hotel.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.createdBy
     *
     * @param createdby the value for itrip_hotel.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.modifyDate
     *
     * @return the value of itrip_hotel.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.modifyDate
     *
     * @param modifydate the value for itrip_hotel.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel.modifiedBy
     *
     * @return the value of itrip_hotel.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel.modifiedBy
     *
     * @param modifiedby the value for itrip_hotel.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}