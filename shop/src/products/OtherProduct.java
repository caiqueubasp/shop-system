package products;

public class OtherProduct extends Product {

	private String description;

	public OtherProduct(String name, double price, double discount, String description) {
		super(name, price, discount);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// Method to override toString and show description value
		@Override
		public String toString() {
			return 
				"Name: " + this.getName() + " - " +
				"Description: " + this.getDescription() + " - " +
				"Price: " + String.format("%.2f", this.getPrice())  + " - " +
				"Real Price: " + String.format("%.2f", this.getRealPrice());
		}

}
