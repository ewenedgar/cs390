package Customer;
public class Address {
	//street, city, state and zip
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String street, String city, String state,String zip) {
		this.city = city;
		this.street = street;
		this.state = state;
		this.zip = zip;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public String getZip() {
		return this.zip;
	}
	public String toString() {
		return "[ City: " + city + ", Street: " + street + ", " + "State: " + state
				+ "]";
	}

}
