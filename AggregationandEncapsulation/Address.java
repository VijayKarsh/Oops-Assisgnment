/**
 * 
 */
package Com.Techment.AggregationandEncapsulation;

/**
 * @author AjGP
 *
 */
public class Address {
	
	public String getAddressLine() {
		return AddressLine;
	}
	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public Address(String addressLine, String city) {
		super();
		AddressLine = addressLine;
		this.City = city;
	}
	private String AddressLine;
	private String City;
	
	public   String  getAddressDetails() {
		
	String	stringOut=String.format("%s"+" , "+ "%s",getAddressLine(),getCity());
	return stringOut;
		
	}
}
