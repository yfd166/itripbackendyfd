package cn.itrip.beans.pojo;

import java.util.Date;

public class AreaDic {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.name
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.areaNo
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String areano;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.parent
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long parent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.isActivated
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer isactivated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.isTradingArea
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer istradingarea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.isHot
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer ishot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.level
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.isChina
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Integer ischina;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.pinyin
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private String pinyin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column itrip_area_dic.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    private Long modifiedby;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_area_dic
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public AreaDic(Long id, String name, String areano, Long parent, Integer isactivated, Integer istradingarea, Integer ishot, Integer level, Integer ischina, String pinyin, Date creationdate, Long createdby, Date modifydate, Long modifiedby) {
        this.id = id;
        this.name = name;
        this.areano = areano;
        this.parent = parent;
        this.isactivated = isactivated;
        this.istradingarea = istradingarea;
        this.ishot = ishot;
        this.level = level;
        this.ischina = ischina;
        this.pinyin = pinyin;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_area_dic
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public AreaDic() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.id
     *
     * @return the value of itrip_area_dic.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.id
     *
     * @param id the value for itrip_area_dic.id
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.name
     *
     * @return the value of itrip_area_dic.name
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.name
     *
     * @param name the value for itrip_area_dic.name
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.areaNo
     *
     * @return the value of itrip_area_dic.areaNo
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getAreano() {
        return areano;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.areaNo
     *
     * @param areano the value for itrip_area_dic.areaNo
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setAreano(String areano) {
        this.areano = areano;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.parent
     *
     * @return the value of itrip_area_dic.parent
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.parent
     *
     * @param parent the value for itrip_area_dic.parent
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.isActivated
     *
     * @return the value of itrip_area_dic.isActivated
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getIsactivated() {
        return isactivated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.isActivated
     *
     * @param isactivated the value for itrip_area_dic.isActivated
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setIsactivated(Integer isactivated) {
        this.isactivated = isactivated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.isTradingArea
     *
     * @return the value of itrip_area_dic.isTradingArea
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getIstradingarea() {
        return istradingarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.isTradingArea
     *
     * @param istradingarea the value for itrip_area_dic.isTradingArea
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setIstradingarea(Integer istradingarea) {
        this.istradingarea = istradingarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.isHot
     *
     * @return the value of itrip_area_dic.isHot
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getIshot() {
        return ishot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.isHot
     *
     * @param ishot the value for itrip_area_dic.isHot
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setIshot(Integer ishot) {
        this.ishot = ishot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.level
     *
     * @return the value of itrip_area_dic.level
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.level
     *
     * @param level the value for itrip_area_dic.level
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.isChina
     *
     * @return the value of itrip_area_dic.isChina
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Integer getIschina() {
        return ischina;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.isChina
     *
     * @param ischina the value for itrip_area_dic.isChina
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setIschina(Integer ischina) {
        this.ischina = ischina;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.pinyin
     *
     * @return the value of itrip_area_dic.pinyin
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.pinyin
     *
     * @param pinyin the value for itrip_area_dic.pinyin
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.creationDate
     *
     * @return the value of itrip_area_dic.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.creationDate
     *
     * @param creationdate the value for itrip_area_dic.creationDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.createdBy
     *
     * @return the value of itrip_area_dic.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.createdBy
     *
     * @param createdby the value for itrip_area_dic.createdBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.modifyDate
     *
     * @return the value of itrip_area_dic.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.modifyDate
     *
     * @param modifydate the value for itrip_area_dic.modifyDate
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column itrip_area_dic.modifiedBy
     *
     * @return the value of itrip_area_dic.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public Long getModifiedby() {
        return modifiedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column itrip_area_dic.modifiedBy
     *
     * @param modifiedby the value for itrip_area_dic.modifiedBy
     *
     * @mbggenerated Mon Mar 25 09:29:58 CST 2019
     */
    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }
}