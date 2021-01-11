package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
	public List<Person> thePersonList = new ArrayList<>();
	
	public void addToList(Person person) {
		thePersonList.add(person);
	}
	
	public void nameSearch(String name) {
		
		for (Person search : thePersonList) {
			if (search.getName().equals(name));
			System.out.println("This name is in our records.");
		}
		
		
	}
	
	

}
