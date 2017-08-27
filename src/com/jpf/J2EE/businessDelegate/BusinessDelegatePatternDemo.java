package com.jpf.J2EE.businessDelegate;

import com.jpf.J2EE.businessDelegate.base.BusinessDelegate;
import com.jpf.J2EE.businessDelegate.base.Client;

/**
 * 演示类 使用 BusinessDelegate 和 Client 类来演示业务代表模式
 * 
 * @author Administrator
 *
 */
public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
