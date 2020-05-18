
public class StarFruitJelly extends DrinkDecorator {
	
	Drink drink;
	
	private static final double COST = 0.55;

	public StarFruitJelly(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", star fruit jelly";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
