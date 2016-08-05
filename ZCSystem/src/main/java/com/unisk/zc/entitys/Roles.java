package com.unisk.zc.entitys;

import java.util.Date;

public class Roles extends BaseQuery<Roles> {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.ID
	 * 
	 * @mbggenerated
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.ROLENAME
	 * 
	 * @mbggenerated
	 */
	private String rolename;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.ROLENO
	 * 
	 * @mbggenerated
	 */
	private String roleno;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.SORTCODE
	 * 
	 * @mbggenerated
	 */
	private Integer sortcode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.ALLOWDEL
	 * 
	 * @mbggenerated
	 */
	private Integer allowdel;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.ALLOWEDIT
	 * 
	 * @mbggenerated
	 */
	private Integer allowedit;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.REMARKS
	 * 
	 * @mbggenerated
	 */
	private String remarks;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.DELMARK
	 * 
	 * @mbggenerated
	 */
	private Integer delmark;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.CREATETIME
	 * 
	 * @mbggenerated
	 */
	private Date createtime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.CREATEUSERID
	 * 
	 * @mbggenerated
	 */
	private Integer createuserid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.MODIFYTIME
	 * 
	 * @mbggenerated
	 */
	private Date modifytime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column TB_D_ROLES.MODIFYUSERID
	 * 
	 * @mbggenerated
	 */
	private Integer modifyuserid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.ID
	 * 
	 * @return the value of TB_D_ROLES.ID
	 * 
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.ID
	 * 
	 * @param id
	 *            the value for TB_D_ROLES.ID
	 * 
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.ROLENAME
	 * 
	 * @return the value of TB_D_ROLES.ROLENAME
	 * 
	 * @mbggenerated
	 */
	public String getRolename() {
		return rolename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.ROLENAME
	 * 
	 * @param rolename
	 *            the value for TB_D_ROLES.ROLENAME
	 * 
	 * @mbggenerated
	 */
	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.ROLENO
	 * 
	 * @return the value of TB_D_ROLES.ROLENO
	 * 
	 * @mbggenerated
	 */
	public String getRoleno() {
		return roleno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.ROLENO
	 * 
	 * @param roleno
	 *            the value for TB_D_ROLES.ROLENO
	 * 
	 * @mbggenerated
	 */
	public void setRoleno(String roleno) {
		this.roleno = roleno == null ? null : roleno.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.SORTCODE
	 * 
	 * @return the value of TB_D_ROLES.SORTCODE
	 * 
	 * @mbggenerated
	 */
	public Integer getSortcode() {
		return sortcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.SORTCODE
	 * 
	 * @param sortcode
	 *            the value for TB_D_ROLES.SORTCODE
	 * 
	 * @mbggenerated
	 */
	public void setSortcode(Integer sortcode) {
		this.sortcode = sortcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.ALLOWDEL
	 * 
	 * @return the value of TB_D_ROLES.ALLOWDEL
	 * 
	 * @mbggenerated
	 */
	public Integer getAllowdel() {
		return allowdel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.ALLOWDEL
	 * 
	 * @param allowdel
	 *            the value for TB_D_ROLES.ALLOWDEL
	 * 
	 * @mbggenerated
	 */
	public void setAllowdel(Integer allowdel) {
		this.allowdel = allowdel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.ALLOWEDIT
	 * 
	 * @return the value of TB_D_ROLES.ALLOWEDIT
	 * 
	 * @mbggenerated
	 */
	public Integer getAllowedit() {
		return allowedit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.ALLOWEDIT
	 * 
	 * @param allowedit
	 *            the value for TB_D_ROLES.ALLOWEDIT
	 * 
	 * @mbggenerated
	 */
	public void setAllowedit(Integer allowedit) {
		this.allowedit = allowedit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.REMARKS
	 * 
	 * @return the value of TB_D_ROLES.REMARKS
	 * 
	 * @mbggenerated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.REMARKS
	 * 
	 * @param remarks
	 *            the value for TB_D_ROLES.REMARKS
	 * 
	 * @mbggenerated
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.DELMARK
	 * 
	 * @return the value of TB_D_ROLES.DELMARK
	 * 
	 * @mbggenerated
	 */
	public Integer getDelmark() {
		return delmark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.DELMARK
	 * 
	 * @param delmark
	 *            the value for TB_D_ROLES.DELMARK
	 * 
	 * @mbggenerated
	 */
	public void setDelmark(Integer delmark) {
		this.delmark = delmark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.CREATETIME
	 * 
	 * @return the value of TB_D_ROLES.CREATETIME
	 * 
	 * @mbggenerated
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.CREATETIME
	 * 
	 * @param createtime
	 *            the value for TB_D_ROLES.CREATETIME
	 * 
	 * @mbggenerated
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.CREATEUSERID
	 * 
	 * @return the value of TB_D_ROLES.CREATEUSERID
	 * 
	 * @mbggenerated
	 */
	public Integer getCreateuserid() {
		return createuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.CREATEUSERID
	 * 
	 * @param createuserid
	 *            the value for TB_D_ROLES.CREATEUSERID
	 * 
	 * @mbggenerated
	 */
	public void setCreateuserid(Integer createuserid) {
		this.createuserid = createuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.MODIFYTIME
	 * 
	 * @return the value of TB_D_ROLES.MODIFYTIME
	 * 
	 * @mbggenerated
	 */
	public Date getModifytime() {
		return modifytime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.MODIFYTIME
	 * 
	 * @param modifytime
	 *            the value for TB_D_ROLES.MODIFYTIME
	 * 
	 * @mbggenerated
	 */
	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column TB_D_ROLES.MODIFYUSERID
	 * 
	 * @return the value of TB_D_ROLES.MODIFYUSERID
	 * 
	 * @mbggenerated
	 */
	public Integer getModifyuserid() {
		return modifyuserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column TB_D_ROLES.MODIFYUSERID
	 * 
	 * @param modifyuserid
	 *            the value for TB_D_ROLES.MODIFYUSERID
	 * 
	 * @mbggenerated
	 */
	public void setModifyuserid(Integer modifyuserid) {
		this.modifyuserid = modifyuserid;
	}
}