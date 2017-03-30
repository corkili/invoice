package org.invoice.service;

import java.util.Map;

/**
 * 安全模块接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface Secure {
	public static String SECURE_RESULT_CODE = "result_code";
	public static String SECURE_RESULT_MSG = "result_msg";
	public static String SECURE_RESULT_OBJECT = "result_object";
	
	public static int SECURE_SUCCESS_CODE = 1000;
	public static String SECURE_SUCCESS_INFO = "Parse successful!";
	
	
	/**
	 * 安全模块方法接口
	 * @param content 要处理的内容
	 * @param key 秘钥
	 * @return 返回一个Map对象，包含处理结果的各类信息
	 */
	public Map<String, Object> handle(String content, String password);
}
