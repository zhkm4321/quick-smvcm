package com.wx.server.entity;

import com.wx.server.vo.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TbTopicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNull() {
            addCriterion("topic_name is null");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNotNull() {
            addCriterion("topic_name is not null");
            return (Criteria) this;
        }

        public Criteria andTopicNameEqualTo(String value) {
            addCriterion("topic_name =", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotEqualTo(String value) {
            addCriterion("topic_name <>", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThan(String value) {
            addCriterion("topic_name >", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanOrEqualTo(String value) {
            addCriterion("topic_name >=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThan(String value) {
            addCriterion("topic_name <", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanOrEqualTo(String value) {
            addCriterion("topic_name <=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLike(String value) {
            addCriterion("topic_name like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotLike(String value) {
            addCriterion("topic_name not like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameIn(List<String> values) {
            addCriterion("topic_name in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotIn(List<String> values) {
            addCriterion("topic_name not in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameBetween(String value1, String value2) {
            addCriterion("topic_name between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotBetween(String value1, String value2) {
            addCriterion("topic_name not between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicTextIsNull() {
            addCriterion("topic_text is null");
            return (Criteria) this;
        }

        public Criteria andTopicTextIsNotNull() {
            addCriterion("topic_text is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTextEqualTo(String value) {
            addCriterion("topic_text =", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextNotEqualTo(String value) {
            addCriterion("topic_text <>", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextGreaterThan(String value) {
            addCriterion("topic_text >", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextGreaterThanOrEqualTo(String value) {
            addCriterion("topic_text >=", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextLessThan(String value) {
            addCriterion("topic_text <", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextLessThanOrEqualTo(String value) {
            addCriterion("topic_text <=", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextLike(String value) {
            addCriterion("topic_text like", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextNotLike(String value) {
            addCriterion("topic_text not like", value, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextIn(List<String> values) {
            addCriterion("topic_text in", values, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextNotIn(List<String> values) {
            addCriterion("topic_text not in", values, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextBetween(String value1, String value2) {
            addCriterion("topic_text between", value1, value2, "topicText");
            return (Criteria) this;
        }

        public Criteria andTopicTextNotBetween(String value1, String value2) {
            addCriterion("topic_text not between", value1, value2, "topicText");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdIsNull() {
            addCriterion("last_replay_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdIsNotNull() {
            addCriterion("last_replay_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdEqualTo(Integer value) {
            addCriterion("last_replay_user_id =", value, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdNotEqualTo(Integer value) {
            addCriterion("last_replay_user_id <>", value, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdGreaterThan(Integer value) {
            addCriterion("last_replay_user_id >", value, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_replay_user_id >=", value, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdLessThan(Integer value) {
            addCriterion("last_replay_user_id <", value, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_replay_user_id <=", value, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdIn(List<Integer> values) {
            addCriterion("last_replay_user_id in", values, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdNotIn(List<Integer> values) {
            addCriterion("last_replay_user_id not in", values, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdBetween(Integer value1, Integer value2) {
            addCriterion("last_replay_user_id between", value1, value2, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_replay_user_id not between", value1, value2, "lastReplayUserId");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeIsNull() {
            addCriterion("last_replay_time is null");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeIsNotNull() {
            addCriterion("last_replay_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeEqualTo(Date value) {
            addCriterion("last_replay_time =", value, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeNotEqualTo(Date value) {
            addCriterion("last_replay_time <>", value, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeGreaterThan(Date value) {
            addCriterion("last_replay_time >", value, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_replay_time >=", value, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeLessThan(Date value) {
            addCriterion("last_replay_time <", value, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_replay_time <=", value, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeIn(List<Date> values) {
            addCriterion("last_replay_time in", values, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeNotIn(List<Date> values) {
            addCriterion("last_replay_time not in", values, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeBetween(Date value1, Date value2) {
            addCriterion("last_replay_time between", value1, value2, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andLastReplayTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_replay_time not between", value1, value2, "lastReplayTime");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNull() {
            addCriterion("reply_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNotNull() {
            addCriterion("reply_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCountEqualTo(Integer value) {
            addCriterion("reply_count =", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotEqualTo(Integer value) {
            addCriterion("reply_count <>", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThan(Integer value) {
            addCriterion("reply_count >", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_count >=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThan(Integer value) {
            addCriterion("reply_count <", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("reply_count <=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIn(List<Integer> values) {
            addCriterion("reply_count in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotIn(List<Integer> values) {
            addCriterion("reply_count not in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("reply_count between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_count not between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Integer value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Integer value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Integer value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Integer> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountIsNull() {
            addCriterion("keep_count is null");
            return (Criteria) this;
        }

        public Criteria andKeepCountIsNotNull() {
            addCriterion("keep_count is not null");
            return (Criteria) this;
        }

        public Criteria andKeepCountEqualTo(Integer value) {
            addCriterion("keep_count =", value, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountNotEqualTo(Integer value) {
            addCriterion("keep_count <>", value, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountGreaterThan(Integer value) {
            addCriterion("keep_count >", value, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("keep_count >=", value, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountLessThan(Integer value) {
            addCriterion("keep_count <", value, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountLessThanOrEqualTo(Integer value) {
            addCriterion("keep_count <=", value, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountIn(List<Integer> values) {
            addCriterion("keep_count in", values, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountNotIn(List<Integer> values) {
            addCriterion("keep_count not in", values, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountBetween(Integer value1, Integer value2) {
            addCriterion("keep_count between", value1, value2, "keepCount");
            return (Criteria) this;
        }

        public Criteria andKeepCountNotBetween(Integer value1, Integer value2) {
            addCriterion("keep_count not between", value1, value2, "keepCount");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}