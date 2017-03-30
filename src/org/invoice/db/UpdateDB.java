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

	private UpdateDB(){
		
	}
	
	private static class UpdateDBFactory {
		private static UpdateDB instance = new UpdateDB();
	}
	
	public static UpdateDB getInstance() {
		return UpdateDBFactory.instance;
	}
	
	@Override
	public Map<String, Object> operate(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
