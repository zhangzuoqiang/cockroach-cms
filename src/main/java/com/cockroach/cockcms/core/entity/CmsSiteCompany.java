package com.cockroach.cockcms.core.entity;

import com.cockroach.cockcms.core.entity.base.BaseCmsSiteCompany;



public class CmsSiteCompany extends BaseCmsSiteCompany {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSiteCompany () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSiteCompany (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSiteCompany (
		Integer id,
		String name) {

		super (
			id,
			name);
	}

/*[CONSTRUCTOR MARKER END]*/


}