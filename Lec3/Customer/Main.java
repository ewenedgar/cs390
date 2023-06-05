package Customer;


public class Main {
	/*
	String firstName, lastName, socSecurityNum;
	String state, street, zip, city;
	Customer c1 = new Customer(firstName, lastName, socSecurityNum);
	Address add1 = new Address(street, city, state, zip);*/
	
	public static void main(String[] args) {
		Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
		Customer c2 = new Customer("Job", "Mike", "222-221-4444");
		Customer c3 = new Customer("John", "Sara", "112-221-4444");
		
		Address ad1 = new Address("4th", "Iowa", "USA", "52557");
		Address ad2 = new Address("4th", "Chicago", "USA", "52557");
		Address ad3 = new Address("4th", "Chicago", "USA", "52557");
		
		c1.setBillingAddress(ad3);
		c2.setBillingAddress(ad2);
		c3.setBillingAddress(ad1);
		
		Address ad4 = new Address("4th", "Iowa", "USA", "52557");
		Address ad5 = new Address("4th", "Chicago", "USA", "52557");
		Address ad6 = new Address("4th", "Chicago", "USA", "52557");
		
		c1.setShippingAddress(ad4);
		c2.setShippingAddress(ad5);
		c3.setShippingAddress(ad6);
		
		Address[] str = {c1.getBillingAddress(), c2.getBillingAddress(), c3.getBillingAddress()};
		String[] str1 = {c1.toString(), c2.toString(), c3.toString()};
		
		/*
		for(Address i : str) {
			if(i.getCity().equals("Chicago") == true)
				System.out.println(i + " here ");
		} */
		
		
			for(int i=0; i < str.length; i++) {
				
				if(str[i].getCity().equals("Chicago") == true)
					System.out.println(str1[i] + " here ");
			}
		
		//System.out.println(c1.getBillingAddress() + " her");
		
		
	}
	
	

}
