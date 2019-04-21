package com.suraj.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean,
		BeanClassLoaderAware, BeanNameAware, BeanFactoryAware {

	private Integer bookId;
	private String bookName;

	public Book() {
		System.out.println("constructor invoked...");
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
		System.out.println("setBookId");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		System.out.println("setBookName");
	}

	public void tearUp() throws Exception {
		System.out.println("custom xml init method invoked...");
	}

	public void tearDown() throws Exception {
		System.out.println("custom xml destroy method invoked...");
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out
				.println("setBeanFactory() invoked from BeanFactoryAware... ");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName() invoked from BeanNameAware... ");
	}

	@Override
	public void setBeanClassLoader(ClassLoader loader) {
		System.out
				.println("setBeanClassLoader() invoked from BeanClassLoaderAware... ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() invoked from DisposalBean... ");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out
				.println("afterPropertiesSet() invoked from InitializingBean... ");

	}

	@PostConstruct
	public void init() {
		System.out
				.println("annotation init method invoked by @PostConstruct...");
	}

	@PreDestroy
	public void destroyBean() {
		System.out
				.println("annotation destroy method invoked by @PreDestroy..");
	}
}
