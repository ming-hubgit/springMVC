package ch04_pjt_quiz.ems.utils;

public class InitSampleData {
	private String[] mNums;//회원 번호 key 값
	private String[] mIds;//회원 아이디
	private String[] mPws;//회원 비밀번호
	private String[] mHPs;//회원 연락처
	private String[] mEmails;//회원 이메일
	private String[] newDates; //신규 회원가입일
	private String[] upDates; //마지막 회원 정보 수정일
	
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
	public String[] getNewDates() {
		return newDates;
	}
	public void setNewDates(String[] newDates) {
		this.newDates = newDates;
	}
	public String[] getUpDates() {
		return upDates;
	}
	public void setUpDates(String[] upDates) {
		this.upDates = upDates;
	}
	
	
}
