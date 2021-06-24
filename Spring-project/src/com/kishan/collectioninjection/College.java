package com.kishan.collectioninjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	
	@Autowired
	List<Student> listStudent;

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	
	

}
