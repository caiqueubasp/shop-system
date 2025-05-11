package products;

public class Food extends Product {
	
	private boolean hasFatTax;

	public Food(String name, double price, double discount, boolean hasFatTax) {
		super(name, price, discount);
		this.hasFatTax = hasFatTax;
	}

	public boolean isHasFatTax() {
		return hasFatTax;
	}

	public void setHasFatTax(boolean hasFatTax) {
		this.hasFatTax = hasFatTax;
	}
	
	@Override
	public double getRealPrice() {
		if(this.hasFatTax) {
			double alcoholicTax = super.getRealPrice() * 0.20;
			super.setTax(alcoholicTax);
			return super.getRealPrice();
		}
		return super.getRealPrice();
	}

}
