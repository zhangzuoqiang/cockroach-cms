package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsVoteRecord;



public class CmsVoteRecord extends BaseCmsVoteRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsVoteRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsVoteRecord (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsVoteRecord (
		Integer id,
		com.cockroach.cockcms.cms.entity.assist.CmsVoteTopic topic,
		java.util.Date time,
		String ip,
		String cookie) {

		super (
			id,
			topic,
			time,
			ip,
			cookie);
	}

/*[CONSTRUCTOR MARKER END]*/


}