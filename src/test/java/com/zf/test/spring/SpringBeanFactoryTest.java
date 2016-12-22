package com.zf.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Created by chris on 16/11/12.
 */
public class SpringBeanFactoryTest {

	public static void main(String[] args) throws IOException {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        IServerAnalysisService message = beanFactory.getBean("serverAnalysisService", IServerAnalysisService.class);
//		System.out.println("message=" + message);
//        message.getServiceByName(null, null);

	}

//    public static void main(String[] args) {
//        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(resource);
//        IServerAnalysisService message = factory.getBean("serverAnalysisService", IServerAnalysisService.class);	//Message是自己写的测试类
//        message.getServiceByName(null, null);
//    }

}
