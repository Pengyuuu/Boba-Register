
public class HazelnutMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public HazelnutMilkTea() {
		
		description = "Hazelnut Sugar Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
