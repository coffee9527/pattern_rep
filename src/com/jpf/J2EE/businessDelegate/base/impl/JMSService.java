package com.jpf.J2EE.businessDelegate.base.impl;

import com.jpf.J2EE.businessDelegate.base.BusinessService;
/**
 * 创建实体服务类
 * @author Administrator
 *
 */
public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		 System.out.println("Processing task by invoking JMS Service");
	}

}
