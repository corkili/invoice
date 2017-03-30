package org.invoice.verify;

/**
 * 验证器驱动类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public class VerifyDriver {
	/**
	 * 私有构造方法
	 */
	private VerifyDriver(){
		
	}
	
	/**
	 * 维护单例的工厂类
	 * @author ran
	 */
	private static class VerifyDriverFactory {
		private static VerifyDriver instance = new VerifyDriver();
	}
	
	/**
	 * 得到VerifyDriver的单例对象
	 * @return VerifyDriver的单例对象
	 */
	public static VerifyDriver getInstance() {
		return VerifyDriverFactory.instance;
	}
	
	/**
	 * 获取权限验证器
	 * @param authority 要验证的权限
	 * @return AuthorityVerify的实例对象
	 */
	public AuthorityVerify getAuthorityVerify(int authority) {
		return new AuthorityVerify(authority);
	}
	
	/**
	 * 获取登录验证器
	 * @return LoginVerify的实例对象
	 */
	public LoginVerify getLoginVerify() {
		return new LoginVerify();
	}
	
	/**
	 * 获取会话验证器
	 * @return SessionVerify的实例对象
	 */
	public SessionVerify getSessionVerify() {
		return new SessionVerify();
	}
	
	/**
	 * 获取注册验证器
	 * @return Signin的实例对象
	 */
	public SignupVerify getSigninVerify() {
		return new SignupVerify();
	}
}
