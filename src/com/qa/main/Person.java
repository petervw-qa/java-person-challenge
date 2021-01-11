package com.qa.main;

public class Person {
	
	// variables 
	private String name;
	private int age;
	private String jobTitle;
	
	
	// constructor for exercise purposes
	
	public Person () { }

	
	// getter and setter for variable name 
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// getter and setter for variable age
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter and setter for variable jobTitle
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
	

}
