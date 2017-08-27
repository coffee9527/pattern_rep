package com.jpf.J2EE.interceptingFilter.base;

/**
 * 创建客户端 Client
 * 
 * @author Administrator
 *
 */
public class Client {
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
