package com.cockroach.cockcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_site_access table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_site_access"
 */

public abstract class BaseCmsSiteAccess  implements Serializable {

	public static String REF = "CmsSiteAccess";
	public static String PROP_SESSION_ID = "sessionId";
	public static String PROP_ENTRY_PAGE = "entryPage";
	public static String PROP_IP = "ip";
	public static String PROP_SITE = "site";
	public static String PROP_KEYWORD = "keyword";
	public static String PROP_AREA = "area";
	public static String PROP_VISIT_PAGE_COUNT = "visitPageCount";
	public static String PROP_ENGINE = "engine";
	public static String PROP_BROWSER = "browser";
	public static String PROP_EXTERNAL_LINK = "externalLink";
	public static String PROP_VISIT_SECOND = "visitSecond";
	public static String PROP_ID = "id";
	public static String PROP_ACCESS_TIME = "accessTime";
	public static String PROP_ACCESS_DATE = "accessDate";
	public static String PROP_OPERATING_SYSTEM = "operatingSystem";
	public static String PROP_LAST_STOP_PAGE = "lastStopPage";
	public static String PROP_ACCESS_SOURCE = "accessSource";


	// constructors
	public BaseCmsSiteAccess () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSiteAccess (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSiteAccess (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsSite site,
		String sessionId,
		java.util.Date accessTime,
		java.util.Date accessDate) {

		this.setId(id);
		this.setSite(site);
		this.setSessionId(sessionId);
		this.setAccessTime(accessTime);
		this.setAccessDate(accessDate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String sessionId;
	private java.util.Date accessTime;
	private java.util.Date accessDate;
	private String ip;
	private String area;
	private String accessSource;
	private String externalLink;
	private String engine;
	private String entryPage;
	private String lastStopPage;
	private Integer visitSecond;
	private Integer visitPageCount;
	private String operatingSystem;
	private String browser;
	private String keyword;

	// many to one
	private com.cockroach.cockcms.core.entity.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="access_id"
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
	 * Return the value associated with the column: session_id
	 */
	public String getSessionId () {
		return sessionId;
	}

	/**
	 * Set the value related to the column: session_id
	 * @param sessionId the session_id value
	 */
	public void setSessionId (String sessionId) {
		this.sessionId = sessionId;
	}


	/**
	 * Return the value associated with the column: access_time
	 */
	public java.util.Date getAccessTime () {
		return accessTime;
	}

	/**
	 * Set the value related to the column: access_time
	 * @param accessTime the access_time value
	 */
	public void setAccessTime (java.util.Date accessTime) {
		this.accessTime = accessTime;
	}


	/**
	 * Return the value associated with the column: access_date
	 */
	public java.util.Date getAccessDate () {
		return accessDate;
	}

	/**
	 * Set the value related to the column: access_date
	 * @param accessDate the access_date value
	 */
	public void setAccessDate (java.util.Date accessDate) {
		this.accessDate = accessDate;
	}


	/**
	 * Return the value associated with the column: ip
	 */
	public String getIp () {
		return ip;
	}

	/**
	 * Set the value related to the column: ip
	 * @param ip the ip value
	 */
	public void setIp (String ip) {
		this.ip = ip;
	}


	/**
	 * Return the value associated with the column: area
	 */
	public String getArea () {
		return area;
	}

	/**
	 * Set the value related to the column: area
	 * @param area the area value
	 */
	public void setArea (String area) {
		this.area = area;
	}


	/**
	 * Return the value associated with the column: access_source
	 */
	public String getAccessSource () {
		return accessSource;
	}

	/**
	 * Set the value related to the column: access_source
	 * @param accessSource the access_source value
	 */
	public void setAccessSource (String accessSource) {
		this.accessSource = accessSource;
	}


	/**
	 * Return the value associated with the column: external_link
	 */
	public String getExternalLink () {
		return externalLink;
	}

	/**
	 * Set the value related to the column: external_link
	 * @param externalLink the external_link value
	 */
	public void setExternalLink (String externalLink) {
		this.externalLink = externalLink;
	}


	/**
	 * Return the value associated with the column: engine
	 */
	public String getEngine () {
		return engine;
	}

	/**
	 * Set the value related to the column: engine
	 * @param engine the engine value
	 */
	public void setEngine (String engine) {
		this.engine = engine;
	}


	/**
	 * Return the value associated with the column: entry_page
	 */
	public String getEntryPage () {
		return entryPage;
	}

	/**
	 * Set the value related to the column: entry_page
	 * @param entryPage the entry_page value
	 */
	public void setEntryPage (String entryPage) {
		this.entryPage = entryPage;
	}


	/**
	 * Return the value associated with the column: last_stop_page
	 */
	public String getLastStopPage () {
		return lastStopPage;
	}

	/**
	 * Set the value related to the column: last_stop_page
	 * @param lastStopPage the last_stop_page value
	 */
	public void setLastStopPage (String lastStopPage) {
		this.lastStopPage = lastStopPage;
	}


	/**
	 * Return the value associated with the column: visit_second
	 */
	public Integer getVisitSecond () {
		return visitSecond;
	}

	/**
	 * Set the value related to the column: visit_second
	 * @param visitSecond the visit_second value
	 */
	public void setVisitSecond (Integer visitSecond) {
		this.visitSecond = visitSecond;
	}


	/**
	 * Return the value associated with the column: visit_page_count
	 */
	public Integer getVisitPageCount () {
		return visitPageCount;
	}

	/**
	 * Set the value related to the column: visit_page_count
	 * @param visitPageCount the visit_page_count value
	 */
	public void setVisitPageCount (Integer visitPageCount) {
		this.visitPageCount = visitPageCount;
	}


	/**
	 * Return the value associated with the column: operating_system
	 */
	public String getOperatingSystem () {
		return operatingSystem;
	}

	/**
	 * Set the value related to the column: operating_system
	 * @param operatingSystem the operating_system value
	 */
	public void setOperatingSystem (String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	/**
	 * Return the value associated with the column: browser
	 */
	public String getBrowser () {
		return browser;
	}

	/**
	 * Set the value related to the column: browser
	 * @param browser the browser value
	 */
	public void setBrowser (String browser) {
		this.browser = browser;
	}


	/**
	 * Return the value associated with the column: keyword
	 */
	public String getKeyword () {
		return keyword;
	}

	/**
	 * Set the value related to the column: keyword
	 * @param keyword the keyword value
	 */
	public void setKeyword (String keyword) {
		this.keyword = keyword;
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
		if (!(obj instanceof com.cockroach.cockcms.cms.entity.assist.CmsSiteAccess)) return false;
		else {
			com.cockroach.cockcms.cms.entity.assist.CmsSiteAccess cmsSiteAccess = (com.cockroach.cockcms.cms.entity.assist.CmsSiteAccess) obj;
			if (null == this.getId() || null == cmsSiteAccess.getId()) return false;
			else return (this.getId().equals(cmsSiteAccess.getId()));
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