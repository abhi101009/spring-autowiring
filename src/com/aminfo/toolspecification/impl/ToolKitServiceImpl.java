package com.aminfo.toolspecification.impl;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.aminfo.toolspecification.ToolKitService;

@Component
@Scope("prototype")
public class ToolKitServiceImpl implements ToolKitService {

	@Override
	public double completeKitPrice() {
		return 520.0;
	}
	
}
