package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Peter");
		p1.setAge(23);
		p1.setJobTitle("SDET Trainee");
		System.out.println(p1.toString());
		
		Person p2 = new Person();
		p2.setName("Joel");
		p2.setAge(90);
		p2.setJobTitle("Pensioner");
		System.out.println(p2.toString());
		
		Person p3 = new Person();
		p3.setName("Nick");
		p3.setAge(26);
		p3.setJobTitle("SDET Full Role");
		System.out.println(p3.toString());
		
		
		PersonList ListOfPeople = new PersonList();
		ListOfPeople.addToList(p1);
		ListOfPeople.addToList(p2);
		ListOfPeople.addToList(p3);
		
		ListOfPeople.nameSearch("Peter");
		
	}

}
