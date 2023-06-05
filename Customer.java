package Customer;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String firstName, String lastName, String socSecurityNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getSocSecurityNum() {
		return this.socSecurityNum;
	}
	public Address getBillingAddress() {
		return this.billingAddress;
	}
	public Address getShippingAddress() {
		return this.shippingAddress;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public void setShippingAddress( Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String getCustomer() {
		
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
				+ "]";
	}
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
				+ "]";
	}
	
	
	

}
