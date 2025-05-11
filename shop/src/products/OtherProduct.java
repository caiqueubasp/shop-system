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

}
