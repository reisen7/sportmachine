package com.reisen.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 取消预约 QuxiaoyuyueExample
 * @author fuce_自动生成
 * @date 2024-04-11 18:18:51
 */
public class QuxiaoyuyueExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuxiaoyuyueExample() {
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
        
		
        public Criteria andZuyongshizhangIsNull() {
            addCriterion("zuyongshizhang is null");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangIsNotNull() {
            addCriterion("zuyongshizhang is not null");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangEqualTo(Integer value) {
            addCriterion("zuyongshizhang =", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangNotEqualTo(Integer value) {
            addCriterion("zuyongshizhang <>", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangGreaterThan(Integer value) {
            addCriterion("zuyongshizhang >", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangGreaterThanOrEqualTo(Integer value) {
            addCriterion("zuyongshizhang >=", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangLessThan(Integer value) {
            addCriterion("zuyongshizhang <", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangLessThanOrEqualTo(Integer value) {
            addCriterion("zuyongshizhang <=", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangLike(Integer value) {
            addCriterion("zuyongshizhang like", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangNotLike(Integer value) {
            addCriterion("zuyongshizhang not like", value, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangIn(List<Integer> values) {
            addCriterion("zuyongshizhang in", values, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangNotIn(List<Integer> values) {
            addCriterion("zuyongshizhang not in", values, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangBetween(Integer value1, Integer value2) {
            addCriterion("zuyongshizhang between", value1, value2, "zuyongshizhang");
            return (Criteria) this;
        }

        public Criteria andZuyongshizhangNotBetween(Integer value1, Integer value2) {
            addCriterion("zuyongshizhang not between", value1, value2, "zuyongshizhang");
            return (Criteria) this;
        }
        
		
        public Criteria andFeiyongIsNull() {
            addCriterion("feiyong is null");
            return (Criteria) this;
        }

        public Criteria andFeiyongIsNotNull() {
            addCriterion("feiyong is not null");
            return (Criteria) this;
        }

        public Criteria andFeiyongEqualTo(Integer value) {
            addCriterion("feiyong =", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongNotEqualTo(Integer value) {
            addCriterion("feiyong <>", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongGreaterThan(Integer value) {
            addCriterion("feiyong >", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongGreaterThanOrEqualTo(Integer value) {
            addCriterion("feiyong >=", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongLessThan(Integer value) {
            addCriterion("feiyong <", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongLessThanOrEqualTo(Integer value) {
            addCriterion("feiyong <=", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongLike(Integer value) {
            addCriterion("feiyong like", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongNotLike(Integer value) {
            addCriterion("feiyong not like", value, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongIn(List<Integer> values) {
            addCriterion("feiyong in", values, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongNotIn(List<Integer> values) {
            addCriterion("feiyong not in", values, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongBetween(Integer value1, Integer value2) {
            addCriterion("feiyong between", value1, value2, "feiyong");
            return (Criteria) this;
        }

        public Criteria andFeiyongNotBetween(Integer value1, Integer value2) {
            addCriterion("feiyong not between", value1, value2, "feiyong");
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
        
		
        public Criteria andShenfenzhengIsNull() {
            addCriterion("shenfenzheng is null");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIsNotNull() {
            addCriterion("shenfenzheng is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengEqualTo(String value) {
            addCriterion("shenfenzheng =", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotEqualTo(String value) {
            addCriterion("shenfenzheng <>", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengGreaterThan(String value) {
            addCriterion("shenfenzheng >", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengGreaterThanOrEqualTo(String value) {
            addCriterion("shenfenzheng >=", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLessThan(String value) {
            addCriterion("shenfenzheng <", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLessThanOrEqualTo(String value) {
            addCriterion("shenfenzheng <=", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengLike(String value) {
            addCriterion("shenfenzheng like", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotLike(String value) {
            addCriterion("shenfenzheng not like", value, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengIn(List<String> values) {
            addCriterion("shenfenzheng in", values, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotIn(List<String> values) {
            addCriterion("shenfenzheng not in", values, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengBetween(String value1, String value2) {
            addCriterion("shenfenzheng between", value1, value2, "shenfenzheng");
            return (Criteria) this;
        }

        public Criteria andShenfenzhengNotBetween(String value1, String value2) {
            addCriterion("shenfenzheng not between", value1, value2, "shenfenzheng");
            return (Criteria) this;
        }
        
		
        public Criteria andQuxiaoyuanyinIsNull() {
            addCriterion("quxiaoyuanyin is null");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinIsNotNull() {
            addCriterion("quxiaoyuanyin is not null");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinEqualTo(String value) {
            addCriterion("quxiaoyuanyin =", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinNotEqualTo(String value) {
            addCriterion("quxiaoyuanyin <>", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinGreaterThan(String value) {
            addCriterion("quxiaoyuanyin >", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinGreaterThanOrEqualTo(String value) {
            addCriterion("quxiaoyuanyin >=", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinLessThan(String value) {
            addCriterion("quxiaoyuanyin <", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinLessThanOrEqualTo(String value) {
            addCriterion("quxiaoyuanyin <=", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinLike(String value) {
            addCriterion("quxiaoyuanyin like", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinNotLike(String value) {
            addCriterion("quxiaoyuanyin not like", value, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinIn(List<String> values) {
            addCriterion("quxiaoyuanyin in", values, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinNotIn(List<String> values) {
            addCriterion("quxiaoyuanyin not in", values, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinBetween(String value1, String value2) {
            addCriterion("quxiaoyuanyin between", value1, value2, "quxiaoyuanyin");
            return (Criteria) this;
        }

        public Criteria andQuxiaoyuanyinNotBetween(String value1, String value2) {
            addCriterion("quxiaoyuanyin not between", value1, value2, "quxiaoyuanyin");
            return (Criteria) this;
        }
        
		
        public Criteria andDengjishijianIsNull() {
            addCriterion("dengjishijian is null");
            return (Criteria) this;
        }

        public Criteria andDengjishijianIsNotNull() {
            addCriterion("dengjishijian is not null");
            return (Criteria) this;
        }

        public Criteria andDengjishijianEqualTo(Date value) {
            addCriterion("dengjishijian =", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotEqualTo(Date value) {
            addCriterion("dengjishijian <>", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianGreaterThan(Date value) {
            addCriterion("dengjishijian >", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("dengjishijian >=", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianLessThan(Date value) {
            addCriterion("dengjishijian <", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianLessThanOrEqualTo(Date value) {
            addCriterion("dengjishijian <=", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianLike(Date value) {
            addCriterion("dengjishijian like", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotLike(Date value) {
            addCriterion("dengjishijian not like", value, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianIn(List<Date> values) {
            addCriterion("dengjishijian in", values, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotIn(List<Date> values) {
            addCriterion("dengjishijian not in", values, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianBetween(Date value1, Date value2) {
            addCriterion("dengjishijian between", value1, value2, "dengjishijian");
            return (Criteria) this;
        }

        public Criteria andDengjishijianNotBetween(Date value1, Date value2) {
            addCriterion("dengjishijian not between", value1, value2, "dengjishijian");
            return (Criteria) this;
        }
        
		
        public Criteria andSfshIsNull() {
            addCriterion("sfsh is null");
            return (Criteria) this;
        }

        public Criteria andSfshIsNotNull() {
            addCriterion("sfsh is not null");
            return (Criteria) this;
        }

        public Criteria andSfshEqualTo(String value) {
            addCriterion("sfsh =", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshNotEqualTo(String value) {
            addCriterion("sfsh <>", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshGreaterThan(String value) {
            addCriterion("sfsh >", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshGreaterThanOrEqualTo(String value) {
            addCriterion("sfsh >=", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshLessThan(String value) {
            addCriterion("sfsh <", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshLessThanOrEqualTo(String value) {
            addCriterion("sfsh <=", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshLike(String value) {
            addCriterion("sfsh like", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshNotLike(String value) {
            addCriterion("sfsh not like", value, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshIn(List<String> values) {
            addCriterion("sfsh in", values, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshNotIn(List<String> values) {
            addCriterion("sfsh not in", values, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshBetween(String value1, String value2) {
            addCriterion("sfsh between", value1, value2, "sfsh");
            return (Criteria) this;
        }

        public Criteria andSfshNotBetween(String value1, String value2) {
            addCriterion("sfsh not between", value1, value2, "sfsh");
            return (Criteria) this;
        }
        
		
        public Criteria andShhfIsNull() {
            addCriterion("shhf is null");
            return (Criteria) this;
        }

        public Criteria andShhfIsNotNull() {
            addCriterion("shhf is not null");
            return (Criteria) this;
        }

        public Criteria andShhfEqualTo(String value) {
            addCriterion("shhf =", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfNotEqualTo(String value) {
            addCriterion("shhf <>", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfGreaterThan(String value) {
            addCriterion("shhf >", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfGreaterThanOrEqualTo(String value) {
            addCriterion("shhf >=", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfLessThan(String value) {
            addCriterion("shhf <", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfLessThanOrEqualTo(String value) {
            addCriterion("shhf <=", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfLike(String value) {
            addCriterion("shhf like", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfNotLike(String value) {
            addCriterion("shhf not like", value, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfIn(List<String> values) {
            addCriterion("shhf in", values, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfNotIn(List<String> values) {
            addCriterion("shhf not in", values, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfBetween(String value1, String value2) {
            addCriterion("shhf between", value1, value2, "shhf");
            return (Criteria) this;
        }

        public Criteria andShhfNotBetween(String value1, String value2) {
            addCriterion("shhf not between", value1, value2, "shhf");
            return (Criteria) this;
        }
        
		
        public Criteria andYuyueDateIsNull() {
            addCriterion("yuyue_date is null");
            return (Criteria) this;
        }

        public Criteria andYuyueDateIsNotNull() {
            addCriterion("yuyue_date is not null");
            return (Criteria) this;
        }

        public Criteria andYuyueDateEqualTo(Date value) {
            addCriterion("yuyue_date =", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateNotEqualTo(Date value) {
            addCriterion("yuyue_date <>", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateGreaterThan(Date value) {
            addCriterion("yuyue_date >", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("yuyue_date >=", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateLessThan(Date value) {
            addCriterion("yuyue_date <", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateLessThanOrEqualTo(Date value) {
            addCriterion("yuyue_date <=", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateLike(Date value) {
            addCriterion("yuyue_date like", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateNotLike(Date value) {
            addCriterion("yuyue_date not like", value, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateIn(List<Date> values) {
            addCriterion("yuyue_date in", values, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateNotIn(List<Date> values) {
            addCriterion("yuyue_date not in", values, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateBetween(Date value1, Date value2) {
            addCriterion("yuyue_date between", value1, value2, "yuyueDate");
            return (Criteria) this;
        }

        public Criteria andYuyueDateNotBetween(Date value1, Date value2) {
            addCriterion("yuyue_date not between", value1, value2, "yuyueDate");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Quxiaoyuyue record) {
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
			if(record.getZuyongshizhang()!=null&&StrUtil.isNotEmpty(record.getZuyongshizhang().toString())) {
    			 list.add("ifnull(zuyongshizhang,'')");
    		}
			if(record.getFeiyong()!=null&&StrUtil.isNotEmpty(record.getFeiyong().toString())) {
    			 list.add("ifnull(feiyong,'')");
    		}
			if(record.getLianxidianhua()!=null&&StrUtil.isNotEmpty(record.getLianxidianhua().toString())) {
    			 list.add("ifnull(lianxidianhua,'')");
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
			if(record.getShenfenzheng()!=null&&StrUtil.isNotEmpty(record.getShenfenzheng().toString())) {
    			 list.add("ifnull(shenfenzheng,'')");
    		}
			if(record.getQuxiaoyuanyin()!=null&&StrUtil.isNotEmpty(record.getQuxiaoyuanyin().toString())) {
    			 list.add("ifnull(quxiaoyuanyin,'')");
    		}
			if(record.getDengjishijian()!=null&&StrUtil.isNotEmpty(record.getDengjishijian().toString())) {
    			 list.add("ifnull(dengjishijian,'')");
    		}
			if(record.getSfsh()!=null&&StrUtil.isNotEmpty(record.getSfsh().toString())) {
    			 list.add("ifnull(sfsh,'')");
    		}
			if(record.getShhf()!=null&&StrUtil.isNotEmpty(record.getShhf().toString())) {
    			 list.add("ifnull(shhf,'')");
    		}
			if(record.getYuyueDate()!=null&&StrUtil.isNotEmpty(record.getYuyueDate().toString())) {
    			 list.add("ifnull(yuyue_date,'')");
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
			if(record.getZuyongshizhang()!=null&&StrUtil.isNotEmpty(record.getZuyongshizhang().toString())) {
    			list2.add("'%"+record.getZuyongshizhang()+"%'");
    		}
			if(record.getFeiyong()!=null&&StrUtil.isNotEmpty(record.getFeiyong().toString())) {
    			list2.add("'%"+record.getFeiyong()+"%'");
    		}
			if(record.getLianxidianhua()!=null&&StrUtil.isNotEmpty(record.getLianxidianhua().toString())) {
    			list2.add("'%"+record.getLianxidianhua()+"%'");
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
			if(record.getShenfenzheng()!=null&&StrUtil.isNotEmpty(record.getShenfenzheng().toString())) {
    			list2.add("'%"+record.getShenfenzheng()+"%'");
    		}
			if(record.getQuxiaoyuanyin()!=null&&StrUtil.isNotEmpty(record.getQuxiaoyuanyin().toString())) {
    			list2.add("'%"+record.getQuxiaoyuanyin()+"%'");
    		}
			if(record.getDengjishijian()!=null&&StrUtil.isNotEmpty(record.getDengjishijian().toString())) {
    			list2.add("'%"+record.getDengjishijian()+"%'");
    		}
			if(record.getSfsh()!=null&&StrUtil.isNotEmpty(record.getSfsh().toString())) {
    			list2.add("'%"+record.getSfsh()+"%'");
    		}
			if(record.getShhf()!=null&&StrUtil.isNotEmpty(record.getShhf().toString())) {
    			list2.add("'%"+record.getShhf()+"%'");
    		}
			if(record.getYuyueDate()!=null&&StrUtil.isNotEmpty(record.getYuyueDate().toString())) {
    			list2.add("'%"+record.getYuyueDate()+"%'");
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
    		list.add("ifnull(zuyongshizhang,'')");
    		list.add("ifnull(feiyong,'')");
    		list.add("ifnull(lianxidianhua,'')");
    		list.add("ifnull(zhanghao,'')");
    		list.add("ifnull(xingming,'')");
    		list.add("ifnull(shouji,'')");
    		list.add("ifnull(shenfenzheng,'')");
    		list.add("ifnull(quxiaoyuanyin,'')");
    		list.add("ifnull(dengjishijian,'')");
    		list.add("ifnull(sfsh,'')");
    		list.add("ifnull(shhf,'')");
    		list.add("ifnull(yuyue_date,'')");
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