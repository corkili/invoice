package org.invoice.db;

import java.util.Map;

import org.invoice.service.DBManager;

/**
 * 数据库记录更新类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class UpdateDB implements DBManager {
	/**
	 * 私有构造方法
	 */
	private UpdateDB(){
		
	}
	/**
	 * 维持单例对象的工厂类
	 * @author ran
	 */
	private static class UpdateDBFactory {
		private static UpdateDB instance = new UpdateDB();
	}
	/**
	 * 获取数据库记录更新类的实例对象
	 * @return UpdateDB的实例对象
	 */
	public static UpdateDB getInstance() {
		return UpdateDBFactory.instance;
	}
	
	@Override
	public Map<String, Object> operate(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
