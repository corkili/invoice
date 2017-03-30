package org.invoice.db;

import java.util.Map;

import org.invoice.service.DBManager;

/**
 * 数据库记录删除类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class DeleteDB implements DBManager{
	
	/**
	 * 私有构造方法
	 */
	private DeleteDB(){
		
	}
	
	/**
	 * 维护单例的工厂类
	 * @author ran
	 */
	private static class DeleteDBFactory {
		private static DeleteDB instance = new DeleteDB();
	}
	/**
	 * 获取单例对象
	 * @return DeleteDB类的单例对象
	 */
	public static DeleteDB getInstance() {
		return DeleteDBFactory.instance;
	}
	
	@Override
	public Map<String, Object> operate(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
