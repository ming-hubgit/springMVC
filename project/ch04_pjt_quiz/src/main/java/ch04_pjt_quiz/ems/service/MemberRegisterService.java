package ch04_pjt_quiz.ems.service;

import ch04_pjt_quiz.ems.Member;
import ch04_pjt_quiz.ems.member.dao.MemberDAO;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void register(Member member) {
		if(verify(member.getmNum())) {
			memberDao.insert(member);
		}else {
			System.out.println("The member has already been registered");
		}
	}
	public boolean verify(String mNum) {
		Member member = memberDao.select(mNum);
		return member == null ? true : false;
	}
}
