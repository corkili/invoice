package org.invoice.service;

import java.util.Map;

/**
 * 安全模块接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface Secure {
	/**
	 * 安全模块方法接口
	 * @param content 要处理的内容
	 * @param key 秘钥
	 * @return 返回一个Map对象，包含处理结果的各类信息
	 */
	public Map<String, Object> handle(String content, String key);
}
