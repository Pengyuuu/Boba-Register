
public class MatchaMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public MatchaMilkTea() {
		
		description = "Matcha Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
