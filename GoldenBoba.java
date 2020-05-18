
public class GoldenBoba extends DrinkDecorator{
	
	Drink drink;
	
	private final double COST = 0.55;
	
	public GoldenBoba(Drink drink) {
		
		this.drink = drink;
	}
	
	public String getDescription() {
		
		return drink.getDescription() + ", golden boba";
	}
	
	public double cost() {
		
		return drink.cost() + COST;
	}
}
