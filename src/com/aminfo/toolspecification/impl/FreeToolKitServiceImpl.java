package com.aminfo.toolspecification.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.aminfo.toolspecification.ToolKitService;

@Component("freeToolKitService")
@Scope("singleton")
public class FreeToolKitServiceImpl implements ToolKitService {

	@Override
	public double completeKitPrice() {
		return 0.00;
	}
	
	@PostConstruct
	public void initAfterBeanInitilization() throws Exception {
		System.out.println("Hi i m checking data.");
	}

	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("doing some cleanup before destroying bean, and will not execute in pototype scop..");
	}
}
