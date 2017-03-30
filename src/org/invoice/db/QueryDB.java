package org.invoice.db;

import java.util.Map;

import org.invoice.service.DBManager;

/**
 * 数据库查询类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class QueryDB implements DBManager{
	
	/**
	 * 私有构造方法
	 */
	private QueryDB(){
		
	}
	
	/**
	 * 
	 * @author ran
	 *
	 */
	private static class QueryDBFactory {
		private static QueryDB instance = new QueryDB();
	}
	
	public static QueryDB getInstance() {
		return QueryDBFactory.instance;
	}
	
	@Override
	public Map<String, Object> operate(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
