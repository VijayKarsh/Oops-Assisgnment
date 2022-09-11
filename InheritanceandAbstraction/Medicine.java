package InheritanceandAbstraction;

public class Medicine {
	String date;
	int P;
	public void getDetails(int P,String date)
	{;
	}
	public void displayLabel(){
		System.out.println("Company : Globex Pharma");
		System.out.println("Address : Bangalore");
		}
	}
class Tablet extends Medicine{
public void displayLabel(){
	System.out.println("Tablet" );
	System.err.println("store in a cool dry place");
	}
}
class Syrup extends Medicine{
	public void displayLabel(){
		System.out.println("syrup");
		System.err.println("Consumption as directed by thephysician");
		}
	}
class Ointment extends Medicine{
	public void displayLabel(){
		System.out.println("Ointment");
		System.err.println("for external use only");
		}
	}
