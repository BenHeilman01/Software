package libraryPackage;

public class AddressTemplate {
	
	
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	
	
	public AddressTemplate() {}
	
	

	public AddressTemplate(String streetAddress, String city, String state, int zipcode) {
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
	public int getZipeCode() {
		return this.zipCode;
	}
	public void SetZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
}
