package com.cockroach.cockcms.core.manager;

import javax.servlet.http.HttpServletRequest;

import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.core.entity.CmsLog;
import com.cockroach.cockcms.core.entity.CmsUser;

public interface CmsLogMng {
	public Pagination getPage(Integer category, Integer siteId,
							  String username, String title, String ip, int pageNo, int pageSize);

	public CmsLog findById(Integer id);

	public CmsLog operating(HttpServletRequest request, String title,
							String content);

	public CmsLog loginFailure(HttpServletRequest request, String content);

	public CmsLog loginSuccess(HttpServletRequest request, CmsUser user);

	public CmsLog save(CmsLog bean);

	public CmsLog deleteById(Integer id);

	public CmsLog[] deleteByIds(Integer[] ids);

	public int deleteBatch(Integer category, Integer siteId, Integer days);
}