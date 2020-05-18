
public class EggPudding extends DrinkDecorator {
	
	Drink drink;
	
	private static final double COST = 0.55;

	public EggPudding(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", egg pudding";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
