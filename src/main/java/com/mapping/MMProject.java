package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MMProject {

	@Id
	private int projectId;
	private String Project_Name;
	
	@ManyToMany(mappedBy = "project")
	private List<MMEmp> emp;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}

	public List<MMEmp> getEmp() {
		return emp;
	}

	public void setEmp(List<MMEmp> emp) {
		this.emp = emp;
	}

	public MMProject(int projectId, String project_Name, List<MMEmp> emp) {
		super();
		this.projectId = projectId;
		Project_Name = project_Name;
		this.emp = emp;
	}

	public MMProject() {
		super();
	}
}
