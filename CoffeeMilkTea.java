
public class CoffeeMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public CoffeeMilkTea() {
		
		description = "Coffee Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
