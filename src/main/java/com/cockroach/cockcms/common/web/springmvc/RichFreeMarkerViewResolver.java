package com.cockroach.cockcms.common.web.springmvc;

import org.springframework.web.servlet.view.AbstractTemplateViewResolver;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

/**
 * <p>
 *     ViewResolver for RichFreeMarkerView
 * <p/>
 * Override buildView, if viewName start with / , then ignore prefix.
 */
public class RichFreeMarkerViewResolver extends AbstractTemplateViewResolver {

    /**
     * Set default viewClass
     */
    public RichFreeMarkerViewResolver() {
        setViewClass(RichFreeMarkerView.class);
    }

    /**
     * if viewName start with / , then ignore prefix.
     */
    @Override
    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
        AbstractUrlBasedView view = super.buildView(viewName);
        // start with / ignore prefix
        if (viewName.startsWith("/")) {
            view.setUrl(viewName + getSuffix());
        }
        return view;
    }
}