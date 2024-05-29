package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("com/mapping/hiberOne.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question q=new Question();
		q.setId(1);
		q.setQuestion("What is Servlet?");
		
		Answer ans=new Answer();
		ans.setId(11);
		ans.setAnswer("Servlet is a simple java program that run on server");
		q.setAnswer(ans);
		
		Question q1=new Question();
		q1.setId(2);
		q1.setQuestion("what is variable?");
		
		Answer ans1=new Answer();
		ans1.setId(22);
		ans1.setAnswer("variable is like a container");
		q1.setAnswer(ans1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
	    
		s.save(ans);
	    s.save(q);
	    s.save(ans1);
		s.save(q1);
	
	    tx.commit();	
	    
	    Question ques=(Question)s.get(Question.class, 1);
	    System.out.println(ques.getQuestion());
	    System.out.println(ques.getAnswer().getAnswer());
	    
		s.close();
		factory.close();
	}
}
