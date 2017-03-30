package org.invoice.parse;

import org.invoice.service.Parser;

/**
 * 转换二进制和十六进制的实体类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class ParseHexAndBin implements Parser {

	/**
	 * 将二进制转化为十六进制
	 * @param T 为二进制数组byte[]
	 * @param E 为字符串String
	 */
	@Override
	public <T, E> E parseTo(T content) {
		byte[] buf = (byte[])content;
		StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return (E)sb.toString();
        
	}
	
	/**
	 * 将十六进制转化为二进制
	 * @param T 为二进制数组byte[]
	 * @param E 为字符串String
	 */
	@Override
	public <T, E> T parseFrom(E content) {
		String hexStr = (String)content;
		if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return (T)result;
	}
	

}

