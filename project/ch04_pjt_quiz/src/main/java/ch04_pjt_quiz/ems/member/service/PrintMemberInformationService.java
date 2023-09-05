package ch04_pjt_quiz.ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch04_pjt_quiz.ems.member.Member;

public class PrintMemberInformationService {
	MemberAllSelectService allSelectService;
	
	public PrintMemberInformationService(MemberAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}
	
	public void printMembersInfo() {
		Map<String, Member> allMember = allSelectService.allSelect();
		Set<String> keys = allMember.keySet();
		//Iterator => Map에 저장된 것을 HastSet key를 뽑아서 HashSet에 있는 것을 하나씩 가져오는 객체
		Iterator<String> iterator = keys.iterator();
		System.out.println("MEMBER LIST STARTS ----------------");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Member member = allMember.get(key);
			System.out.println("mNum : " + member.getmNum() + " \t");
			System.out.println("| mId : " + member.getmId() + " \t");
			System.out.println("| mPw : " + member.getmPw() + " \t");
			System.out.println("| mHP : " + member.getmHP() + " \t");
			System.out.println("| mEmail : " + member.getmEmail() + " \t");
			System.out.println("| newDate : " + member.getNewDate() + " \t");
			System.out.println("| upDate : " + member.getUpDate() + " \t");
		}
		System.out.println("END --------------------------------------------------");
	}
}
