package ch05_pjt_01.contact.service;

import javax.inject.Inject;
import javax.inject.Named;

//import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDAO;

public class ContactRegisterService {
//	@Resource
//	@Autowired(required=false)
//	@Qualifier("usedDAO")
	@Inject
	@Named("contactDAO")
	private ContactDAO contactDAO;
	
//	public ContactRegisterService() {
//		System.out.println("default constructor");
//	}
//	@Autowired
//	@Resource
	@Inject
	@Named("contactDAO")
	public ContactRegisterService(ContactDAO contactDAO) {
		System.out.println("contactDAO : " + contactDAO); //contactDAO출력
		this.contactDAO = contactDAO;
	}
	
	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		if(verify(name)) {
			contactDAO.insert(contactSet);
		}else {
			System.out.println("The name has already registered.");
		}
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDAO.select(name);
		return contactSet == null ? true : false;
	}
	
	public void setWordDao(ContactDAO contactDao) {
		this.contactDAO = contactDao;
	}
	//@Autowired
	//@Resource
	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}
}

