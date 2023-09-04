package ch04_pjt_quiz.ems.service;

import java.util.Map;

import ch04_pjt_quiz.ems.Member;
import ch04_pjt_quiz.ems.member.dao.MemberDAO;

public class MemberAllSelectService {
	private MemberDAO memberDao;
	
	public MemberAllSelectService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public Map<String, Member> allSelect() {
		return memberDao.getMemberDB();
	}
}
