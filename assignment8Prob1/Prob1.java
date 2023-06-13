package assignment8Prob1;

	class Prob1{ 

	    public static void main(String[] args) {
	        PersonList personList = new PersonList();

	        // Adding persons to the list
	        personList.addPerson(new Person("joe", "joe", 25));
	        personList.addPerson(new Person("Bob", "Bobby", 40));
	        personList.addPerson(new Person("Ann", "Anna", 10));
	        personList.addPerson(new Person("Alice", "Clice", 20));

	        // Displaying the list
	        personList.displayList();

	        // Searching for a person by last name
	        String searchLastName = "Smith";
	        Person foundPerson = personList.findPersonByLastName(searchLastName);
	        if (foundPerson != null) {
	            System.out.println("\nPerson found: " + foundPerson);
	        } else {
	            System.out.println("\nPerson not found.");
	        }
	    }
	}


