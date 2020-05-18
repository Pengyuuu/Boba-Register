
public class CrystalBoba extends DrinkDecorator {
	
	Drink drink;
	
	private static final double COST = 0.75;

	public CrystalBoba(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", crystal boba";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
