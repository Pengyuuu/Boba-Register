
public class Upgrade extends DrinkDecorator {
	
	Drink drink;
	
	private static final double COST = 0.55;

	public Upgrade (Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", upgrade";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
