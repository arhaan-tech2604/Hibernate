package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MMEmp {

	@Id
	private int empid;
	private String name;
	
	@ManyToMany
	private List<MMProject> project;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MMProject> getProject() {
		return project;
	}

	public void setProject(List<MMProject> project) {
		this.project = project;
	}

	public MMEmp(int empid, String name, List<MMProject> project) {
		super();
		this.empid = empid;
		this.name = name;
		this.project = project;
	}

	public MMEmp() {
		super();
	}	
}