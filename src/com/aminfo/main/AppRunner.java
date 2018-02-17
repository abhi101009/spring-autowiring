package com.aminfo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aminfo.coachspecification.Coach;

public class AppRunner {

	public static void main(String[] args) {
		
		/*1. loading spring config file */
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*2. get the bean*/
		Coach cricketCoach = ctx.getBean("cricketCoachImpl", Coach.class);
		
		/*3. call the method*/
		System.out.println(cricketCoach.getGuidOfCoach());
		
		System.out.println(cricketCoach.getKitPrice());

		System.out.println(cricketCoach.getCoachSalary());
		
		ctx.close();
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			   public void run() {
				   ctx.close();
			   }});
	}
}
