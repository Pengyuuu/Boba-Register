
public class CoconutJelly extends DrinkDecorator {

	Drink drink;
	
	private static double COST = 0.55;
	
	public CoconutJelly(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", coconut jelly";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
