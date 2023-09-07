package ch06_pjt_quiz.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch06_pjt_quiz.dao.MemberDO;

public class MemberViewer {
	public void showMessage(String line) {
		System.out.print(line);
	}
	public void showMember(MemberDO member) {
		this.showMessage(member.getId());
		this.showMessage(member.getPassword());
		this.showMessage(member.getContact());
		this.showMessage(member.getEmail());
		this.showMessage(member.getRegisteredDate());
		this.showMessage(member.getModifiedDate());
	}
	
	public void showAllMembers(Map<String, MemberDO> members) {
		Set<String> keys = members.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("MEMBER LIST STARTS ----------------");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			MemberDO member = members.get(key);
			System.out.println("| Id : " + member.getId() + " \t");
			System.out.println("| Password : " + member.getPassword() + " \t");
			System.out.println("| Contact : " + member.getContact() + " \t");
			System.out.println("| Email : " + member.getEmail() + " \t");
			System.out.println("| RegisteredDate : " + member.getRegisteredDate() + " \t");
			System.out.println("| ModifiedDate : " + member.getModifiedDate() + " \t");
		}
		System.out.println("END --------------------------------------------------");
	}
	
}
