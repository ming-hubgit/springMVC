package ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDAO;

public class ContactSearchService {
	private ContactDAO contactDao;
	
	public ContactSearchService() {
		System.out.println("default constructor");
	}
	@Autowired
	public ContactSearchService(ContactDAO contactDao) {
		System.out.println("contactDAO : " + contactDao); //contactDAO출력
		this.contactDao = contactDao;
	}
	
	public ContactSet searchContact(String name) {
		if(verify(name)) {
			return contactDao.select(name);
		}else {
			System.out.println("Contact information is available.");
		}
		return null;
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null ? true : false;
	}
	public void setContactDao(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
}
