package cn.itrip.beans.pojo;

import java.util.Date;

public class HotelFeature {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.hotelId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long hotelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.featureId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long featureid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_hotel_feature.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_feature
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public HotelFeature(Long id, Long hotelid, Long featureid, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.hotelid = hotelid;
        this.featureid = featureid;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_feature
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public HotelFeature() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.id
     *
     * @return the value of itrip_hotel_feature.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.id
     *
     * @param id the value for itrip_hotel_feature.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.hotelId
     *
     * @return the value of itrip_hotel_feature.hotelId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.hotelId
     *
     * @param hotelid the value for itrip_hotel_feature.hotelId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.featureId
     *
     * @return the value of itrip_hotel_feature.featureId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getFeatureid() {
        return featureid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.featureId
     *
     * @param featureid the value for itrip_hotel_feature.featureId
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.creationDate
     *
     * @return the value of itrip_hotel_feature.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.creationDate
     *
     * @param creationdate the value for itrip_hotel_feature.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.createdBy
     *
     * @return the value of itrip_hotel_feature.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.createdBy
     *
     * @param createdby the value for itrip_hotel_feature.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.modifyDate
     *
     * @return the value of itrip_hotel_feature.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.modifyDate
     *
     * @param modifydate the value for itrip_hotel_feature.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_hotel_feature.modifiedBy
     *
     * @return the value of itrip_hotel_feature.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_hotel_feature.modifiedBy
     *
     * @param modifiedby the value for itrip_hotel_feature.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}