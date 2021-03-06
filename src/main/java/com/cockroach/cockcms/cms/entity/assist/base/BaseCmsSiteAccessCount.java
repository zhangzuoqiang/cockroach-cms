package com.cockroach.cockcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_site_access_count table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_site_access_count"
 */

public abstract class BaseCmsSiteAccessCount  implements Serializable {

	public static String REF = "CmsSiteAccessCount";
	public static String PROP_PAGE_COUNT = "pageCount";
	public static String PROP_SITE = "site";
	public static String PROP_VISITORS = "visitors";
	public static String PROP_ID = "id";
	public static String PROP_STATISTIC_DATE = "statisticDate";


	// constructors
	public BaseCmsSiteAccessCount () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSiteAccessCount (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSiteAccessCount (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsSite site,
		Integer pageCount,
		Integer visitors,
		java.util.Date statisticDate) {

		this.setId(id);
		this.setSite(site);
		this.setPageCount(pageCount);
		this.setVisitors(visitors);
		this.setStatisticDate(statisticDate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Integer pageCount;
	private Integer visitors;
	private java.util.Date statisticDate;

	// many to one
	private com.cockroach.cockcms.core.entity.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="access_count"
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
	 * Return the value associated with the column: page_count
	 */
	public Integer getPageCount () {
		return pageCount;
	}

	/**
	 * Set the value related to the column: page_count
	 * @param pageCount the page_count value
	 */
	public void setPageCount (Integer pageCount) {
		this.pageCount = pageCount;
	}


	/**
	 * Return the value associated with the column: visitors
	 */
	public Integer getVisitors () {
		return visitors;
	}

	/**
	 * Set the value related to the column: visitors
	 * @param visitors the visitors value
	 */
	public void setVisitors (Integer visitors) {
		this.visitors = visitors;
	}


	/**
	 * Return the value associated with the column: statistic_date
	 */
	public java.util.Date getStatisticDate () {
		return statisticDate;
	}

	/**
	 * Set the value related to the column: statistic_date
	 * @param statisticDate the statistic_date value
	 */
	public void setStatisticDate (java.util.Date statisticDate) {
		this.statisticDate = statisticDate;
	}


	/**
	 * Return the value associated with the column: site_id
	 */
	public com.cockroach.cockcms.core.entity.CmsSite getSite () {
		return site;
	}

	/**
	 * Set the value related to the column: site_id
	 * @param site the site_id value
	 */
	public void setSite (com.cockroach.cockcms.core.entity.CmsSite site) {
		this.site = site;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.cockroach.cockcms.cms.entity.assist.CmsSiteAccessCount)) return false;
		else {
			com.cockroach.cockcms.cms.entity.assist.CmsSiteAccessCount cmsSiteAccessCount = (com.cockroach.cockcms.cms.entity.assist.CmsSiteAccessCount) obj;
			if (null == this.getId() || null == cmsSiteAccessCount.getId()) return false;
			else return (this.getId().equals(cmsSiteAccessCount.getId()));
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