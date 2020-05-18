
public class RainbowJelly extends DrinkDecorator {

	Drink drink;
	
	private static final double COST = 0.55;
	
	public RainbowJelly(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", rainbow jelly";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
