
public class BrownSugarMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public BrownSugarMilkTea() {
		
		description = "Brown Sugar Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
