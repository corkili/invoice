package org.invoice.service;

/**
 * 权限信息接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface Authority {
	/** 增加权限模式 */
	public static short AUTH_MODE_ADD 	 = 0xA;
	/** 删除权限模式 */
	public static short AUTH_MODE_REMOVE = 0xB;
	
	/**
	 * 设置权限的方法
	 * @param authority 要设置的权限
	 */
	public void setAuthority(int authority);
	
	/**
	 * 获取权限的方法
	 * @return 权限信息
	 */
	public int getAuthority();
	
	/**
	 * 更新权限的方法
	 * @param authority 更新的权限
	 * @param mode 更新类型（增加或删除）
	 */
	public void modifyAuthority(int authority, short mode);
}
