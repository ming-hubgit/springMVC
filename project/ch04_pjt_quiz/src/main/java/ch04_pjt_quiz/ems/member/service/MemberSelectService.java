package ch04_pjt_quiz.ems.member.service;

import ch04_pjt_quiz.ems.member.Member;
import ch04_pjt_quiz.ems.member.dao.MemberDAO;

public class MemberSelectService {
	private MemberDAO memberDao;
	
	public MemberSelectService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public Member select(String mNum) {
		if(verify(mNum)) {
			return memberDao.select(mNum);
		} else {
			System.out.println("Member information is availvble");
			return null;
		}
	}
	
	public boolean verify(String mNum) {
		Member member = memberDao.select(mNum);
		return member != null ? true : false;
	}
}
