package assignment8Prob1;

import java.util.ArrayList;

public class PersonList {
	 private ArrayList<Person> personList;

	    public PersonList() {
	        personList = new ArrayList<>();
	    }

	    public void addPerson(Person person) {
	        personList.add(person);
	    }

	    public void displayList() {
	        for (Person person : personList) {
	            System.out.println(person);
	        }
	    }

	    public Person findPersonByLastName(String lastName) {
	        for (Person person : personList) {
	            if (person.getLastName().equalsIgnoreCase(lastName)) {
	                return person;
	            }
	        }
	        return null; // Person not found
	    }
}
