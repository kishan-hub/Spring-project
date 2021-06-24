package com.kishan.constructorinjection;

public class University {
	
	private College college;
	
	public University(College college)
	{
		this.college=college;
	}

	@Override
	public String toString() {
		return "University [college=" + college + "]";
	}
	
}
