package com.unisk.zc.entitys;

import java.util.Date;

public class VoteTopicExtOptions extends BaseQuery<VoteTopicExtOptions> {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.VOTEID
     *
     * @mbggenerated
     */
    private Integer voteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.TOPICID
     *
     * @mbggenerated
     */
    private Integer topicid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.KINDS
     *
     * @mbggenerated
     */
    private Integer kinds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.OPTIONS
     *
     * @mbggenerated
     */
    private String options;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.OPTIONSIMG
     *
     * @mbggenerated
     */
    private String optionsimg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.SORTCODE
     *
     * @mbggenerated
     */
    private Integer sortcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.DELMARK
     *
     * @mbggenerated
     */
    private Byte delmark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.CREATETIME
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.MODIFYTIME
     *
     * @mbggenerated
     */
    private Date modifytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.CREATEUSERID
     *
     * @mbggenerated
     */
    private Integer createuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.MODIFYUSERID
     *
     * @mbggenerated
     */
    private Integer modifyuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.REMARKS
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_d_vote_topic_ext_options.OPTIONHTML
     *
     * @mbggenerated
     */
    private String optionhtml;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.ID
     *
     * @return the value of tb_d_vote_topic_ext_options.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.ID
     *
     * @param id the value for tb_d_vote_topic_ext_options.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.VOTEID
     *
     * @return the value of tb_d_vote_topic_ext_options.VOTEID
     *
     * @mbggenerated
     */
    public Integer getVoteid() {
        return voteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.VOTEID
     *
     * @param voteid the value for tb_d_vote_topic_ext_options.VOTEID
     *
     * @mbggenerated
     */
    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.TOPICID
     *
     * @return the value of tb_d_vote_topic_ext_options.TOPICID
     *
     * @mbggenerated
     */
    public Integer getTopicid() {
        return topicid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.TOPICID
     *
     * @param topicid the value for tb_d_vote_topic_ext_options.TOPICID
     *
     * @mbggenerated
     */
    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.KINDS
     *
     * @return the value of tb_d_vote_topic_ext_options.KINDS
     *
     * @mbggenerated
     */
    public Integer getKinds() {
        return kinds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.KINDS
     *
     * @param kinds the value for tb_d_vote_topic_ext_options.KINDS
     *
     * @mbggenerated
     */
    public void setKinds(Integer kinds) {
        this.kinds = kinds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.OPTIONS
     *
     * @return the value of tb_d_vote_topic_ext_options.OPTIONS
     *
     * @mbggenerated
     */
    public String getOptions() {
        return options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.OPTIONS
     *
     * @param options the value for tb_d_vote_topic_ext_options.OPTIONS
     *
     * @mbggenerated
     */
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.OPTIONSIMG
     *
     * @return the value of tb_d_vote_topic_ext_options.OPTIONSIMG
     *
     * @mbggenerated
     */
    public String getOptionsimg() {
        return optionsimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.OPTIONSIMG
     *
     * @param optionsimg the value for tb_d_vote_topic_ext_options.OPTIONSIMG
     *
     * @mbggenerated
     */
    public void setOptionsimg(String optionsimg) {
        this.optionsimg = optionsimg == null ? null : optionsimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.SORTCODE
     *
     * @return the value of tb_d_vote_topic_ext_options.SORTCODE
     *
     * @mbggenerated
     */
    public Integer getSortcode() {
        return sortcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.SORTCODE
     *
     * @param sortcode the value for tb_d_vote_topic_ext_options.SORTCODE
     *
     * @mbggenerated
     */
    public void setSortcode(Integer sortcode) {
        this.sortcode = sortcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.DELMARK
     *
     * @return the value of tb_d_vote_topic_ext_options.DELMARK
     *
     * @mbggenerated
     */
    public Byte getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.DELMARK
     *
     * @param delmark the value for tb_d_vote_topic_ext_options.DELMARK
     *
     * @mbggenerated
     */
    public void setDelmark(Byte delmark) {
        this.delmark = delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.CREATETIME
     *
     * @return the value of tb_d_vote_topic_ext_options.CREATETIME
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.CREATETIME
     *
     * @param createtime the value for tb_d_vote_topic_ext_options.CREATETIME
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.MODIFYTIME
     *
     * @return the value of tb_d_vote_topic_ext_options.MODIFYTIME
     *
     * @mbggenerated
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.MODIFYTIME
     *
     * @param modifytime the value for tb_d_vote_topic_ext_options.MODIFYTIME
     *
     * @mbggenerated
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.CREATEUSERID
     *
     * @return the value of tb_d_vote_topic_ext_options.CREATEUSERID
     *
     * @mbggenerated
     */
    public Integer getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.CREATEUSERID
     *
     * @param createuserid the value for tb_d_vote_topic_ext_options.CREATEUSERID
     *
     * @mbggenerated
     */
    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.MODIFYUSERID
     *
     * @return the value of tb_d_vote_topic_ext_options.MODIFYUSERID
     *
     * @mbggenerated
     */
    public Integer getModifyuserid() {
        return modifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.MODIFYUSERID
     *
     * @param modifyuserid the value for tb_d_vote_topic_ext_options.MODIFYUSERID
     *
     * @mbggenerated
     */
    public void setModifyuserid(Integer modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.REMARKS
     *
     * @return the value of tb_d_vote_topic_ext_options.REMARKS
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.REMARKS
     *
     * @param remarks the value for tb_d_vote_topic_ext_options.REMARKS
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_d_vote_topic_ext_options.OPTIONHTML
     *
     * @return the value of tb_d_vote_topic_ext_options.OPTIONHTML
     *
     * @mbggenerated
     */
    public String getOptionhtml() {
        return optionhtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_d_vote_topic_ext_options.OPTIONHTML
     *
     * @param optionhtml the value for tb_d_vote_topic_ext_options.OPTIONHTML
     *
     * @mbggenerated
     */
    public void setOptionhtml(String optionhtml) {
        this.optionhtml = optionhtml == null ? null : optionhtml.trim();
    }
}