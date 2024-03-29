package phoneBook;

public class Address {
	
	
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	
	
	
	public Address() {}
	
	

	public Address(String streetAddress, String city, String state, String zipCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;		
	}
 
	public String getStreetAddress() {
		return this.streetAddress;
	}
	public void setStreetAddress(String streetaddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipeCode() {
		return this.zipCode;
	}
	public void SetZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}
	
}
