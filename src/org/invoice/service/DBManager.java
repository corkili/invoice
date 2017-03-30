package org.invoice.service;

import java.util.Map;

/**
 * 数据库管理模块接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface DBManager {
	/**
	 * 数据库操作方法接口，执行SQL语句
	 * @param sql 要执行的SQL语句
	 * @return 返回一个Map对象，包含操作结果的各类信息
	 */
	public Map<String, Object> operate(String sql);
}
