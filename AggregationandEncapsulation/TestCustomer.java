package Com.Techment.AggregationandEncapsulation;
import Com.Techment.AggregationandEncapsulation.Address;
public class TestCustomer {

	public static void main(String[] args) {
		Address ad=new Address("Ist Main HSR Layout", "Bangalore");
		Address residentialAddress = new Address("Ist Main HSR Layout", "Bangalore");
		Customer cust1=new Customer();
		cust1.setResidentialAddress(residentialAddress);
		cust1.setCustomerName("vijay");
		System.out.println("Customer Name : "+cust1.getCustomerName());
		System.out.println("ResidentialAddress : "+ad.getAddressLine());
		System.out.println("City : "+ad.getCity());
		System.out.println( new Customer("Rahul",residentialAddress).getCustomerDetails());
		
		
	}

}
