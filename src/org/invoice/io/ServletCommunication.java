package org.invoice.io;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.invoice.service.Communication;

/**
 * 实现Comnunication接口的抽象类，可以派生出与各Servlet交互的子类
 * @author ran
 * @date 2017/3/26
 * @version v0.1
 */
public abstract class ServletCommunication implements Communication{
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public ServletCommunication(HttpServletRequest request, HttpServletResponse response){
		this.setRequest(request);
		this.setResponse(response);
	}
	
	@Override
	public <E> E read() {
		return null;
	}

	@Override
	public <E> void write(E content) {
		
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
}
