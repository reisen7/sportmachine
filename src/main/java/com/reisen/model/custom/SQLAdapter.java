package com.reisen.model.custom;

/**
 * 通用sql
* @ClassName: SQLAdapter
* @author fuce
* @date 2024-09-02 01:10
*
 */
public class SQLAdapter {
	private String sql;

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	/**
	 * @param sql
	 * @author fuce
	 * @date 2024年8月31日 下午7:25:22
	 */
	public SQLAdapter(String sql) {
		super();
		this.sql = sql;
	}
	
}
