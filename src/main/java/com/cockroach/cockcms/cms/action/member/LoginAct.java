package com.cockroach.cockcms.cms.action.member;

import static com.cockroach.cockcms.cms.Constants.TPLDIR_CSI;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cockroach.cockcms.common.web.RequestUtils;
import com.cockroach.cockcms.core.entity.CmsSite;
import com.cockroach.cockcms.core.web.util.CmsUtils;
import com.cockroach.cockcms.core.web.util.FrontUtils;

@Controller
public class LoginAct {
	public static final String LOGIN_CSI = "tpl.loginCsi";
	public static final String TPL_SPACE = "tpl.space";

	/**
	 * 客户端包含
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login_csi.jspx")
	public String csi(HttpServletRequest request, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		// 将request中所有参数
		model.putAll(RequestUtils.getQueryParams(request));
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath(request, site.getSolutionPath(),
				TPLDIR_CSI, LOGIN_CSI);
	}

}
