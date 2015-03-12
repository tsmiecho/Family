package com.tsmiecho.family.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsmiecho.family.engine.AdressEngine;

@Repository
public class AdressDaoImpl implements IAdressDao {

	private static final Logger logger = Logger.getLogger(AdressDaoImpl.class);
	
	@Transactional
	@Override
	public AdressEngine getAdressById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
