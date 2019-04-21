package com.suraj.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Book;

public class BookTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			Book book = context.getBean("book", Book.class);
			System.out.println(book.getBookId()+"\t"+book.getBookName());
		}catch(BeansException e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext) context).close();
		}
	}
}
