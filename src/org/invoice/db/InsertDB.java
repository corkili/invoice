package org.invoice.db;

import java.util.Map;

import org.invoice.service.DBManager;

/**
 * 数据库记录插入类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class InsertDB implements DBManager{
	
	/**
	 * 私有构造方法
	 */
	private InsertDB(){
		
	}
	
	/**
	 * 维护单例的工厂类
	 * @author ran
	 */
	private static class InsertDBFactory {
		private static InsertDB instance = new InsertDB();
	}
	
	/**
	 * 获取单例对象
	 * @return InsertDB类的单例对象
	 */
	public static InsertDB getInstance() {
		return InsertDBFactory.instance;
	}
	
	@Override
	public Map<String, Object> operate(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
