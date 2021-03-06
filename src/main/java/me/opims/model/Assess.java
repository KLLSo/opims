package me.opims.model;

import java.util.Date;

public class Assess {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assess.id_assess
     *
     * @mbggenerated
     */
    private Integer idAssess;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assess.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assess.assesser
     *
     * @mbggenerated
     */
    private String assesser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assess.time_assess
     *
     * @mbggenerated
     */
    private Date timeAssess;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assess.id_assess
     *
     * @return the value of assess.id_assess
     *
     * @mbggenerated
     */
    public Integer getIdAssess() {
        return idAssess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assess.id_assess
     *
     * @param idAssess the value for assess.id_assess
     *
     * @mbggenerated
     */
    public void setIdAssess(Integer idAssess) {
        this.idAssess = idAssess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assess.content
     *
     * @return the value of assess.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assess.content
     *
     * @param content the value for assess.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assess.assesser
     *
     * @return the value of assess.assesser
     *
     * @mbggenerated
     */
    public String getAssesser() {
        return assesser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assess.assesser
     *
     * @param assesser the value for assess.assesser
     *
     * @mbggenerated
     */
    public void setAssesser(String assesser) {
        this.assesser = assesser == null ? null : assesser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assess.time_assess
     *
     * @return the value of assess.time_assess
     *
     * @mbggenerated
     */
    public Date getTimeAssess() {
        return timeAssess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assess.time_assess
     *
     * @param timeAssess the value for assess.time_assess
     *
     * @mbggenerated
     */
    public void setTimeAssess(Date timeAssess) {
        this.timeAssess = timeAssess;
    }
}