package interfaceAssignment2;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	Employee(String fname, String lName, String sSN){
		this.firstName = fname;
		this.lastName =  lName;
		this.socialSecurityNumber = sSN;
	}
	public String toString() {
		return "[ "+firstName+" LastName: "+ lastName+
				" SSN: "+ socialSecurityNumber+" ]";
	}
		
	public abstract double getPayment();
	
	

}
