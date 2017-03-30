package org.invoice.entity;

import org.invoice.service.Authority;

public class User implements Authority {
	private String id;
	private String username;
	private String password;
	private int authority;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void setAuthority(int authority) {
		this.authority = authority;
		
	}
	
	@Override
	public int getAuthority() {
		return this.authority;
	}
	
	@Override
	public void modifyAuthority(int authority, short mode) {
		if(mode == AUTH_MODE_ADD) {
			this.authority |= authority;
		} else if(mode == AUTH_MODE_REMOVE) {
			this.authority &= (~authority);
		} else {
			// Won't do anything.
		}
	}
	
	
}
