package com.javalearn.integration;

public class GateWayServiceActivator {

	public String consumeGateWay(String name) {
		
		//System.out.println("in GateWayServiceActivator>>consumeGateWay name:"+name);
		String greeting = "welcome in spring integraiotn service activator:-"+name;
		
		return greeting;
	}
}
