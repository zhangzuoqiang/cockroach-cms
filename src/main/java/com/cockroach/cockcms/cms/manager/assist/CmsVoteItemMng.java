package com.cockroach.cockcms.cms.manager.assist;

import java.util.Collection;

import com.cockroach.cockcms.cms.entity.assist.CmsVoteItem;
import com.cockroach.cockcms.cms.entity.assist.CmsVoteSubTopic;
import com.cockroach.cockcms.common.page.Pagination;

public interface CmsVoteItemMng {
	public Pagination getPage(int pageNo, int pageSize);

	public CmsVoteItem findById(Integer id);

	public Collection<CmsVoteItem> save(Collection<CmsVoteItem> items,
										CmsVoteSubTopic topic);

	public Collection<CmsVoteItem> update(Collection<CmsVoteItem> items,
										  CmsVoteSubTopic topic);

	public CmsVoteItem deleteById(Integer id);

	public CmsVoteItem[] deleteByIds(Integer[] ids);

}