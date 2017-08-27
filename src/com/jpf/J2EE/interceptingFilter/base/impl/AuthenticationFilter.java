package com.jpf.J2EE.interceptingFilter.base.impl;

import com.jpf.J2EE.interceptingFilter.base.Filter;

/**
 * 创建实体过滤器
 * 
 * @author Administrator
 *
 */
public class AuthenticationFilter implements Filter {
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}
