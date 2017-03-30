package org.invoice.service;

import java.util.Map;

/**
 * 验证模块接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface Verification {
	/**
	 * 验证实体是否满足验证内容
	 * @param entity 要验证的实体对象
	 * @return 返回一个Map对象，包含验证结果的各类信息
	 */
	public <E> Map<String, Object> verify(E entity);
}
