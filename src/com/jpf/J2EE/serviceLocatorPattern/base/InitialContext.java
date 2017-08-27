package com.jpf.J2EE.serviceLocatorPattern.base;

import com.jpf.J2EE.serviceLocatorPattern.base.impl.Service1;
import com.jpf.J2EE.serviceLocatorPattern.base.impl.Service2;

/**
 * 为 JNDI 查询创建 InitialContext
 * 
 * @author Administrator
 *
 */
public class InitialContext {
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
