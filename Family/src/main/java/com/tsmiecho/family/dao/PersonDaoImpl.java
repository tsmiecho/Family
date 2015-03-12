package com.tsmiecho.family.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsmiecho.family.engine.PersonEngine;

@Repository
public class PersonDaoImpl implements IPersonDao {

	private static final Logger logger = Logger.getLogger(PersonDaoImpl.class);
	
	@Transactional
	@Override
	public PersonEngine getPersonById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
