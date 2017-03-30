package org.invoice.verify;

import java.util.Map;

import org.invoice.service.Verification;

/**
 * 权限验证类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
class AuthorityVerify implements Verification {
	private int authority;
	public AuthorityVerify(int authority) {
		this.authority = authority;
	}
	@Override
	public <E> Map<String, Object> verify(E entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
