package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_details {

	@Id
	private int Srno;
	private String Name;
	private String Address;
	private int Age;

	public Student_details(int srno, String name, String address, int age) {
		super();
		Srno = srno;
		Name = name;
		Address = address;
		Age = age;
	}

	public Student_details() {
		super();
	}

	public int getSrno() {
		return Srno;
	}

	public void setSrno(int srno) {
		Srno = srno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return this.Srno+" : "+Name+" : "+Address+" : "+Age;
	}
}
