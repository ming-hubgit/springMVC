package ch06_pjt_quiz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_quiz.controller.MemberController;
import ch06_pjt_quiz.dao.MemberDAO;
import ch06_pjt_quiz.utils.InitSampleData;
import ch06_pjt_quiz.view.MemberViewer;

@Configuration
public class MemberConfig {
	
	@Bean
	public MemberDAO memberDAO() {
		return new MemberDAO();
	}
	
	@Bean
	public MemberViewer memberViewer() {
		return new MemberViewer();
	}
	
	@Bean
	public MemberController memberController() {
		MemberController memberController = new MemberController(memberDAO(), memberViewer());
		return memberController;
	}
	
	@Bean
	  public InitSampleData initSampleData() {
	    InitSampleData initSampleData = new InitSampleData();
		
		String[] ids= {"rabbit", "hippo", "raccoon"};
		initSampleData.setIds(ids);
		
		String[] passwords= {"p0001", "p0002", "p0003"};
		initSampleData.setPasswords(passwords);
		
		String[] contacts= {"010-0000-0000", "010-1111-1111", "010-1111-2222"};
		initSampleData.setContacts(contacts);
		
		String[] emails= {"aa@gmail.com", "bb@gmail.com", "cc@gmail.com"};
		initSampleData.setEmails(emails);
		
		String[] registeredDates= {"2020-02-03", "2020-03-07", "2020-04-08"};
		initSampleData.setRegisteredDates(registeredDates);
		
		String[] modifiedDates= {"2020-02-03", "2020-03-07", "2020-04-08"};
		initSampleData.setModifiedDates(modifiedDates);
		
		return initSampleData;
	}
	
}
