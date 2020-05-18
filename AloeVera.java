
public class AloeVera extends DrinkDecorator {

	Drink drink;
	
	private static final double COST = 0.55;
	
	public AloeVera(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", aloe vera";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
