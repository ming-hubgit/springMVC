package ch06_pjt_quiz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch06_pjt_quiz.configuration.MemberConfig;
import ch06_pjt_quiz.controller.MemberController;
import ch06_pjt_quiz.dao.MemberDO;
import ch06_pjt_quiz.utils.InitSampleData;


public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GenericXmlApplicationContext ctx = 
//				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(MemberConfig.class);
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] ids= initSampleData.getIds();
		String[] passwords= initSampleData.getPasswords();
		String[] contacts= initSampleData.getContacts();
		String[] emails= initSampleData.getEmails();
		String[] registeredDates= initSampleData.getRegisteredDates();
		String[] modifiedDates = initSampleData.getModifiedDates();
		
		MemberController mc = 
				ctx.getBean("memberController", MemberController.class);
		for(int i = 0 ; i < ids.length ; i++) {
			mc.insert(new MemberDO(ids[i],passwords[i],contacts[i],emails[i],registeredDates[i],modifiedDates[i]));
		}
		
		mc.showAllMembers();
		
		ctx.close();
	}

}
