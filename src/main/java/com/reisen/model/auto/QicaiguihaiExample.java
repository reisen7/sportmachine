package com.reisen.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 器材归还 QicaiguihaiExample
 * @author fuce_自动生成
 * @date 2024-04-11 18:06:09
 */
public class QicaiguihaiExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QicaiguihaiExample() {
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
        
		
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(Long value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Long value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
		
        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(Date value) {
            addCriterion("addtime like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(Date value) {
            addCriterion("addtime not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }
        
		
        public Criteria andQicaimingchengIsNull() {
            addCriterion("qicaimingcheng is null");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengIsNotNull() {
            addCriterion("qicaimingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengEqualTo(String value) {
            addCriterion("qicaimingcheng =", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengNotEqualTo(String value) {
            addCriterion("qicaimingcheng <>", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengGreaterThan(String value) {
            addCriterion("qicaimingcheng >", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("qicaimingcheng >=", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengLessThan(String value) {
            addCriterion("qicaimingcheng <", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengLessThanOrEqualTo(String value) {
            addCriterion("qicaimingcheng <=", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengLike(String value) {
            addCriterion("qicaimingcheng like", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengNotLike(String value) {
            addCriterion("qicaimingcheng not like", value, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengIn(List<String> values) {
            addCriterion("qicaimingcheng in", values, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengNotIn(List<String> values) {
            addCriterion("qicaimingcheng not in", values, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengBetween(String value1, String value2) {
            addCriterion("qicaimingcheng between", value1, value2, "qicaimingcheng");
            return (Criteria) this;
        }

        public Criteria andQicaimingchengNotBetween(String value1, String value2) {
            addCriterion("qicaimingcheng not between", value1, value2, "qicaimingcheng");
            return (Criteria) this;
        }
        
		
        public Criteria andQicaileixingIsNull() {
            addCriterion("qicaileixing is null");
            return (Criteria) this;
        }

        public Criteria andQicaileixingIsNotNull() {
            addCriterion("qicaileixing is not null");
            return (Criteria) this;
        }

        public Criteria andQicaileixingEqualTo(String value) {
            addCriterion("qicaileixing =", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingNotEqualTo(String value) {
            addCriterion("qicaileixing <>", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingGreaterThan(String value) {
            addCriterion("qicaileixing >", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingGreaterThanOrEqualTo(String value) {
            addCriterion("qicaileixing >=", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingLessThan(String value) {
            addCriterion("qicaileixing <", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingLessThanOrEqualTo(String value) {
            addCriterion("qicaileixing <=", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingLike(String value) {
            addCriterion("qicaileixing like", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingNotLike(String value) {
            addCriterion("qicaileixing not like", value, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingIn(List<String> values) {
            addCriterion("qicaileixing in", values, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingNotIn(List<String> values) {
            addCriterion("qicaileixing not in", values, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingBetween(String value1, String value2) {
            addCriterion("qicaileixing between", value1, value2, "qicaileixing");
            return (Criteria) this;
        }

        public Criteria andQicaileixingNotBetween(String value1, String value2) {
            addCriterion("qicaileixing not between", value1, value2, "qicaileixing");
            return (Criteria) this;
        }
        
		
        public Criteria andGuigeIsNull() {
            addCriterion("guige is null");
            return (Criteria) this;
        }

        public Criteria andGuigeIsNotNull() {
            addCriterion("guige is not null");
            return (Criteria) this;
        }

        public Criteria andGuigeEqualTo(String value) {
            addCriterion("guige =", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotEqualTo(String value) {
            addCriterion("guige <>", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeGreaterThan(String value) {
            addCriterion("guige >", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("guige >=", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLessThan(String value) {
            addCriterion("guige <", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLessThanOrEqualTo(String value) {
            addCriterion("guige <=", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeLike(String value) {
            addCriterion("guige like", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotLike(String value) {
            addCriterion("guige not like", value, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeIn(List<String> values) {
            addCriterion("guige in", values, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotIn(List<String> values) {
            addCriterion("guige not in", values, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeBetween(String value1, String value2) {
            addCriterion("guige between", value1, value2, "guige");
            return (Criteria) this;
        }

        public Criteria andGuigeNotBetween(String value1, String value2) {
            addCriterion("guige not between", value1, value2, "guige");
            return (Criteria) this;
        }
        
		
        public Criteria andJieyongbianhaoIsNull() {
            addCriterion("jieyongbianhao is null");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoIsNotNull() {
            addCriterion("jieyongbianhao is not null");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoEqualTo(String value) {
            addCriterion("jieyongbianhao =", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoNotEqualTo(String value) {
            addCriterion("jieyongbianhao <>", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoGreaterThan(String value) {
            addCriterion("jieyongbianhao >", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("jieyongbianhao >=", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoLessThan(String value) {
            addCriterion("jieyongbianhao <", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoLessThanOrEqualTo(String value) {
            addCriterion("jieyongbianhao <=", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoLike(String value) {
            addCriterion("jieyongbianhao like", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoNotLike(String value) {
            addCriterion("jieyongbianhao not like", value, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoIn(List<String> values) {
            addCriterion("jieyongbianhao in", values, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoNotIn(List<String> values) {
            addCriterion("jieyongbianhao not in", values, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoBetween(String value1, String value2) {
            addCriterion("jieyongbianhao between", value1, value2, "jieyongbianhao");
            return (Criteria) this;
        }

        public Criteria andJieyongbianhaoNotBetween(String value1, String value2) {
            addCriterion("jieyongbianhao not between", value1, value2, "jieyongbianhao");
            return (Criteria) this;
        }
        
		
        public Criteria andZhuyishixiangIsNull() {
            addCriterion("zhuyishixiang is null");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangIsNotNull() {
            addCriterion("zhuyishixiang is not null");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangEqualTo(String value) {
            addCriterion("zhuyishixiang =", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangNotEqualTo(String value) {
            addCriterion("zhuyishixiang <>", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangGreaterThan(String value) {
            addCriterion("zhuyishixiang >", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangGreaterThanOrEqualTo(String value) {
            addCriterion("zhuyishixiang >=", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangLessThan(String value) {
            addCriterion("zhuyishixiang <", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangLessThanOrEqualTo(String value) {
            addCriterion("zhuyishixiang <=", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangLike(String value) {
            addCriterion("zhuyishixiang like", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangNotLike(String value) {
            addCriterion("zhuyishixiang not like", value, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangIn(List<String> values) {
            addCriterion("zhuyishixiang in", values, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangNotIn(List<String> values) {
            addCriterion("zhuyishixiang not in", values, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangBetween(String value1, String value2) {
            addCriterion("zhuyishixiang between", value1, value2, "zhuyishixiang");
            return (Criteria) this;
        }

        public Criteria andZhuyishixiangNotBetween(String value1, String value2) {
            addCriterion("zhuyishixiang not between", value1, value2, "zhuyishixiang");
            return (Criteria) this;
        }
        
		
        public Criteria andShuliangIsNull() {
            addCriterion("shuliang is null");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNotNull() {
            addCriterion("shuliang is not null");
            return (Criteria) this;
        }

        public Criteria andShuliangEqualTo(Integer value) {
            addCriterion("shuliang =", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotEqualTo(Integer value) {
            addCriterion("shuliang <>", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThan(Integer value) {
            addCriterion("shuliang >", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuliang >=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThan(Integer value) {
            addCriterion("shuliang <", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThanOrEqualTo(Integer value) {
            addCriterion("shuliang <=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLike(Integer value) {
            addCriterion("shuliang like", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotLike(Integer value) {
            addCriterion("shuliang not like", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangIn(List<Integer> values) {
            addCriterion("shuliang in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotIn(List<Integer> values) {
            addCriterion("shuliang not in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangBetween(Integer value1, Integer value2) {
            addCriterion("shuliang between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotBetween(Integer value1, Integer value2) {
            addCriterion("shuliang not between", value1, value2, "shuliang");
            return (Criteria) this;
        }
        
		
        public Criteria andZhanghaoIsNull() {
            addCriterion("zhanghao is null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoIsNotNull() {
            addCriterion("zhanghao is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoEqualTo(String value) {
            addCriterion("zhanghao =", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotEqualTo(String value) {
            addCriterion("zhanghao <>", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoGreaterThan(String value) {
            addCriterion("zhanghao >", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhanghao >=", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLessThan(String value) {
            addCriterion("zhanghao <", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLessThanOrEqualTo(String value) {
            addCriterion("zhanghao <=", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLike(String value) {
            addCriterion("zhanghao like", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotLike(String value) {
            addCriterion("zhanghao not like", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoIn(List<String> values) {
            addCriterion("zhanghao in", values, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotIn(List<String> values) {
            addCriterion("zhanghao not in", values, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoBetween(String value1, String value2) {
            addCriterion("zhanghao between", value1, value2, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotBetween(String value1, String value2) {
            addCriterion("zhanghao not between", value1, value2, "zhanghao");
            return (Criteria) this;
        }
        
		
        public Criteria andXingmingIsNull() {
            addCriterion("xingming is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("xingming is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("xingming =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("xingming <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("xingming >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("xingming >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("xingming <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("xingming <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("xingming like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("xingming not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("xingming in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("xingming not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("xingming between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("xingming not between", value1, value2, "xingming");
            return (Criteria) this;
        }
        
		
        public Criteria andShoujiIsNull() {
            addCriterion("shouji is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("shouji is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("shouji =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("shouji <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("shouji >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("shouji >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("shouji <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("shouji <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("shouji like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("shouji not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("shouji in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("shouji not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("shouji between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("shouji not between", value1, value2, "shouji");
            return (Criteria) this;
        }
        
		
        public Criteria andGuihaishijianIsNull() {
            addCriterion("guihaishijian is null");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianIsNotNull() {
            addCriterion("guihaishijian is not null");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianEqualTo(Date value) {
            addCriterion("guihaishijian =", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianNotEqualTo(Date value) {
            addCriterion("guihaishijian <>", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianGreaterThan(Date value) {
            addCriterion("guihaishijian >", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("guihaishijian >=", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianLessThan(Date value) {
            addCriterion("guihaishijian <", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianLessThanOrEqualTo(Date value) {
            addCriterion("guihaishijian <=", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianLike(Date value) {
            addCriterion("guihaishijian like", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianNotLike(Date value) {
            addCriterion("guihaishijian not like", value, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianIn(List<Date> values) {
            addCriterion("guihaishijian in", values, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianNotIn(List<Date> values) {
            addCriterion("guihaishijian not in", values, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianBetween(Date value1, Date value2) {
            addCriterion("guihaishijian between", value1, value2, "guihaishijian");
            return (Criteria) this;
        }

        public Criteria andGuihaishijianNotBetween(Date value1, Date value2) {
            addCriterion("guihaishijian not between", value1, value2, "guihaishijian");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Qicaiguihai record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getAddtime()!=null&&StrUtil.isNotEmpty(record.getAddtime().toString())) {
    			 list.add("ifnull(addtime,'')");
    		}
			if(record.getQicaimingcheng()!=null&&StrUtil.isNotEmpty(record.getQicaimingcheng().toString())) {
    			 list.add("ifnull(qicaimingcheng,'')");
    		}
			if(record.getQicaileixing()!=null&&StrUtil.isNotEmpty(record.getQicaileixing().toString())) {
    			 list.add("ifnull(qicaileixing,'')");
    		}
			if(record.getGuige()!=null&&StrUtil.isNotEmpty(record.getGuige().toString())) {
    			 list.add("ifnull(guige,'')");
    		}
			if(record.getJieyongbianhao()!=null&&StrUtil.isNotEmpty(record.getJieyongbianhao().toString())) {
    			 list.add("ifnull(jieyongbianhao,'')");
    		}
			if(record.getZhuyishixiang()!=null&&StrUtil.isNotEmpty(record.getZhuyishixiang().toString())) {
    			 list.add("ifnull(zhuyishixiang,'')");
    		}
			if(record.getShuliang()!=null&&StrUtil.isNotEmpty(record.getShuliang().toString())) {
    			 list.add("ifnull(shuliang,'')");
    		}
			if(record.getZhanghao()!=null&&StrUtil.isNotEmpty(record.getZhanghao().toString())) {
    			 list.add("ifnull(zhanghao,'')");
    		}
			if(record.getXingming()!=null&&StrUtil.isNotEmpty(record.getXingming().toString())) {
    			 list.add("ifnull(xingming,'')");
    		}
			if(record.getShouji()!=null&&StrUtil.isNotEmpty(record.getShouji().toString())) {
    			 list.add("ifnull(shouji,'')");
    		}
			if(record.getGuihaishijian()!=null&&StrUtil.isNotEmpty(record.getGuihaishijian().toString())) {
    			 list.add("ifnull(guihaishijian,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getAddtime()!=null&&StrUtil.isNotEmpty(record.getAddtime().toString())) {
    			list2.add("'%"+record.getAddtime()+"%'");
    		}
			if(record.getQicaimingcheng()!=null&&StrUtil.isNotEmpty(record.getQicaimingcheng().toString())) {
    			list2.add("'%"+record.getQicaimingcheng()+"%'");
    		}
			if(record.getQicaileixing()!=null&&StrUtil.isNotEmpty(record.getQicaileixing().toString())) {
    			list2.add("'%"+record.getQicaileixing()+"%'");
    		}
			if(record.getGuige()!=null&&StrUtil.isNotEmpty(record.getGuige().toString())) {
    			list2.add("'%"+record.getGuige()+"%'");
    		}
			if(record.getJieyongbianhao()!=null&&StrUtil.isNotEmpty(record.getJieyongbianhao().toString())) {
    			list2.add("'%"+record.getJieyongbianhao()+"%'");
    		}
			if(record.getZhuyishixiang()!=null&&StrUtil.isNotEmpty(record.getZhuyishixiang().toString())) {
    			list2.add("'%"+record.getZhuyishixiang()+"%'");
    		}
			if(record.getShuliang()!=null&&StrUtil.isNotEmpty(record.getShuliang().toString())) {
    			list2.add("'%"+record.getShuliang()+"%'");
    		}
			if(record.getZhanghao()!=null&&StrUtil.isNotEmpty(record.getZhanghao().toString())) {
    			list2.add("'%"+record.getZhanghao()+"%'");
    		}
			if(record.getXingming()!=null&&StrUtil.isNotEmpty(record.getXingming().toString())) {
    			list2.add("'%"+record.getXingming()+"%'");
    		}
			if(record.getShouji()!=null&&StrUtil.isNotEmpty(record.getShouji().toString())) {
    			list2.add("'%"+record.getShouji()+"%'");
    		}
			if(record.getGuihaishijian()!=null&&StrUtil.isNotEmpty(record.getGuihaishijian().toString())) {
    			list2.add("'%"+record.getGuihaishijian()+"%'");
    		}
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join(",",list));
        	buffer.append(")");
        	buffer.append(" like CONCAT(");
        	buffer.append(StrUtil.join(",",list2));
        	buffer.append(")");
        	if(!" CONCAT() like CONCAT()".equals(buffer.toString())) {
        		addCriterion(buffer.toString());
        	}
        	return (Criteria) this;
        }
        
        public Criteria andLikeQuery2(String searchText) {
		 	List<String> list= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
    		list.add("ifnull(id,'')");
    		list.add("ifnull(addtime,'')");
    		list.add("ifnull(qicaimingcheng,'')");
    		list.add("ifnull(qicaileixing,'')");
    		list.add("ifnull(guige,'')");
    		list.add("ifnull(jieyongbianhao,'')");
    		list.add("ifnull(zhuyishixiang,'')");
    		list.add("ifnull(shuliang,'')");
    		list.add("ifnull(zhanghao,'')");
    		list.add("ifnull(xingming,'')");
    		list.add("ifnull(shouji,'')");
    		list.add("ifnull(guihaishijian,'')");
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join(",",list));
        	buffer.append(")");
        	buffer.append("like '%");
        	buffer.append(searchText);
        	buffer.append("%'");
        	addCriterion(buffer.toString());
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