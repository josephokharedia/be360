package com.airstyl.be360.core;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.logging.Logger;

@Startup
@Singleton
public class UIFramework {

    @Inject
    private Logger logger;

    @PostConstruct
    public void init(){
        logger.info("=== init() ===");
    }
}
