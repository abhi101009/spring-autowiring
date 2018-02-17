package com.aminfo.toolspecification.impl;

import org.springframework.stereotype.Component;

import com.aminfo.toolspecification.CoachAccount;

@Component
public class CoachAccountImpl implements CoachAccount  {

	@Override
	public String getAccountDetail() {
		return "no salary";
	}

}
