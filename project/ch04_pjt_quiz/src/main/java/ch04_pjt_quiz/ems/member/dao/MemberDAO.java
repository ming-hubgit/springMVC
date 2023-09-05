package ch04_pjt_quiz.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ch04_pjt_quiz.ems.member.Member;

public class MemberDAO {
	private Map<String, Member> memberDB = new HashMap<String, Member>();
	
	public void insert(Member member) {
		memberDB.put(member.getmNum(), member);
	}
	public Member select(String mNum) {
		return memberDB.get(mNum);
	}
	public void update(Member member) {
		memberDB.put(member.getmNum(), member);
	}
	public void delete(String mNum) {
		memberDB.remove(mNum);
	}
	public Map<String, Member> getMemberDB() {
		return memberDB;
	}
}
