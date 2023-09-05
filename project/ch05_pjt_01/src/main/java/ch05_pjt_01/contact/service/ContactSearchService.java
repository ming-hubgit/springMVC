package ch05_pjt_01.contact.service;

import javax.inject.Inject;
import javax.inject.Named;

//import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDAO;

public class ContactSearchService {
//	@Resource
//	@Autowired(required=false)
//	@Qualifier("usedDAO")
	@Inject
	@Named("contactDAO")
	private ContactDAO contactDAO;
	
//	public ContactSearchService() {
//		System.out.println("default constructor");
//	}
//	@Autowired
//	@Resource
	@Inject
	@Named("contactDAO")
	public ContactSearchService(ContactDAO contactDAO) {
		System.out.println("contactDAO : " + contactDAO); //contactDAO출력
		this.contactDAO = contactDAO;
	}
	
	public ContactSet searchContact(String name) {
		if(verify(name)) {
			return contactDAO.select(name);
		}else {
			System.out.println("Contact information is available.");
		}
		return null;
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDAO.select(name);
		return contactSet != null ? true : false;
	}

	//@Autowired
//	@Resource
	@Inject
	@Named("contactDAO")
	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}
}
