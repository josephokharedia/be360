package com.airstyl.be360.core;

import com.airstyl.be360.api.IFramework;
import com.airstyl.be360.spi.UIBean;
import com.airstyl.be360.spi.UITemplate;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;

@Startup
@Singleton
public class UIFramework implements IFramework {

    @Inject
    private Logger logger;

    @PostConstruct
    public void init() {
        logger.info("=== init() ===");
    }

    @Override
    public String getView(String viewId) {

        UIBean uiBean = CDI.current().select(UIBean.class, new NamedLiteral(viewId)).get();
        UITemplate template = uiBean.getView();

//        ObjectMapper objectMapper = new ObjectMapper();

        return uiBean.getView().toString();
    }
}
