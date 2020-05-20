
public class VanillaMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public VanillaMilkTea() {
		
		description = "Vanilla Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
