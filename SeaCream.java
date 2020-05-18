
public class SeaCream extends DrinkDecorator {

	Drink drink;
	
	private static final double COST = 0.55;
	
	public SeaCream(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", sea cream";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
