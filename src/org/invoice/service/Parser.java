package org.invoice.service;

/**
 * 解析模块泛型接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface Parser {
	/**
	 * 将T类型的对象解析为E类型的对象
	 * @param content 要解析的对象
	 * @return 解析得到新对象
	 */
	public <T, E> E parseTo(T content);
	/**
	 * 获取E类型的对象的T类型对象表示
	 * @param content 要解析的对象
	 * @return 转化得到的对象
	 */
	public <T, E> T parseFrom(E content);
}
