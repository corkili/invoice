package org.invoice.db;

/**
 * 数据库驱动类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public class DBDriver {
	private DBInfo dbInfo;
	
	/**
	 * 私有构造方法
	 */
	private DBDriver(){
		dbInfo = new DBInfo();
	}
	
	/**
	 * 维护单例的工厂类
	 * @author ran
	 */
	private static class DBDriverFactory {
		private static DBDriver instance = new DBDriver();
	}
	
	/**
	 * 得到DBDriver的单例对象
	 * @return DBDriver的单例对象
	 */
	public static DBDriver getInstance() {
		return DBDriverFactory.instance;
	}
	
	/**
	 * 获取数据库记录删除类的实例对象
	 * @return DeleteDB类的实例对象
	 */
	public DeleteDB getDelete() {
		return DeleteDB.getInstance();
	}
	
	/**
	 * 获取数据库记录插入类的实例对象
	 * @return InsertDB类的实例对象
	 */
	public InsertDB getInsert() {
		return InsertDB.getInstance();
	}
	
	/**
	 * 获取数据库记录查询类的实例对象
	 * @return QueryDB类的实例对象
	 */
	public QueryDB getQuery() {
		return QueryDB.getInstance();
	}
	
	/**
	 * 获取数据库记录更新类的实例对象
	 * @return UpdateDB类的实例对象
	 */
	public UpdateDB getUpdate() {
		return UpdateDB.getInstance();
	}
}
