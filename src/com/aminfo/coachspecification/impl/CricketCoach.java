package com.aminfo.coachspecification.impl;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.aminfo.coachspecification.Coach;
import com.aminfo.toolspecification.CoachAccount;
import com.aminfo.toolspecification.ToolKitService;

@Component("cricketCoachImpl")
@Scope("singleton")
public class CricketCoach implements Coach {

	private ToolKitService toolKit;
	
	@Autowired
	private CoachAccount coachAccount;

	/*no more required to use @Autowire annotation for custructor injection from spring 4.3*/
	/*
		 @Autowired
		 public CricketCoach(ToolKitServiceImpl toolKit) {
			System.out.println("Debug: cricket coach autowiring using custructor...\n");
			this.toolKit = toolKit;
		}
	 */
	
	@Autowired
	@Qualifier("freeToolKitService")
	public void setToolKit(ToolKitService toolKit) {
		this.toolKit = toolKit;
	}
	
	@Override
	public String getGuidOfCoach() {
		return "Please improve batting.";
	}

	@Override
	public String getCoachSalary() {
		return "Cricket toolkit price: " + coachAccount.getAccountDetail();
	}

	@Override
	public String getKitPrice() {
		return "Cricket toolkit price: " + toolKit.completeKitPrice();
	}

}
