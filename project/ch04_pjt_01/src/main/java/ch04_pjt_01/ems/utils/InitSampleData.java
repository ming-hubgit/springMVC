package ch04_pjt_01.ems.utils;

public class InitSampleData {
	// applicationContext에서 초기값을 지정해줘서 필요가 없어졌죠?
//	private String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
//	private String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
//	private String[] sPws = {"96539", "64875", "15284", "48765", "28661"};
//	private String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"};
//	private int[] sAges = {19, 22, 20, 27, 19};
//	private char[] sGenders = {'M', 'W', 'W', 'M', 'M'};
//	private String[] sMajors = {"English Literature", "Korean Language and Literature", "Franch Language and Literature", "Philosophy", "History"};
	
	//하지만 변수명은 필요합니다.
	private String[] sNums;
	private String[] sIds;
	private String[] sPws;
	private String[] sNames;
	private int[] sAges;
	private char[] sGenders;
	private String[] sMajors;
	
	//정말 오류가 나는지 매개변수있는 생성자를 넣어봅시다.
//	public InitSampleData(String[] sNums) {
//		this.sNums = sNums;
//	}
	public InitSampleData() {
		
	}
	public String[] getsNums() {
		return sNums;
	}
	public void setsNums(String[] sNums) {
		this.sNums = sNums;
	}
	public String[] getsIds() {
		return sIds;
	}
	public void setsIds(String[] sIds) {
		this.sIds = sIds;
	}
	public String[] getsPws() {
		return sPws;
	}
	public void setsPws(String[] sPws) {
		this.sPws = sPws;
	}
	public String[] getsNames() {
		return sNames;
	}
	public void setsNames(String[] sNames) {
		this.sNames = sNames;
	}
	public int[] getsAges() {
		return sAges;
	}
	public void setsAges(int[] sAges) {
		this.sAges = sAges;
	}
	public char[] getsGenders() {
		return sGenders;
	}
	public void setsGenders(char[] sGenders) {
		this.sGenders = sGenders;
	}
	public String[] getsMajors() {
		return sMajors;
	}
	public void setsMajors(String[] sMAjors) {
		this.sMajors = sMAjors;
	}
	
	
}
