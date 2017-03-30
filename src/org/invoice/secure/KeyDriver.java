package org.invoice.secure;

/**
 * 安全模块驱动类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public class KeyDriver {
	/**
	 * 私有构造方法
	 */
	private KeyDriver(){
		
	}
	
	/**
	 * 维护单例的工厂类
	 * @author ran
	 */
	private static class KeyDriverFactory {
		private static KeyDriver instance = new KeyDriver();
	}
	
	/**
	 * 得到KeyDriver的单例对象
	 * @return KeyDriver的单例对象
	 */
	public static KeyDriver getInstance() {
		return KeyDriverFactory.instance;
	}
	
	/**
	 * 获取解密器
	 * @return Decryptor类实例对象
	 */
	public Decryptor getDecryptor() {
		return new Decryptor();
	}
	
	/**
	 * 获取加密器
	 * @return Encryptor类实例对象
	 */
	public Encryptor getEncryptor() {
		return new Encryptor();
	}
}
