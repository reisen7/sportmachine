package com.reisen.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 运动场地 YundongchangdiExample
 * @author fuce_自动生成
 * @date 2024-04-11 17:53:56
 */
public class YundongchangdiExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YundongchangdiExample() {
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
        
		
        public Criteria andChangdibianhaoIsNull() {
            addCriterion("changdibianhao is null");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoIsNotNull() {
            addCriterion("changdibianhao is not null");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoEqualTo(String value) {
            addCriterion("changdibianhao =", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoNotEqualTo(String value) {
            addCriterion("changdibianhao <>", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoGreaterThan(String value) {
            addCriterion("changdibianhao >", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("changdibianhao >=", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoLessThan(String value) {
            addCriterion("changdibianhao <", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoLessThanOrEqualTo(String value) {
            addCriterion("changdibianhao <=", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoLike(String value) {
            addCriterion("changdibianhao like", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoNotLike(String value) {
            addCriterion("changdibianhao not like", value, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoIn(List<String> values) {
            addCriterion("changdibianhao in", values, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoNotIn(List<String> values) {
            addCriterion("changdibianhao not in", values, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoBetween(String value1, String value2) {
            addCriterion("changdibianhao between", value1, value2, "changdibianhao");
            return (Criteria) this;
        }

        public Criteria andChangdibianhaoNotBetween(String value1, String value2) {
            addCriterion("changdibianhao not between", value1, value2, "changdibianhao");
            return (Criteria) this;
        }
        
		
        public Criteria andChangdimingchengIsNull() {
            addCriterion("changdimingcheng is null");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengIsNotNull() {
            addCriterion("changdimingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengEqualTo(String value) {
            addCriterion("changdimingcheng =", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengNotEqualTo(String value) {
            addCriterion("changdimingcheng <>", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengGreaterThan(String value) {
            addCriterion("changdimingcheng >", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("changdimingcheng >=", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengLessThan(String value) {
            addCriterion("changdimingcheng <", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengLessThanOrEqualTo(String value) {
            addCriterion("changdimingcheng <=", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengLike(String value) {
            addCriterion("changdimingcheng like", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengNotLike(String value) {
            addCriterion("changdimingcheng not like", value, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengIn(List<String> values) {
            addCriterion("changdimingcheng in", values, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengNotIn(List<String> values) {
            addCriterion("changdimingcheng not in", values, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengBetween(String value1, String value2) {
            addCriterion("changdimingcheng between", value1, value2, "changdimingcheng");
            return (Criteria) this;
        }

        public Criteria andChangdimingchengNotBetween(String value1, String value2) {
            addCriterion("changdimingcheng not between", value1, value2, "changdimingcheng");
            return (Criteria) this;
        }
        
		
        public Criteria andChangdileixingIsNull() {
            addCriterion("changdileixing is null");
            return (Criteria) this;
        }

        public Criteria andChangdileixingIsNotNull() {
            addCriterion("changdileixing is not null");
            return (Criteria) this;
        }

        public Criteria andChangdileixingEqualTo(String value) {
            addCriterion("changdileixing =", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingNotEqualTo(String value) {
            addCriterion("changdileixing <>", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingGreaterThan(String value) {
            addCriterion("changdileixing >", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingGreaterThanOrEqualTo(String value) {
            addCriterion("changdileixing >=", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingLessThan(String value) {
            addCriterion("changdileixing <", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingLessThanOrEqualTo(String value) {
            addCriterion("changdileixing <=", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingLike(String value) {
            addCriterion("changdileixing like", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingNotLike(String value) {
            addCriterion("changdileixing not like", value, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingIn(List<String> values) {
            addCriterion("changdileixing in", values, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingNotIn(List<String> values) {
            addCriterion("changdileixing not in", values, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingBetween(String value1, String value2) {
            addCriterion("changdileixing between", value1, value2, "changdileixing");
            return (Criteria) this;
        }

        public Criteria andChangdileixingNotBetween(String value1, String value2) {
            addCriterion("changdileixing not between", value1, value2, "changdileixing");
            return (Criteria) this;
        }
        
		
        public Criteria andWeizhiIsNull() {
            addCriterion("weizhi is null");
            return (Criteria) this;
        }

        public Criteria andWeizhiIsNotNull() {
            addCriterion("weizhi is not null");
            return (Criteria) this;
        }

        public Criteria andWeizhiEqualTo(String value) {
            addCriterion("weizhi =", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotEqualTo(String value) {
            addCriterion("weizhi <>", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiGreaterThan(String value) {
            addCriterion("weizhi >", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiGreaterThanOrEqualTo(String value) {
            addCriterion("weizhi >=", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLessThan(String value) {
            addCriterion("weizhi <", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLessThanOrEqualTo(String value) {
            addCriterion("weizhi <=", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiLike(String value) {
            addCriterion("weizhi like", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotLike(String value) {
            addCriterion("weizhi not like", value, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiIn(List<String> values) {
            addCriterion("weizhi in", values, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotIn(List<String> values) {
            addCriterion("weizhi not in", values, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiBetween(String value1, String value2) {
            addCriterion("weizhi between", value1, value2, "weizhi");
            return (Criteria) this;
        }

        public Criteria andWeizhiNotBetween(String value1, String value2) {
            addCriterion("weizhi not between", value1, value2, "weizhi");
            return (Criteria) this;
        }
        
		
        public Criteria andZulindanjiaIsNull() {
            addCriterion("zulindanjia is null");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaIsNotNull() {
            addCriterion("zulindanjia is not null");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaEqualTo(Integer value) {
            addCriterion("zulindanjia =", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaNotEqualTo(Integer value) {
            addCriterion("zulindanjia <>", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaGreaterThan(Integer value) {
            addCriterion("zulindanjia >", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("zulindanjia >=", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaLessThan(Integer value) {
            addCriterion("zulindanjia <", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaLessThanOrEqualTo(Integer value) {
            addCriterion("zulindanjia <=", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaLike(Integer value) {
            addCriterion("zulindanjia like", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaNotLike(Integer value) {
            addCriterion("zulindanjia not like", value, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaIn(List<Integer> values) {
            addCriterion("zulindanjia in", values, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaNotIn(List<Integer> values) {
            addCriterion("zulindanjia not in", values, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaBetween(Integer value1, Integer value2) {
            addCriterion("zulindanjia between", value1, value2, "zulindanjia");
            return (Criteria) this;
        }

        public Criteria andZulindanjiaNotBetween(Integer value1, Integer value2) {
            addCriterion("zulindanjia not between", value1, value2, "zulindanjia");
            return (Criteria) this;
        }
        
		
        public Criteria andKeyueshijianIsNull() {
            addCriterion("keyueshijian is null");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianIsNotNull() {
            addCriterion("keyueshijian is not null");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianEqualTo(String value) {
            addCriterion("keyueshijian =", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianNotEqualTo(String value) {
            addCriterion("keyueshijian <>", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianGreaterThan(String value) {
            addCriterion("keyueshijian >", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianGreaterThanOrEqualTo(String value) {
            addCriterion("keyueshijian >=", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianLessThan(String value) {
            addCriterion("keyueshijian <", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianLessThanOrEqualTo(String value) {
            addCriterion("keyueshijian <=", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianLike(String value) {
            addCriterion("keyueshijian like", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianNotLike(String value) {
            addCriterion("keyueshijian not like", value, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianIn(List<String> values) {
            addCriterion("keyueshijian in", values, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianNotIn(List<String> values) {
            addCriterion("keyueshijian not in", values, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianBetween(String value1, String value2) {
            addCriterion("keyueshijian between", value1, value2, "keyueshijian");
            return (Criteria) this;
        }

        public Criteria andKeyueshijianNotBetween(String value1, String value2) {
            addCriterion("keyueshijian not between", value1, value2, "keyueshijian");
            return (Criteria) this;
        }
        
		
        public Criteria andLianxidianhuaIsNull() {
            addCriterion("lianxidianhua is null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNotNull() {
            addCriterion("lianxidianhua is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaEqualTo(String value) {
            addCriterion("lianxidianhua =", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotEqualTo(String value) {
            addCriterion("lianxidianhua <>", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThan(String value) {
            addCriterion("lianxidianhua >", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("lianxidianhua >=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThan(String value) {
            addCriterion("lianxidianhua <", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThanOrEqualTo(String value) {
            addCriterion("lianxidianhua <=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLike(String value) {
            addCriterion("lianxidianhua like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotLike(String value) {
            addCriterion("lianxidianhua not like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIn(List<String> values) {
            addCriterion("lianxidianhua in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotIn(List<String> values) {
            addCriterion("lianxidianhua not in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaBetween(String value1, String value2) {
            addCriterion("lianxidianhua between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotBetween(String value1, String value2) {
            addCriterion("lianxidianhua not between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }
        
		
        public Criteria andChangdixiangqingIsNull() {
            addCriterion("changdixiangqing is null");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingIsNotNull() {
            addCriterion("changdixiangqing is not null");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingEqualTo(String value) {
            addCriterion("changdixiangqing =", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingNotEqualTo(String value) {
            addCriterion("changdixiangqing <>", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingGreaterThan(String value) {
            addCriterion("changdixiangqing >", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingGreaterThanOrEqualTo(String value) {
            addCriterion("changdixiangqing >=", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingLessThan(String value) {
            addCriterion("changdixiangqing <", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingLessThanOrEqualTo(String value) {
            addCriterion("changdixiangqing <=", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingLike(String value) {
            addCriterion("changdixiangqing like", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingNotLike(String value) {
            addCriterion("changdixiangqing not like", value, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingIn(List<String> values) {
            addCriterion("changdixiangqing in", values, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingNotIn(List<String> values) {
            addCriterion("changdixiangqing not in", values, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingBetween(String value1, String value2) {
            addCriterion("changdixiangqing between", value1, value2, "changdixiangqing");
            return (Criteria) this;
        }

        public Criteria andChangdixiangqingNotBetween(String value1, String value2) {
            addCriterion("changdixiangqing not between", value1, value2, "changdixiangqing");
            return (Criteria) this;
        }
        
		
        public Criteria andChangditupianIsNull() {
            addCriterion("changditupian is null");
            return (Criteria) this;
        }

        public Criteria andChangditupianIsNotNull() {
            addCriterion("changditupian is not null");
            return (Criteria) this;
        }

        public Criteria andChangditupianEqualTo(String value) {
            addCriterion("changditupian =", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianNotEqualTo(String value) {
            addCriterion("changditupian <>", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianGreaterThan(String value) {
            addCriterion("changditupian >", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianGreaterThanOrEqualTo(String value) {
            addCriterion("changditupian >=", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianLessThan(String value) {
            addCriterion("changditupian <", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianLessThanOrEqualTo(String value) {
            addCriterion("changditupian <=", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianLike(String value) {
            addCriterion("changditupian like", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianNotLike(String value) {
            addCriterion("changditupian not like", value, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianIn(List<String> values) {
            addCriterion("changditupian in", values, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianNotIn(List<String> values) {
            addCriterion("changditupian not in", values, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianBetween(String value1, String value2) {
            addCriterion("changditupian between", value1, value2, "changditupian");
            return (Criteria) this;
        }

        public Criteria andChangditupianNotBetween(String value1, String value2) {
            addCriterion("changditupian not between", value1, value2, "changditupian");
            return (Criteria) this;
        }
        
		
        public Criteria andClicknumIsNull() {
            addCriterion("clicknum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("clicknum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("clicknum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("clicknum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("clicknum >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicknum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("clicknum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("clicknum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLike(Integer value) {
            addCriterion("clicknum like", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotLike(Integer value) {
            addCriterion("clicknum not like", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("clicknum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("clicknum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("clicknum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clicknum not between", value1, value2, "clicknum");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Yundongchangdi record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getAddtime()!=null&&StrUtil.isNotEmpty(record.getAddtime().toString())) {
    			 list.add("ifnull(addtime,'')");
    		}
			if(record.getChangdibianhao()!=null&&StrUtil.isNotEmpty(record.getChangdibianhao().toString())) {
    			 list.add("ifnull(changdibianhao,'')");
    		}
			if(record.getChangdimingcheng()!=null&&StrUtil.isNotEmpty(record.getChangdimingcheng().toString())) {
    			 list.add("ifnull(changdimingcheng,'')");
    		}
			if(record.getChangdileixing()!=null&&StrUtil.isNotEmpty(record.getChangdileixing().toString())) {
    			 list.add("ifnull(changdileixing,'')");
    		}
			if(record.getWeizhi()!=null&&StrUtil.isNotEmpty(record.getWeizhi().toString())) {
    			 list.add("ifnull(weizhi,'')");
    		}
			if(record.getZulindanjia()!=null&&StrUtil.isNotEmpty(record.getZulindanjia().toString())) {
    			 list.add("ifnull(zulindanjia,'')");
    		}
			if(record.getKeyueshijian()!=null&&StrUtil.isNotEmpty(record.getKeyueshijian().toString())) {
    			 list.add("ifnull(keyueshijian,'')");
    		}
			if(record.getLianxidianhua()!=null&&StrUtil.isNotEmpty(record.getLianxidianhua().toString())) {
    			 list.add("ifnull(lianxidianhua,'')");
    		}
			if(record.getChangdixiangqing()!=null&&StrUtil.isNotEmpty(record.getChangdixiangqing().toString())) {
    			 list.add("ifnull(changdixiangqing,'')");
    		}
			if(record.getChangditupian()!=null&&StrUtil.isNotEmpty(record.getChangditupian().toString())) {
    			 list.add("ifnull(changditupian,'')");
    		}
			if(record.getClicknum()!=null&&StrUtil.isNotEmpty(record.getClicknum().toString())) {
    			 list.add("ifnull(clicknum,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getAddtime()!=null&&StrUtil.isNotEmpty(record.getAddtime().toString())) {
    			list2.add("'%"+record.getAddtime()+"%'");
    		}
			if(record.getChangdibianhao()!=null&&StrUtil.isNotEmpty(record.getChangdibianhao().toString())) {
    			list2.add("'%"+record.getChangdibianhao()+"%'");
    		}
			if(record.getChangdimingcheng()!=null&&StrUtil.isNotEmpty(record.getChangdimingcheng().toString())) {
    			list2.add("'%"+record.getChangdimingcheng()+"%'");
    		}
			if(record.getChangdileixing()!=null&&StrUtil.isNotEmpty(record.getChangdileixing().toString())) {
    			list2.add("'%"+record.getChangdileixing()+"%'");
    		}
			if(record.getWeizhi()!=null&&StrUtil.isNotEmpty(record.getWeizhi().toString())) {
    			list2.add("'%"+record.getWeizhi()+"%'");
    		}
			if(record.getZulindanjia()!=null&&StrUtil.isNotEmpty(record.getZulindanjia().toString())) {
    			list2.add("'%"+record.getZulindanjia()+"%'");
    		}
			if(record.getKeyueshijian()!=null&&StrUtil.isNotEmpty(record.getKeyueshijian().toString())) {
    			list2.add("'%"+record.getKeyueshijian()+"%'");
    		}
			if(record.getLianxidianhua()!=null&&StrUtil.isNotEmpty(record.getLianxidianhua().toString())) {
    			list2.add("'%"+record.getLianxidianhua()+"%'");
    		}
			if(record.getChangdixiangqing()!=null&&StrUtil.isNotEmpty(record.getChangdixiangqing().toString())) {
    			list2.add("'%"+record.getChangdixiangqing()+"%'");
    		}
			if(record.getChangditupian()!=null&&StrUtil.isNotEmpty(record.getChangditupian().toString())) {
    			list2.add("'%"+record.getChangditupian()+"%'");
    		}
			if(record.getClicknum()!=null&&StrUtil.isNotEmpty(record.getClicknum().toString())) {
    			list2.add("'%"+record.getClicknum()+"%'");
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
    		list.add("ifnull(changdibianhao,'')");
    		list.add("ifnull(changdimingcheng,'')");
    		list.add("ifnull(changdileixing,'')");
    		list.add("ifnull(weizhi,'')");
    		list.add("ifnull(zulindanjia,'')");
    		list.add("ifnull(keyueshijian,'')");
    		list.add("ifnull(lianxidianhua,'')");
    		list.add("ifnull(changdixiangqing,'')");
    		list.add("ifnull(changditupian,'')");
    		list.add("ifnull(clicknum,'')");
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