package com.cockroach.cockcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_message table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_message"
 */

public abstract class BaseCmsMessage  implements Serializable {

	public static String REF = "CmsMessage";
	public static String PROP_MSG_STATUS = "msgStatus";
	public static String PROP_SITE = "site";
	public static String PROP_MSG_SEND_USER = "msgSendUser";
	public static String PROP_MSG_CONTENT = "msgContent";
	public static String PROP_MSG_BOX = "msgBox";
	public static String PROP_SEND_TIME = "sendTime";
	public static String PROP_ID = "id";
	public static String PROP_MSG_RECEIVER_USER = "msgReceiverUser";
	public static String PROP_MSG_TITLE = "msgTitle";


	// constructors
	public BaseCmsMessage () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsMessage (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsMessage (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsUser msgReceiverUser,
		com.cockroach.cockcms.core.entity.CmsUser msgSendUser,
		com.cockroach.cockcms.core.entity.CmsSite site,
		String msgTitle,
		Boolean msgStatus,
		Integer msgBox) {

		this.setId(id);
		this.setMsgReceiverUser(msgReceiverUser);
		this.setMsgSendUser(msgSendUser);
		this.setSite(site);
		this.setMsgTitle(msgTitle);
		this.setMsgStatus(msgStatus);
		this.setMsgBox(msgBox);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String msgTitle;
	private String msgContent;
	private java.util.Date sendTime;
	private Boolean msgStatus;
	private Integer msgBox;

	// many to one
	private com.cockroach.cockcms.core.entity.CmsUser msgReceiverUser;
	private com.cockroach.cockcms.core.entity.CmsUser msgSendUser;
	private com.cockroach.cockcms.core.entity.CmsSite site;
	
	// collections
	private java.util.Set<com.cockroach.cockcms.cms.entity.assist.CmsReceiverMessage> receiverMsgs;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="msg_id"
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
	 * Return the value associated with the column: msg_title
	 */
	public String getMsgTitle () {
		return msgTitle;
	}

	/**
	 * Set the value related to the column: msg_title
	 * @param msgTitle the msg_title value
	 */
	public void setMsgTitle (String msgTitle) {
		this.msgTitle = msgTitle;
	}


	/**
	 * Return the value associated with the column: msg_content
	 */
	public String getMsgContent () {
		return msgContent;
	}

	/**
	 * Set the value related to the column: msg_content
	 * @param msgContent the msg_content value
	 */
	public void setMsgContent (String msgContent) {
		this.msgContent = msgContent;
	}


	/**
	 * Return the value associated with the column: send_time
	 */
	public java.util.Date getSendTime () {
		return sendTime;
	}

	/**
	 * Set the value related to the column: send_time
	 * @param sendTime the send_time value
	 */
	public void setSendTime (java.util.Date sendTime) {
		this.sendTime = sendTime;
	}


	/**
	 * Return the value associated with the column: msg_status
	 */
	public Boolean getMsgStatus () {
		return msgStatus;
	}

	/**
	 * Set the value related to the column: msg_status
	 * @param msgStatus the msg_status value
	 */
	public void setMsgStatus (Boolean msgStatus) {
		this.msgStatus = msgStatus;
	}


	/**
	 * Return the value associated with the column: msg_box
	 */
	public Integer getMsgBox () {
		return msgBox;
	}

	/**
	 * Set the value related to the column: msg_box
	 * @param msgBox the msg_box value
	 */
	public void setMsgBox (Integer msgBox) {
		this.msgBox = msgBox;
	}


	/**
	 * Return the value associated with the column: msg_receiver_user
	 */
	public com.cockroach.cockcms.core.entity.CmsUser getMsgReceiverUser () {
		return msgReceiverUser;
	}

	/**
	 * Set the value related to the column: msg_receiver_user
	 * @param msgReceiverUser the msg_receiver_user value
	 */
	public void setMsgReceiverUser (com.cockroach.cockcms.core.entity.CmsUser msgReceiverUser) {
		this.msgReceiverUser = msgReceiverUser;
	}


	/**
	 * Return the value associated with the column: msg_send_user
	 */
	public com.cockroach.cockcms.core.entity.CmsUser getMsgSendUser () {
		return msgSendUser;
	}

	/**
	 * Set the value related to the column: msg_send_user
	 * @param msgSendUser the msg_send_user value
	 */
	public void setMsgSendUser (com.cockroach.cockcms.core.entity.CmsUser msgSendUser) {
		this.msgSendUser = msgSendUser;
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
	
	public java.util.Set<com.cockroach.cockcms.cms.entity.assist.CmsReceiverMessage> getReceiverMsgs() {
		return receiverMsgs;
	}

	public void setReceiverMsgs(
			java.util.Set<com.cockroach.cockcms.cms.entity.assist.CmsReceiverMessage> receiverMsgs) {
		this.receiverMsgs = receiverMsgs;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.cockroach.cockcms.cms.entity.assist.CmsMessage)) return false;
		else {
			com.cockroach.cockcms.cms.entity.assist.CmsMessage cmsMessage = (com.cockroach.cockcms.cms.entity.assist.CmsMessage) obj;
			if (null == this.getId() || null == cmsMessage.getId()) return false;
			else return (this.getId().equals(cmsMessage.getId()));
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