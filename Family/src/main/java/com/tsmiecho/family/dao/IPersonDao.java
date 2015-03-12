package com.tsmiecho.family.dao;

import com.tsmiecho.family.engine.PersonEngine;

public interface IPersonDao {
	
	PersonEngine getPersonById(Long id);
	
}
