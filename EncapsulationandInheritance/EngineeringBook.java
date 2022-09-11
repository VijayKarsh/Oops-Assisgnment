package EncapsulationandInheritance;

public class EngineeringBook extends Book{
	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	private String Category;
	
	
}
