

package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoMany {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("com/mapping/hiberOne.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		MMEmp em=new MMEmp();
		MMEmp em1=new MMEmp();
		em.setEmpid(1);
		em.setName("Bilal Siddiqui");
		em1.setEmpid(2);
		em1.setName("Aadil Noor");
		
		MMProject proj=new MMProject();
		MMProject proj1=new MMProject();
		proj.setProjectId(43);
		proj.setProject_Name("Manage a Excel Sheet");
		proj1.setProjectId(78);
		proj1.setProject_Name("chat box");
		
		List<MMEmp> emp=new ArrayList<MMEmp>();
		emp.add(em);
		emp.add(em1);
		
		List<MMProject> pro=new ArrayList<MMProject>();
		pro.add(proj);
		pro.add(proj1);
		
		em.setProject(pro);
		proj1.setEmp(emp);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(em);
		s.save(em1);
		s.save(proj);
		s.save(proj1);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
