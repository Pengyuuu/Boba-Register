
public class HoneyMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public HoneyMilkTea() {
		
		description = "Honey Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
