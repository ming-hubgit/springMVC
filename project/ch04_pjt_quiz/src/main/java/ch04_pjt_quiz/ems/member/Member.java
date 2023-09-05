package ch04_pjt_quiz.ems.member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member {
	private String mNum;//회원 번호 key 값
	private String mId;//회원 아이디
	private String mPw;//회원 비밀번호
	private String mHP;//회원 연락처
	private String mEmail;//회원 이메일
	private String newDate; //신규 회원가입일
	private String upDate;  //마지막 회원 정보 수정일
	
	LocalDate nowDate = LocalDate.now();
	DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
	//생성자
	public Member(String mNum, String mId, String mPw, String mHP, String mEmail, String newDate, String upDate) {
		super();
		this.mNum = mNum;
		this.mId = mId;
		this.mPw = mPw;
		this.mHP = mHP;
		this.mEmail = mEmail;
		this.newDate = newDate;
		this.upDate = upDate;
	}

	public String getmNum() {
		return mNum;
	}

	public void setmNum(String mNum) {
		this.mNum = mNum;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmHP() {
		return mHP;
	}

	public void setmHP(String mHP) {
		this.mHP = mHP;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public String getNewDate() {
		return newDate;
	}

	public void setNewDate(String newDate) {
		newDate = nowDate.format(date1);
		this.newDate = newDate;
	}

	public String getUpDate() {
		return upDate;
	}

	public void setUpDate(String upDate) {
		upDate = nowDate.format(date1);
		this.upDate = upDate;
	}
	
	//getter/setter
	
	
	
	
}
