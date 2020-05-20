
public class PeachMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public PeachMilkTea() {
		
		description = "Peach Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
