package com.suraj.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String bean)
			throws BeansException {
		System.out.println("MyBeanPostProcessor:postProcessAfterInitialization-->"+obj+"\t Bean Name::"+bean);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String bean)
			throws BeansException {
		System.out.println("MyBeanPostProcessor:postProcessBeforeInitialization-->"+obj+"\t Bean Name::"+bean);
		return obj;
	}

}
