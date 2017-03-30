package org.invoice.service;

/**
 * I/O模块接口
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public interface Communication {
	/**
	 * 输入接口方法
	 * @return 返回读取到的对象
	 */
	public <E> E read();
	
	/**
	 * 输出接口方法
	 * @param content 要写入的内容
	 */
	public <E> void write(E content);
}
