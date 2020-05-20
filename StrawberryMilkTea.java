
public class StrawberryMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public StrawberryMilkTea() {
		
		description = "Strawberry Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
