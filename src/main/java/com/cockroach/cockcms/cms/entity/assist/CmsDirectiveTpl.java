package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsDirectiveTpl;



public class CmsDirectiveTpl extends BaseCmsDirectiveTpl {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsDirectiveTpl () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsDirectiveTpl (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsDirectiveTpl (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsUser user,
		String name) {

		super (
			id,
			user,
			name);
	}

/*[CONSTRUCTOR MARKER END]*/


}