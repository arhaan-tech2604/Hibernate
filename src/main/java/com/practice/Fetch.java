package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("com/practice/hiber.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Student_details address=(Student_details)session.get(Student_details.class, 2);
		System.out.println(address);
		
		session.close();
		factory.close();
	}
}