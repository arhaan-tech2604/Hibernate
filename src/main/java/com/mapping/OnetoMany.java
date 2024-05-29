package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoMany {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("com/mapping/hiberOne.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		OMQuestion q=new OMQuestion();
		q.setQuestion_id(1);
		q.setQuestion("What is python?");
		
		OMAnswer ans=new OMAnswer();
		ans.setAnswer_id(67);
		ans.setAnswer("Python is a high-level, interpreted programming language");
	    ans.setQuestion(q);
	    
	    OMAnswer ans1=new OMAnswer();
		ans1.setAnswer_id(89);
		ans1.setAnswer("Python emphasizes code readability and expressiveness");
	    ans1.setQuestion(q);
	    
	    List<OMAnswer> a=new ArrayList<OMAnswer>();
	    a.add(ans);
	    a.add(ans1);
	    q.setAnswer(a);
	    
	    Session session=factory.openSession();
	    Transaction tx=session.beginTransaction();
	    session.save(q);
	    session.save(ans);
	    session.save(ans1);
	    
	    OMQuestion qa=(OMQuestion)session.get(OMQuestion.class, 1);
	    System.out.println(qa.getQuestion());
	    
	    for (OMAnswer omAnswer : qa.getAnswer()) {
			System.out.println(omAnswer.getAnswer());
		}
	    
	    tx.commit();
	    session.close();
	    factory.close();
	}
}
