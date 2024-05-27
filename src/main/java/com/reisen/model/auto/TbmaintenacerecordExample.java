package com.reisen.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 器材维护 TbmaintenacerecordExample
 * @author fuce_自动生成
 * @date 2024-04-26 23:52:58
 */
public class TbmaintenacerecordExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbmaintenacerecordExample() {
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
        
		
        public Criteria andEquipmentidIsNull() {
            addCriterion("equipmentid is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNotNull() {
            addCriterion("equipmentid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidEqualTo(Integer value) {
            addCriterion("equipmentid =", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotEqualTo(Integer value) {
            addCriterion("equipmentid <>", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThan(Integer value) {
            addCriterion("equipmentid >", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipmentid >=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThan(Integer value) {
            addCriterion("equipmentid <", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThanOrEqualTo(Integer value) {
            addCriterion("equipmentid <=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLike(Integer value) {
            addCriterion("equipmentid like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotLike(Integer value) {
            addCriterion("equipmentid not like", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIn(List<Integer> values) {
            addCriterion("equipmentid in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotIn(List<Integer> values) {
            addCriterion("equipmentid not in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidBetween(Integer value1, Integer value2) {
            addCriterion("equipmentid between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("equipmentid not between", value1, value2, "equipmentid");
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
        
		
        public Criteria andMaintenancedateIsNull() {
            addCriterion("maintenancedate is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateIsNotNull() {
            addCriterion("maintenancedate is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateEqualTo(Date value) {
            addCriterion("maintenancedate =", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateNotEqualTo(Date value) {
            addCriterion("maintenancedate <>", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateGreaterThan(Date value) {
            addCriterion("maintenancedate >", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateGreaterThanOrEqualTo(Date value) {
            addCriterion("maintenancedate >=", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateLessThan(Date value) {
            addCriterion("maintenancedate <", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateLessThanOrEqualTo(Date value) {
            addCriterion("maintenancedate <=", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateLike(Date value) {
            addCriterion("maintenancedate like", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateNotLike(Date value) {
            addCriterion("maintenancedate not like", value, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateIn(List<Date> values) {
            addCriterion("maintenancedate in", values, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateNotIn(List<Date> values) {
            addCriterion("maintenancedate not in", values, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateBetween(Date value1, Date value2) {
            addCriterion("maintenancedate between", value1, value2, "maintenancedate");
            return (Criteria) this;
        }

        public Criteria andMaintenancedateNotBetween(Date value1, Date value2) {
            addCriterion("maintenancedate not between", value1, value2, "maintenancedate");
            return (Criteria) this;
        }
        
		
        public Criteria andMaintenanceContentIsNull() {
            addCriterion("maintenanceContent is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentIsNotNull() {
            addCriterion("maintenanceContent is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentEqualTo(String value) {
            addCriterion("maintenanceContent =", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotEqualTo(String value) {
            addCriterion("maintenanceContent <>", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentGreaterThan(String value) {
            addCriterion("maintenanceContent >", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentGreaterThanOrEqualTo(String value) {
            addCriterion("maintenanceContent >=", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentLessThan(String value) {
            addCriterion("maintenanceContent <", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentLessThanOrEqualTo(String value) {
            addCriterion("maintenanceContent <=", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentLike(String value) {
            addCriterion("maintenanceContent like", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotLike(String value) {
            addCriterion("maintenanceContent not like", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentIn(List<String> values) {
            addCriterion("maintenanceContent in", values, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotIn(List<String> values) {
            addCriterion("maintenanceContent not in", values, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentBetween(String value1, String value2) {
            addCriterion("maintenanceContent between", value1, value2, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotBetween(String value1, String value2) {
            addCriterion("maintenanceContent not between", value1, value2, "maintenanceContent");
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
        
	
		 public Criteria andLikeQuery(Tbmaintenacerecord record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getEquipmentid()!=null&&StrUtil.isNotEmpty(record.getEquipmentid().toString())) {
    			 list.add("ifnull(equipmentid,'')");
    		}
			if(record.getName()!=null&&StrUtil.isNotEmpty(record.getName().toString())) {
    			 list.add("ifnull(name,'')");
    		}
			if(record.getUserid()!=null&&StrUtil.isNotEmpty(record.getUserid().toString())) {
    			 list.add("ifnull(userid,'')");
    		}
			if(record.getMaintenancedate()!=null&&StrUtil.isNotEmpty(record.getMaintenancedate().toString())) {
    			 list.add("ifnull(maintenancedate,'')");
    		}
			if(record.getMaintenanceContent()!=null&&StrUtil.isNotEmpty(record.getMaintenanceContent().toString())) {
    			 list.add("ifnull(maintenanceContent,'')");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
    		}
			if(record.getUsername()!=null&&StrUtil.isNotEmpty(record.getUsername().toString())) {
    			 list.add("ifnull(username,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getEquipmentid()!=null&&StrUtil.isNotEmpty(record.getEquipmentid().toString())) {
    			list2.add("'%"+record.getEquipmentid()+"%'");
    		}
			if(record.getName()!=null&&StrUtil.isNotEmpty(record.getName().toString())) {
    			list2.add("'%"+record.getName()+"%'");
    		}
			if(record.getUserid()!=null&&StrUtil.isNotEmpty(record.getUserid().toString())) {
    			list2.add("'%"+record.getUserid()+"%'");
    		}
			if(record.getMaintenancedate()!=null&&StrUtil.isNotEmpty(record.getMaintenancedate().toString())) {
    			list2.add("'%"+record.getMaintenancedate()+"%'");
    		}
			if(record.getMaintenanceContent()!=null&&StrUtil.isNotEmpty(record.getMaintenanceContent().toString())) {
    			list2.add("'%"+record.getMaintenanceContent()+"%'");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			list2.add("'%"+record.getStatus()+"%'");
    		}
			if(record.getUsername()!=null&&StrUtil.isNotEmpty(record.getUsername().toString())) {
    			list2.add("'%"+record.getUsername()+"%'");
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
    		list.add("ifnull(equipmentid,'')");
    		list.add("ifnull(name,'')");
    		list.add("ifnull(userid,'')");
    		list.add("ifnull(maintenancedate,'')");
    		list.add("ifnull(maintenanceContent,'')");
    		list.add("ifnull(status,'')");
    		list.add("ifnull(username,'')");
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