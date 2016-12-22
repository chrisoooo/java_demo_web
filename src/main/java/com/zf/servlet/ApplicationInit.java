package com.zf.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationInit implements ApplicationContextAware {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {


        log.info("客服系统启动成功-------------------------------------");

	}

}
