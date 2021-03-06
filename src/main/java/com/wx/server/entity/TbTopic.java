package com.wx.server.entity;

import java.io.Serializable;
import java.util.Date;

public class TbTopic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.topic_name
     *
     * @mbg.generated
     */
    private String topicName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.topic_text
     *
     * @mbg.generated
     */
    private String topicText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.last_replay_user_id
     *
     * @mbg.generated
     */
    private Integer lastReplayUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.last_replay_time
     *
     * @mbg.generated
     */
    private Date lastReplayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.reply_count
     *
     * @mbg.generated
     */
    private Integer replyCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.click_count
     *
     * @mbg.generated
     */
    private Integer clickCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.keep_count
     *
     * @mbg.generated
     */
    private Integer keepCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.valid
     *
     * @mbg.generated
     */
    private Integer valid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_topic
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.id
     *
     * @return the value of tb_topic.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.id
     *
     * @param id the value for tb_topic.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.category_id
     *
     * @return the value of tb_topic.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.category_id
     *
     * @param categoryId the value for tb_topic.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.topic_name
     *
     * @return the value of tb_topic.topic_name
     *
     * @mbg.generated
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.topic_name
     *
     * @param topicName the value for tb_topic.topic_name
     *
     * @mbg.generated
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.topic_text
     *
     * @return the value of tb_topic.topic_text
     *
     * @mbg.generated
     */
    public String getTopicText() {
        return topicText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.topic_text
     *
     * @param topicText the value for tb_topic.topic_text
     *
     * @mbg.generated
     */
    public void setTopicText(String topicText) {
        this.topicText = topicText == null ? null : topicText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.create_time
     *
     * @return the value of tb_topic.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.create_time
     *
     * @param createTime the value for tb_topic.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.update_time
     *
     * @return the value of tb_topic.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.update_time
     *
     * @param updateTime the value for tb_topic.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.user_id
     *
     * @return the value of tb_topic.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.user_id
     *
     * @param userId the value for tb_topic.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.last_replay_user_id
     *
     * @return the value of tb_topic.last_replay_user_id
     *
     * @mbg.generated
     */
    public Integer getLastReplayUserId() {
        return lastReplayUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.last_replay_user_id
     *
     * @param lastReplayUserId the value for tb_topic.last_replay_user_id
     *
     * @mbg.generated
     */
    public void setLastReplayUserId(Integer lastReplayUserId) {
        this.lastReplayUserId = lastReplayUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.last_replay_time
     *
     * @return the value of tb_topic.last_replay_time
     *
     * @mbg.generated
     */
    public Date getLastReplayTime() {
        return lastReplayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.last_replay_time
     *
     * @param lastReplayTime the value for tb_topic.last_replay_time
     *
     * @mbg.generated
     */
    public void setLastReplayTime(Date lastReplayTime) {
        this.lastReplayTime = lastReplayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.reply_count
     *
     * @return the value of tb_topic.reply_count
     *
     * @mbg.generated
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.reply_count
     *
     * @param replyCount the value for tb_topic.reply_count
     *
     * @mbg.generated
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.click_count
     *
     * @return the value of tb_topic.click_count
     *
     * @mbg.generated
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.click_count
     *
     * @param clickCount the value for tb_topic.click_count
     *
     * @mbg.generated
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.keep_count
     *
     * @return the value of tb_topic.keep_count
     *
     * @mbg.generated
     */
    public Integer getKeepCount() {
        return keepCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.keep_count
     *
     * @param keepCount the value for tb_topic.keep_count
     *
     * @mbg.generated
     */
    public void setKeepCount(Integer keepCount) {
        this.keepCount = keepCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.valid
     *
     * @return the value of tb_topic.valid
     *
     * @mbg.generated
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.valid
     *
     * @param valid the value for tb_topic.valid
     *
     * @mbg.generated
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }
}