package com.lagou.bean;

import org.springframework.stereotype.Component;

public class LagouBean {
	public LagouBean(){
		System.out.println("lagouBean构造器...");
	}

	public void afterPropertiesSet() throws Exception{
		System.out.println("lagouBean afterPropertiesSet...");
	}
}
