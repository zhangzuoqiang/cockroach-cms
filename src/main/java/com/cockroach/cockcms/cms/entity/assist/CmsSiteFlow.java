package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsSiteFlow;



public class CmsSiteFlow extends BaseCmsSiteFlow {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSiteFlow () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSiteFlow (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSiteFlow (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsSite site,
		String accessIp,
		String accessDate,
		String accessPage,
		String sessionId) {

		super (
			id,
			site,
			accessIp,
			accessDate,
			accessPage,
			sessionId);
	}

/*[CONSTRUCTOR MARKER END]*/


}