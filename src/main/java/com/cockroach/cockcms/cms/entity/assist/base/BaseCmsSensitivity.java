package com.cockroach.cockcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_sensitivity table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_sensitivity"
 */

public abstract class BaseCmsSensitivity  implements Serializable {

	public static String REF = "CmsSensitivity";
	public static String PROP_SEARCH = "search";
	public static String PROP_ID = "id";
	public static String PROP_REPLACEMENT = "replacement";


	// constructors
	public BaseCmsSensitivity () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSensitivity (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSensitivity (
		Integer id,
		String search,
		String replacement) {

		this.setId(id);
		this.setSearch(search);
		this.setReplacement(replacement);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String search;
	private String replacement;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="sensitivity_id"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: search
	 */
	public String getSearch () {
		return search;
	}

	/**
	 * Set the value related to the column: search
	 * @param search the search value
	 */
	public void setSearch (String search) {
		this.search = search;
	}


	/**
	 * Return the value associated with the column: replacement
	 */
	public String getReplacement () {
		return replacement;
	}

	/**
	 * Set the value related to the column: replacement
	 * @param replacement the replacement value
	 */
	public void setReplacement (String replacement) {
		this.replacement = replacement;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.cockroach.cockcms.cms.entity.assist.CmsSensitivity)) return false;
		else {
			com.cockroach.cockcms.cms.entity.assist.CmsSensitivity cmsSensitivity = (com.cockroach.cockcms.cms.entity.assist.CmsSensitivity) obj;
			if (null == this.getId() || null == cmsSensitivity.getId()) return false;
			else return (this.getId().equals(cmsSensitivity.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}