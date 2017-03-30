package org.invoice.service;

import java.util.Map;

/**
 * 数据处理模块接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface ProcessData {
	/**
	 * 数据处理方法，实现对数据的某种处理
	 * @param datas 要处理的数据
	 * @return 返回一个Map对象，包含处理结果的各类信息
	 */
	public <E> Map<String, Object> process();
}
