
public class GrassJelly extends DrinkDecorator {

	Drink drink;
	
	private static final double COST = 0.55;
	
	public GrassJelly(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", grass jelly";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
