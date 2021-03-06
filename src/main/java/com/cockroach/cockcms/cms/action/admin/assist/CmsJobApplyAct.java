package com.cockroach.cockcms.cms.action.admin.assist;

import static com.cockroach.cockcms.common.page.SimplePage.cpn;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cockroach.cockcms.cms.entity.assist.CmsJobApply;
import com.cockroach.cockcms.cms.entity.main.Content;
import com.cockroach.cockcms.cms.manager.assist.CmsJobApplyMng;
import com.cockroach.cockcms.cms.manager.main.ContentMng;
import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.common.web.CookieUtils;
import com.cockroach.cockcms.core.entity.CmsSite;
import com.cockroach.cockcms.core.entity.CmsUser;
import com.cockroach.cockcms.core.entity.CmsUserResume;
import com.cockroach.cockcms.core.manager.CmsUserMng;
import com.cockroach.cockcms.core.web.WebErrors;
import com.cockroach.cockcms.core.web.util.CmsUtils;

@Controller
public class CmsJobApplyAct {
	private static final Logger log = LoggerFactory.getLogger(CmsJobApplyAct.class);

	@RequiresPermissions("jobapply:v_list")
	@RequestMapping("/jobapply/v_list.do")
	public String list(Integer pageNo, HttpServletRequest request, ModelMap model) {
		Pagination pagination = manager.getPage(null,null,CmsUtils.getSiteId(request),true,cpn(pageNo), CookieUtils
				.getPageSize(request));
		model.addAttribute("pagination",pagination);
		model.addAttribute("pageNo",pagination.getPageNo());
		return "jobapply/list";
	}
	
	@RequiresPermissions("jobapply:o_delete")
	@RequestMapping("/jobapply/o_delete.do")
	public String delete(Integer[] ids, Integer pageNo, HttpServletRequest request,
			ModelMap model) {
		WebErrors errors = validateDelete(ids, request);
		if (errors.hasErrors()) {
			return errors.showErrorPage(model);
		}
		CmsJobApply[] beans = manager.deleteByIds(ids);
		for (CmsJobApply bean : beans) {
			log.info("delete CmsJobApply id={}", bean.getId());
		}
		return list(pageNo, request, model);
	}
	
	
	@RequiresPermissions("jobapply:v_view")
	@RequestMapping("/jobapply/v_view.do")
	public String viewResume(Integer userId,Integer contentId, Integer pageNo, HttpServletRequest request,
			ModelMap model) {
		WebErrors errors = validateViewResume(userId,contentId,request);
		if (errors.hasErrors()) {
			return errors.showErrorPage(model);
		}
		CmsUserResume resume = userMng.findById(userId).getUserResume();
		model.addAttribute("resume", resume);
		return "jobapply/viewresume";
	}

	private WebErrors validateDelete(Integer[] ids, HttpServletRequest request) {
		WebErrors errors = WebErrors.create(request);
		CmsSite site = CmsUtils.getSite(request);
		if (errors.ifEmpty(ids, "ids")) {
			return errors;
		}
		for (Integer id : ids) {
			vldExist(id, site.getId(), errors);
		}
		return errors;
	}
	
	private WebErrors validateViewResume(Integer userId,Integer contentId,HttpServletRequest request) {
		WebErrors errors = WebErrors.create(request);
		CmsSite site = CmsUtils.getSite(request);
		if (errors.ifNull(userId,"user")) {
			return errors;
		}
		if (errors.ifNull(contentId,"contentId")) {
			return errors;
		}
		CmsUser u=userMng.findById(userId);
		if(u==null){
			errors.addErrorCode("cmsJobApply.nouser");
			return errors;
		}
		Content c=contentMng.findById(contentId);
		if(c==null){
			errors.addErrorCode("cmsJobApply.nocontent");
			return errors;
		}
		if(!c.getSite().equals(site)){
			errors.addErrorCode("cmsJobApply.notinsite",u.getUsername());
			return errors;
		}
		return errors;
	}

	private boolean vldExist(Integer id, Integer siteId, WebErrors errors) {
		if (errors.ifNull(id, "id")) {
			return true;
		}
		CmsJobApply entity = manager.findById(id);
		if(errors.ifNotExist(entity, CmsJobApply.class, id)) {
			return true;
		}
		return false;
	}
	
	@Autowired
	private CmsJobApplyMng manager;
	@Autowired
	private CmsUserMng userMng;
	@Autowired
	private ContentMng contentMng;
}