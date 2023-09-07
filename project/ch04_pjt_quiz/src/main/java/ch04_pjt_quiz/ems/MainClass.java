package ch04_pjt_quiz.ems;

import java.time.LocalDate;

import org.springframework.context.support.GenericXmlApplicationContext;

import ch04_pjt_quiz.ems.member.Member;
import ch04_pjt_quiz.ems.member.service.MemberDeleteService;
import ch04_pjt_quiz.ems.member.service.MemberModifyService;
import ch04_pjt_quiz.ems.member.service.MemberRegisterService;
import ch04_pjt_quiz.ems.member.service.MemberSelectService;
import ch04_pjt_quiz.ems.member.service.PrintMemberInformationService;
import ch04_pjt_quiz.ems.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		//IoC컨테이너 생성
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] mNums = initSampleData.getmNums();
		String[] mIds = initSampleData.getmIds();
		String[] mPws = initSampleData.getmPws();
		String[] mHPs = initSampleData.getmHPs();
		String[] mEmails = initSampleData.getmEmails();
		String[] newDates = initSampleData.getNewDates();
		String[] upDates = initSampleData.getUpDates();
		
		//데이터베이스에 샘플 데이터 등록
		MemberRegisterService registerService =
				ctx.getBean("memberRegisterService", MemberRegisterService.class);
		for(int i = 0; i < mNums.length; i++) {
			registerService.register(new Member(mNums[i], mIds[i], mPws[i], mHPs[i], mEmails[i], newDates[i], upDates[i]));
		}
		
		//회원 리스트
		PrintMemberInformationService printMemberInformationService =
				ctx.getBean("printMemberInformationService", PrintMemberInformationService.class);
		printMemberInformationService.printMembersInfo();
		//회원 등록
		registerService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		registerService.register(new Member("m006", "deer", "p0006", "010-1234-1234", "gg@gmail.com", now.toString(), now.toString()));
		
		printMemberInformationService.printMembersInfo();
		
		//학생 출력
		MemberSelectService selectService=
				ctx.getBean("memberSelectService", MemberSelectService.class);
		Member selectStudent = selectService.select("hbs006");
		
		System.out.println("MEMBER START ===========");
		System.out.println("|mNum : " + selectStudent.getmNum() + "\t");
		System.out.println("|mId : " + selectStudent.getmId() + "\t");
		System.out.println("|mPw : " + selectStudent.getmPw() + "\t");
		System.out.println("|mHPs : " + selectStudent.getmHP() + "\t");
		System.out.println("|mEmails : " + selectStudent.getmEmail() + "\t");
		System.out.println("|newDates : " + selectStudent.getNewDate() + "\t");
		System.out.println("|upDates : " + selectStudent.getUpDate() + "\t");
		System.out.println("END ===========");
		
		//회원 수정
		MemberModifyService modifyService = 
				ctx.getBean("memberModifyService", MemberModifyService.class);
		modifyService.modify(new Member("m006", "deer1", "p0006", "010-1234-1234", "hh@gmail.com",now.toString() ,now.toString()));
		//회원 리스트
		printMemberInformationService.printMembersInfo();
		
		//회원 삭제
		MemberDeleteService deleteService =
				ctx.getBean("memberDeleteService", MemberDeleteService.class);
		deleteService.delete("m001");
		//회원 리스트
		printMemberInformationService.printMembersInfo();
		
		ctx.close();
	}

}
