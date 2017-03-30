package org.invoice.secure;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.invoice.parse.ParserDriver;
import org.invoice.service.Parser;
import org.invoice.service.Secure;

/**
 * 解密实体类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class Decryptor implements Secure {
	@Override
	public Map<String, Object> handle(String content, String password) {
		Map<String, Object> map = new HashMap<>();
		try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, new SecureRandom(password.getBytes()));
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");  // 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);  // 初始化
            Parser parser = ParserDriver.getInstance().getHexBinParser();
            byte[] result = cipher.doFinal(parser.parseFrom(content));
            map.put(SECURE_RESULT_CODE, SECURE_SUCCESS_CODE);
            map.put(SECURE_RESULT_MSG, SECURE_SUCCESS_INFO);
            map.put(SECURE_RESULT_OBJECT, new String(result));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } finally {
        	return map;
        }
	}

}
