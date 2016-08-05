package com.unisk.zc.entitys;

import java.util.Date;

public class Button extends BaseQuery<Button> {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.BUTTONNAME
     *
     * @mbggenerated
     */
    private String buttonname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.BUTTONNO
     *
     * @mbggenerated
     */
    private String buttonno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.BUTTONCLASS
     *
     * @mbggenerated
     */
    private String buttonclass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.MENUID
     *
     * @mbggenerated
     */
    private Integer menuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.SORTCODE
     *
     * @mbggenerated
     */
    private Integer sortcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.ALLOWDEL
     *
     * @mbggenerated
     */
    private Integer allowdel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.ALLOWEDIT
     *
     * @mbggenerated
     */
    private Integer allowedit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.REMARKS
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.DELMARK
     *
     * @mbggenerated
     */
    private Integer delmark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.CREATETIME
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.CREATEUSERID
     *
     * @mbggenerated
     */
    private Integer createuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.MODIFYTIME
     *
     * @mbggenerated
     */
    private Date modifytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_BUTTON.MODIFYUSERID
     *
     * @mbggenerated
     */
    private Integer modifyuserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.ID
     *
     * @return the value of TB_D_BUTTON.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.ID
     *
     * @param id the value for TB_D_BUTTON.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.BUTTONNAME
     *
     * @return the value of TB_D_BUTTON.BUTTONNAME
     *
     * @mbggenerated
     */
    public String getButtonname() {
        return buttonname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.BUTTONNAME
     *
     * @param buttonname the value for TB_D_BUTTON.BUTTONNAME
     *
     * @mbggenerated
     */
    public void setButtonname(String buttonname) {
        this.buttonname = buttonname == null ? null : buttonname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.BUTTONNO
     *
     * @return the value of TB_D_BUTTON.BUTTONNO
     *
     * @mbggenerated
     */
    public String getButtonno() {
        return buttonno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.BUTTONNO
     *
     * @param buttonno the value for TB_D_BUTTON.BUTTONNO
     *
     * @mbggenerated
     */
    public void setButtonno(String buttonno) {
        this.buttonno = buttonno == null ? null : buttonno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.BUTTONCLASS
     *
     * @return the value of TB_D_BUTTON.BUTTONCLASS
     *
     * @mbggenerated
     */
    public String getButtonclass() {
        return buttonclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.BUTTONCLASS
     *
     * @param buttonclass the value for TB_D_BUTTON.BUTTONCLASS
     *
     * @mbggenerated
     */
    public void setButtonclass(String buttonclass) {
        this.buttonclass = buttonclass == null ? null : buttonclass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.MENUID
     *
     * @return the value of TB_D_BUTTON.MENUID
     *
     * @mbggenerated
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.MENUID
     *
     * @param menuid the value for TB_D_BUTTON.MENUID
     *
     * @mbggenerated
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.SORTCODE
     *
     * @return the value of TB_D_BUTTON.SORTCODE
     *
     * @mbggenerated
     */
    public Integer getSortcode() {
        return sortcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.SORTCODE
     *
     * @param sortcode the value for TB_D_BUTTON.SORTCODE
     *
     * @mbggenerated
     */
    public void setSortcode(Integer sortcode) {
        this.sortcode = sortcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.ALLOWDEL
     *
     * @return the value of TB_D_BUTTON.ALLOWDEL
     *
     * @mbggenerated
     */
    public Integer getAllowdel() {
        return allowdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.ALLOWDEL
     *
     * @param allowdel the value for TB_D_BUTTON.ALLOWDEL
     *
     * @mbggenerated
     */
    public void setAllowdel(Integer allowdel) {
        this.allowdel = allowdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.ALLOWEDIT
     *
     * @return the value of TB_D_BUTTON.ALLOWEDIT
     *
     * @mbggenerated
     */
    public Integer getAllowedit() {
        return allowedit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.ALLOWEDIT
     *
     * @param allowedit the value for TB_D_BUTTON.ALLOWEDIT
     *
     * @mbggenerated
     */
    public void setAllowedit(Integer allowedit) {
        this.allowedit = allowedit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.REMARKS
     *
     * @return the value of TB_D_BUTTON.REMARKS
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.REMARKS
     *
     * @param remarks the value for TB_D_BUTTON.REMARKS
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.DELMARK
     *
     * @return the value of TB_D_BUTTON.DELMARK
     *
     * @mbggenerated
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.DELMARK
     *
     * @param delmark the value for TB_D_BUTTON.DELMARK
     *
     * @mbggenerated
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.CREATETIME
     *
     * @return the value of TB_D_BUTTON.CREATETIME
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.CREATETIME
     *
     * @param createtime the value for TB_D_BUTTON.CREATETIME
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.CREATEUSERID
     *
     * @return the value of TB_D_BUTTON.CREATEUSERID
     *
     * @mbggenerated
     */
    public Integer getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.CREATEUSERID
     *
     * @param createuserid the value for TB_D_BUTTON.CREATEUSERID
     *
     * @mbggenerated
     */
    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.MODIFYTIME
     *
     * @return the value of TB_D_BUTTON.MODIFYTIME
     *
     * @mbggenerated
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.MODIFYTIME
     *
     * @param modifytime the value for TB_D_BUTTON.MODIFYTIME
     *
     * @mbggenerated
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_BUTTON.MODIFYUSERID
     *
     * @return the value of TB_D_BUTTON.MODIFYUSERID
     *
     * @mbggenerated
     */
    public Integer getModifyuserid() {
        return modifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_BUTTON.MODIFYUSERID
     *
     * @param modifyuserid the value for TB_D_BUTTON.MODIFYUSERID
     *
     * @mbggenerated
     */
    public void setModifyuserid(Integer modifyuserid) {
        this.modifyuserid = modifyuserid;
    }
}