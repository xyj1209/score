package org.javatribe.score.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ScoreExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andJudgeIdIsNull() {
            addCriterion("judge_id is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIsNotNull() {
            addCriterion("judge_id is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdEqualTo(Integer value) {
            addCriterion("judge_id =", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotEqualTo(Integer value) {
            addCriterion("judge_id <>", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThan(Integer value) {
            addCriterion("judge_id >", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_id >=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThan(Integer value) {
            addCriterion("judge_id <", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("judge_id <=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIn(List<Integer> values) {
            addCriterion("judge_id in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotIn(List<Integer> values) {
            addCriterion("judge_id not in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdBetween(Integer value1, Integer value2) {
            addCriterion("judge_id between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_id not between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andScoreNumIsNull() {
            addCriterion("score_num is null");
            return (Criteria) this;
        }

        public Criteria andScoreNumIsNotNull() {
            addCriterion("score_num is not null");
            return (Criteria) this;
        }

        public Criteria andScoreNumEqualTo(Double value) {
            addCriterion("score_num =", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumNotEqualTo(Double value) {
            addCriterion("score_num <>", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumGreaterThan(Double value) {
            addCriterion("score_num >", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumGreaterThanOrEqualTo(Double value) {
            addCriterion("score_num >=", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumLessThan(Double value) {
            addCriterion("score_num <", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumLessThanOrEqualTo(Double value) {
            addCriterion("score_num <=", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumIn(List<Double> values) {
            addCriterion("score_num in", values, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumNotIn(List<Double> values) {
            addCriterion("score_num not in", values, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumBetween(Double value1, Double value2) {
            addCriterion("score_num between", value1, value2, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumNotBetween(Double value1, Double value2) {
            addCriterion("score_num not between", value1, value2, "scoreNum");
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