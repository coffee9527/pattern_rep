package com.jpf.J2EE.interceptingFilter.base.impl;

import com.jpf.J2EE.interceptingFilter.base.Filter;

/**
 * 创建实体过滤器
 * @author Administrator
 *
 */
public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);
	}

}
