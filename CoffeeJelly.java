
public class CoffeeJelly extends DrinkDecorator {

	Drink drink;
	
	private static final double COST = 0.55;
	
	public CoffeeJelly(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", coffee jelly";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
