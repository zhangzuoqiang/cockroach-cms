package com.cockroach.cockcms.core.manager.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.core.dao.CmsConfigDao;
import com.cockroach.cockcms.core.entity.CmsConfig;
import com.cockroach.cockcms.core.entity.CmsConfigAttr;
import com.cockroach.cockcms.core.entity.MarkConfig;
import com.cockroach.cockcms.core.entity.MemberConfig;
import com.cockroach.cockcms.core.manager.CmsConfigMng;

@Service
@Transactional
public class CmsConfigMngImpl implements CmsConfigMng {
	@Transactional(readOnly = true)
	public CmsConfig get() {
		CmsConfig entity = dao.findById(1);
		return entity;
	}

	public void updateCountCopyTime(Date d) {
		dao.findById(1).setCountCopyTime(d);
	}

	public void updateCountClearTime(Date d) {
		dao.findById(1).setCountClearTime(d);
	}

	public CmsConfig update(CmsConfig bean) {
		Updater<CmsConfig> updater = new Updater<CmsConfig>(bean);
		CmsConfig entity = dao.updateByUpdater(updater);
		entity.blankToNull();
		return entity;
	}

	public MarkConfig updateMarkConfig(MarkConfig mark) {
		get().setMarkConfig(mark);
		return mark;
	}

	public void updateMemberConfig(MemberConfig memberConfig) {
		get().getAttr().putAll(memberConfig.getAttr());
	}

	public void updateConfigAttr(CmsConfigAttr configAttr) {
		get().getAttr().putAll(configAttr.getAttr());
	}

	private CmsConfigDao dao;

	@Autowired
	public void setDao(CmsConfigDao dao) {
		this.dao = dao;
	}
}