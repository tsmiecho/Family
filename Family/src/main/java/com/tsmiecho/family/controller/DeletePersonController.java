package com.tsmiecho.family.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tsmiecho.family.dao.IAdressDao;
import com.tsmiecho.family.dao.IPersonDao;

@Controller
public class DeletePersonController {

	private static final Logger logger = Logger.getLogger(DeletePersonController.class);
	
	@Autowired
	private IPersonDao personDao;
	
	@Autowired
	private IAdressDao adressDao;

	public IAdressDao getAdressDao() {
		return adressDao;
	}

	public void setAdressDao(IAdressDao adressDao) {
		this.adressDao = adressDao;
	}

	public IPersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}
}
