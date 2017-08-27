package com.jpf.J2EE.interceptingFilter;

import com.jpf.J2EE.interceptingFilter.base.Client;
import com.jpf.J2EE.interceptingFilter.base.FilterManager;
import com.jpf.J2EE.interceptingFilter.base.Target;
import com.jpf.J2EE.interceptingFilter.base.impl.AuthenticationFilter;
import com.jpf.J2EE.interceptingFilter.base.impl.DebugFilter;

public class InterceptingFilterDemo {
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
