package products;

public class Product {
	
	private String name;
	private double price;
	private double discount;
	private double tax;	
	
	public Product() {

	}


	public Product(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	// method price with discount and including taxes
	public double getRealPrice() {
		return (this.getPrice() - this.getDiscount()) + this.getTax();
	}
	
	
	// Method to override toString and show better information of class
	@Override
	public String toString() {
		return 
			"Name: " + this.getName() + " - " +
			"Discount: " + String.format("%.2f", this.getDiscount()) + " - " +
			"Tax: " + String.format("%.2f", this.getTax()) + " - " +
			"Price: " + String.format("%.2f", this.getPrice())  + " - " +
			"Real Price: " + String.format("%.2f", this.getRealPrice());
	}
	

}
