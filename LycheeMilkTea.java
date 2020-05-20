
public class LycheeMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public LycheeMilkTea() {
		
		description = "Lychee Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
