package com.jpf.J2EE.businessDelegate.base;
/**
 * 创建客户端。
 * @author Administrator
 *
 */
public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
