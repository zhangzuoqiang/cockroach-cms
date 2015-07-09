package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsAdvertisingSpace;



public class CmsAdvertisingSpace extends BaseCmsAdvertisingSpace {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsAdvertisingSpace () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsAdvertisingSpace (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsAdvertisingSpace (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsSite site,
		String name,
		Boolean enabled) {

		super (
			id,
			site,
			name,
			enabled);
	}

/*[CONSTRUCTOR MARKER END]*/


}