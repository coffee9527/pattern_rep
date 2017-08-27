package com.jpf.J2EE.businessDelegate.base;

import com.jpf.J2EE.businessDelegate.base.impl.EJBService;
import com.jpf.J2EE.businessDelegate.base.impl.JMSService;

/**
 * 创建业务查询服务
 * 
 * @author Administrator
 *
 */
public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		}
		return new JMSService();

	}
}
