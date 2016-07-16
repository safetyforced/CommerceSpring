package com.buystuff.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBuy {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Product productID = (Product) context.getBean("productID");
		Product productName = (Product) context.getBean("name");
		Product productDescription = (Product) context.getBean("description");
		Product productPrice = (Product) context.getBean("price");
		User userID = (User) context.getBean("userID");
		System.out.println(productID.getProductID());
		System.out.println(productName.getName());
		System.out.println(productDescription.getDescription());
		System.out.println(productPrice.getPrice());
		System.out.println(userID.getUserID());
	}
}