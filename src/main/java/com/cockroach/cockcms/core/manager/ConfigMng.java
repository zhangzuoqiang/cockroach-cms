package com.cockroach.cockcms.core.manager;

import java.util.Map;

import com.cockroach.cockcms.common.email.EmailSender;
import com.cockroach.cockcms.common.email.MessageTemplate;
import com.cockroach.cockcms.core.entity.Config;
import com.cockroach.cockcms.core.entity.Config.ConfigLogin;

public interface ConfigMng {
	public Map<String, String> getMap();

	public ConfigLogin getConfigLogin();

	public EmailSender getEmailSender();

	public MessageTemplate getForgotPasswordMessageTemplate();
	
	public MessageTemplate getRegisterMessageTemplate();

	public String getValue(String id);

	public void updateOrSave(Map<String, String> map);

	public Config updateOrSave(String key, String value);

	public Config deleteById(String id);

	public Config[] deleteByIds(String[] ids);
}