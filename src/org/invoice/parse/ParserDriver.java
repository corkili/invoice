package org.invoice.parse;

/**
 * 解析器驱动类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public class ParserDriver {
	/**
	 * 私有构造方法
	 */
	private ParserDriver(){
		
	}
	
	/**
	 * 维护单例的工厂类
	 * @author ran
	 */
	private static class ParserDriverFactory {
		private static ParserDriver instance = new ParserDriver();
	}
	
	/**
	 * 得到ParserDriver的单例对象
	 * @return ParserDriver的单例对象
	 */
	public static ParserDriver getInstance() {
		return ParserDriverFactory.instance;
	}
	
	/**
	 * 获取二进制和十六进制之间的解析器
	 * @return ParseHexAndBin的实例对象
	 */
	public ParseHexAndBin getHexBinParser() {
		return new ParseHexAndBin();
	}
	
	/**
	 * 获取字符串和JSON对象之间的解析器
	 * @return ParseStrAndJson的实例对象
	 */
	public ParseStrAndJson getStrJsonParser() {
		return new ParseStrAndJson();
	}
}
