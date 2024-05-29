package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started...!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("com/practice/hiber.cfg.xml");
        SessionFactory s=cfg.buildSessionFactory();
        
        Student_details sd=new Student_details();
        sd.setSrno(3);
        sd.setName("Sameer Siddiqui");
        sd.setAge(20);
        sd.setAddress("Nalasopra");
        
        System.out.println(sd);
        
        Session session=s.openSession();
        Transaction tx=session.beginTransaction();
        session.save(sd);
        tx.commit();
        
        s.close();
        
    }
}
