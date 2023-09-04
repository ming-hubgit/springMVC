package ch04_pjt_quiz.ems.utils;

import java.util.Date;

public class InitSampleData {
	private String[] mNums;//회원 번호 key 값
	private String[] mIds;//회원 아이디
	private String[] mPws;//회원 비밀번호
	private String[] mHPs;//회원 연락처
	private String[] mEmails;//회원 이메일
	private Date[] newDates; //신규 회원가입일
	private Date[] upDates; //마지막 회원 정보 수정일
	public String[] getmNums() {
		return mNums;
	}
	public void setmNums(String[] mNums) {
		this.mNums = mNums;
	}
	public String[] getmIds() {
		return mIds;
	}
	public void setmIds(String[] mIds) {
		this.mIds = mIds;
	}
	public String[] getmPws() {
		return mPws;
	}
	public void setmPws(String[] mPws) {
		this.mPws = mPws;
	}
	public String[] getmHPs() {
		return mHPs;
	}
	public void setmHPs(String[] mHPs) {
		this.mHPs = mHPs;
	}
	public String[] getmEmails() {
		return mEmails;
	}
	public void setmEmails(String[] mEmails) {
		this.mEmails = mEmails;
	}
	public Date[] getNewDates() {
		return newDates;
	}
	public void setNewDates(Date[] newDates) {
		this.newDates = newDates;
	}
	public Date[] getUpDates() {
		return upDates;
	}
	public void setUpDates(Date[] upDates) {
		this.upDates = upDates;
	}
	
	
}
