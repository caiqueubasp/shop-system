package products;

public class Beverage extends Product {
	
	private boolean isAlcoholic;
	

	public Beverage(String name, double price, double discount, boolean isAlcoholic) {
		super(name, price, discount);
		this.isAlcoholic = isAlcoholic;
	}


	public boolean isAlcoholic() {
		return isAlcoholic;
	}




	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}



	// Override the getRealPrice method to include alcoholic tax
	@Override
	public double getRealPrice() {
		if(this.isAlcoholic) {
			double alcoholicTax = super.getRealPrice() * 0.15;
			super.setTax(alcoholicTax);
			return super.getRealPrice();
		}
		return super.getRealPrice();
	}

}
