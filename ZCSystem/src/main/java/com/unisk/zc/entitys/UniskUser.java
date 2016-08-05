package com.unisk.zc.entitys;

import java.util.Date;

import com.unisk.zc.core.support.Page;


public class UniskUser extends BaseQuery<UniskUser> {
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.PASSWORD
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.REALNAME
     *
     * @mbggenerated
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.SEX
     *
     * @mbggenerated
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.PHONE
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.MOBILE
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.DEPTID
     *
     * @mbggenerated
     */
    private Integer deptid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.REMARKS
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.ISLOCK
     *
     * @mbggenerated
     */
    private Integer islock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.DISABLETIME
     *
     * @mbggenerated
     */
    private Date disabletime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.STATUS
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.DELMARK
     *
     * @mbggenerated
     */
    private Integer delmark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.CREATETIME
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.CREATEUSERID
     *
     * @mbggenerated
     */
    private Integer createuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.MODIFYTIME
     *
     * @mbggenerated
     */
    private Date modifytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_D_UNISKUSER.MODIFYUSERID
     *
     * @mbggenerated
     */
    private Integer modifyuserid;
    
    private Integer provid;
    
    private Integer wechatstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.ID
     *
     * @return the value of TB_D_UNISKUSER.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.ID
     *
     * @param id the value for TB_D_UNISKUSER.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.USERNAME
     *
     * @return the value of TB_D_UNISKUSER.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.USERNAME
     *
     * @param username the value for TB_D_UNISKUSER.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.PASSWORD
     *
     * @return the value of TB_D_UNISKUSER.PASSWORD
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.PASSWORD
     *
     * @param password the value for TB_D_UNISKUSER.PASSWORD
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.REALNAME
     *
     * @return the value of TB_D_UNISKUSER.REALNAME
     *
     * @mbggenerated
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.REALNAME
     *
     * @param realname the value for TB_D_UNISKUSER.REALNAME
     *
     * @mbggenerated
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.SEX
     *
     * @return the value of TB_D_UNISKUSER.SEX
     *
     * @mbggenerated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.SEX
     *
     * @param sex the value for TB_D_UNISKUSER.SEX
     *
     * @mbggenerated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.PHONE
     *
     * @return the value of TB_D_UNISKUSER.PHONE
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.PHONE
     *
     * @param phone the value for TB_D_UNISKUSER.PHONE
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.MOBILE
     *
     * @return the value of TB_D_UNISKUSER.MOBILE
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.MOBILE
     *
     * @param mobile the value for TB_D_UNISKUSER.MOBILE
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.EMAIL
     *
     * @return the value of TB_D_UNISKUSER.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.EMAIL
     *
     * @param email the value for TB_D_UNISKUSER.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.TITLE
     *
     * @return the value of TB_D_UNISKUSER.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.TITLE
     *
     * @param title the value for TB_D_UNISKUSER.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.DEPTID
     *
     * @return the value of TB_D_UNISKUSER.DEPTID
     *
     * @mbggenerated
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.DEPTID
     *
     * @param deptid the value for TB_D_UNISKUSER.DEPTID
     *
     * @mbggenerated
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.REMARKS
     *
     * @return the value of TB_D_UNISKUSER.REMARKS
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.REMARKS
     *
     * @param remarks the value for TB_D_UNISKUSER.REMARKS
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.ISLOCK
     *
     * @return the value of TB_D_UNISKUSER.ISLOCK
     *
     * @mbggenerated
     */
    public Integer getIslock() {
        return islock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.ISLOCK
     *
     * @param islock the value for TB_D_UNISKUSER.ISLOCK
     *
     * @mbggenerated
     */
    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.DISABLETIME
     *
     * @return the value of TB_D_UNISKUSER.DISABLETIME
     *
     * @mbggenerated
     */
    public Date getDisabletime() {
        return disabletime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.DISABLETIME
     *
     * @param disabletime the value for TB_D_UNISKUSER.DISABLETIME
     *
     * @mbggenerated
     */
    public void setDisabletime(Date disabletime) {
        this.disabletime = disabletime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.STATUS
     *
     * @return the value of TB_D_UNISKUSER.STATUS
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.STATUS
     *
     * @param status the value for TB_D_UNISKUSER.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.DELMARK
     *
     * @return the value of TB_D_UNISKUSER.DELMARK
     *
     * @mbggenerated
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.DELMARK
     *
     * @param delmark the value for TB_D_UNISKUSER.DELMARK
     *
     * @mbggenerated
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.CREATETIME
     *
     * @return the value of TB_D_UNISKUSER.CREATETIME
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.CREATETIME
     *
     * @param createtime the value for TB_D_UNISKUSER.CREATETIME
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.CREATEUSERID
     *
     * @return the value of TB_D_UNISKUSER.CREATEUSERID
     *
     * @mbggenerated
     */
    public Integer getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.CREATEUSERID
     *
     * @param createuserid the value for TB_D_UNISKUSER.CREATEUSERID
     *
     * @mbggenerated
     */
    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.MODIFYTIME
     *
     * @return the value of TB_D_UNISKUSER.MODIFYTIME
     *
     * @mbggenerated
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.MODIFYTIME
     *
     * @param modifytime the value for TB_D_UNISKUSER.MODIFYTIME
     *
     * @mbggenerated
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_D_UNISKUSER.MODIFYUSERID
     *
     * @return the value of TB_D_UNISKUSER.MODIFYUSERID
     *
     * @mbggenerated
     */
    public Integer getModifyuserid() {
        return modifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_D_UNISKUSER.MODIFYUSERID
     *
     * @param modifyuserid the value for TB_D_UNISKUSER.MODIFYUSERID
     *
     * @mbggenerated
     */
    public void setModifyuserid(Integer modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

	public Integer getProvid() {
		return provid;
	}

	public void setProvid(Integer provid) {
		this.provid = provid;
	}

	public Integer getWechatstatus() {
		return wechatstatus;
	}

	public void setWechatstatus(Integer wechatstatus) {
		this.wechatstatus = wechatstatus;
	}
}