package com.reisen.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 器材报修 TbreportrecordExample
 * @author fuce_自动生成
 * @date 2024-05-31 02:40:35
 */
public class TbreportrecordExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbreportrecordExample() {
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

        public Criteria andIdLike(Integer value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Integer value) {
            addCriterion("id not like", value, "id");
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
        
		
        public Criteria andEquimentidIsNull() {
            addCriterion("equimentid is null");
            return (Criteria) this;
        }

        public Criteria andEquimentidIsNotNull() {
            addCriterion("equimentid is not null");
            return (Criteria) this;
        }

        public Criteria andEquimentidEqualTo(Integer value) {
            addCriterion("equimentid =", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotEqualTo(Integer value) {
            addCriterion("equimentid <>", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidGreaterThan(Integer value) {
            addCriterion("equimentid >", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equimentid >=", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidLessThan(Integer value) {
            addCriterion("equimentid <", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidLessThanOrEqualTo(Integer value) {
            addCriterion("equimentid <=", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidLike(Integer value) {
            addCriterion("equimentid like", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotLike(Integer value) {
            addCriterion("equimentid not like", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidIn(List<Integer> values) {
            addCriterion("equimentid in", values, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotIn(List<Integer> values) {
            addCriterion("equimentid not in", values, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidBetween(Integer value1, Integer value2) {
            addCriterion("equimentid between", value1, value2, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotBetween(Integer value1, Integer value2) {
            addCriterion("equimentid not between", value1, value2, "equimentid");
            return (Criteria) this;
        }
        
		
        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }
        
		
        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }
        
		
        public Criteria andReportdateIsNull() {
            addCriterion("reportdate is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("reportdate is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(Date value) {
            addCriterion("reportdate =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(Date value) {
            addCriterion("reportdate <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(Date value) {
            addCriterion("reportdate >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(Date value) {
            addCriterion("reportdate >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(Date value) {
            addCriterion("reportdate <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(Date value) {
            addCriterion("reportdate <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLike(Date value) {
            addCriterion("reportdate like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotLike(Date value) {
            addCriterion("reportdate not like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<Date> values) {
            addCriterion("reportdate in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<Date> values) {
            addCriterion("reportdate not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(Date value1, Date value2) {
            addCriterion("reportdate between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(Date value1, Date value2) {
            addCriterion("reportdate not between", value1, value2, "reportdate");
            return (Criteria) this;
        }
        
		
        public Criteria andProblemdesIsNull() {
            addCriterion("problemdes is null");
            return (Criteria) this;
        }

        public Criteria andProblemdesIsNotNull() {
            addCriterion("problemdes is not null");
            return (Criteria) this;
        }

        public Criteria andProblemdesEqualTo(String value) {
            addCriterion("problemdes =", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesNotEqualTo(String value) {
            addCriterion("problemdes <>", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesGreaterThan(String value) {
            addCriterion("problemdes >", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesGreaterThanOrEqualTo(String value) {
            addCriterion("problemdes >=", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesLessThan(String value) {
            addCriterion("problemdes <", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesLessThanOrEqualTo(String value) {
            addCriterion("problemdes <=", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesLike(String value) {
            addCriterion("problemdes like", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesNotLike(String value) {
            addCriterion("problemdes not like", value, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesIn(List<String> values) {
            addCriterion("problemdes in", values, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesNotIn(List<String> values) {
            addCriterion("problemdes not in", values, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesBetween(String value1, String value2) {
            addCriterion("problemdes between", value1, value2, "problemdes");
            return (Criteria) this;
        }

        public Criteria andProblemdesNotBetween(String value1, String value2) {
            addCriterion("problemdes not between", value1, value2, "problemdes");
            return (Criteria) this;
        }
        
		
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
        
		
        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }
        
		
        public Criteria andFormIsNull() {
            addCriterion("form is null");
            return (Criteria) this;
        }

        public Criteria andFormIsNotNull() {
            addCriterion("form is not null");
            return (Criteria) this;
        }

        public Criteria andFormEqualTo(String value) {
            addCriterion("form =", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotEqualTo(String value) {
            addCriterion("form <>", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThan(String value) {
            addCriterion("form >", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThanOrEqualTo(String value) {
            addCriterion("form >=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThan(String value) {
            addCriterion("form <", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThanOrEqualTo(String value) {
            addCriterion("form <=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLike(String value) {
            addCriterion("form like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotLike(String value) {
            addCriterion("form not like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormIn(List<String> values) {
            addCriterion("form in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotIn(List<String> values) {
            addCriterion("form not in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormBetween(String value1, String value2) {
            addCriterion("form between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotBetween(String value1, String value2) {
            addCriterion("form not between", value1, value2, "form");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Tbreportrecord record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getEquimentid()!=null&&StrUtil.isNotEmpty(record.getEquimentid().toString())) {
    			 list.add("ifnull(equimentid,'')");
    		}
			if(record.getName()!=null&&StrUtil.isNotEmpty(record.getName().toString())) {
    			 list.add("ifnull(name,'')");
    		}
			if(record.getUserid()!=null&&StrUtil.isNotEmpty(record.getUserid().toString())) {
    			 list.add("ifnull(userid,'')");
    		}
			if(record.getReportdate()!=null&&StrUtil.isNotEmpty(record.getReportdate().toString())) {
    			 list.add("ifnull(reportdate,'')");
    		}
			if(record.getProblemdes()!=null&&StrUtil.isNotEmpty(record.getProblemdes().toString())) {
    			 list.add("ifnull(problemdes,'')");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
    		}
			if(record.getUsername()!=null&&StrUtil.isNotEmpty(record.getUsername().toString())) {
    			 list.add("ifnull(username,'')");
    		}
			if(record.getForm()!=null&&StrUtil.isNotEmpty(record.getForm().toString())) {
    			 list.add("ifnull(form,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getEquimentid()!=null&&StrUtil.isNotEmpty(record.getEquimentid().toString())) {
    			list2.add("'%"+record.getEquimentid()+"%'");
    		}
			if(record.getName()!=null&&StrUtil.isNotEmpty(record.getName().toString())) {
    			list2.add("'%"+record.getName()+"%'");
    		}
			if(record.getUserid()!=null&&StrUtil.isNotEmpty(record.getUserid().toString())) {
    			list2.add("'%"+record.getUserid()+"%'");
    		}
			if(record.getReportdate()!=null&&StrUtil.isNotEmpty(record.getReportdate().toString())) {
    			list2.add("'%"+record.getReportdate()+"%'");
    		}
			if(record.getProblemdes()!=null&&StrUtil.isNotEmpty(record.getProblemdes().toString())) {
    			list2.add("'%"+record.getProblemdes()+"%'");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			list2.add("'%"+record.getStatus()+"%'");
    		}
			if(record.getUsername()!=null&&StrUtil.isNotEmpty(record.getUsername().toString())) {
    			list2.add("'%"+record.getUsername()+"%'");
    		}
			if(record.getForm()!=null&&StrUtil.isNotEmpty(record.getForm().toString())) {
    			list2.add("'%"+record.getForm()+"%'");
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
    		list.add("ifnull(equimentid,'')");
    		list.add("ifnull(name,'')");
    		list.add("ifnull(userid,'')");
    		list.add("ifnull(reportdate,'')");
    		list.add("ifnull(problemdes,'')");
    		list.add("ifnull(status,'')");
    		list.add("ifnull(username,'')");
    		list.add("ifnull(form,'')");
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