package Com.Techment.AggregationandEncapsulation;
import Com.Techment.AggregationandEncapsulation.Address;

public class Customer {
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param customerName
	 * @param residentialAddress
	 */
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	private String customerName;
	Address residentialAddress;
	Address City;
	
	public String getCustomerDetails()
	{
		String cuString =String.format("Customer : " +this.getCustomerName()+"\n"+"Residential Address : "+this.residentialAddress.getAddressDetails()+" , "+this.City.getAddressDetails());
		System.out.println(cuString);
		return cuString;
	}
}
