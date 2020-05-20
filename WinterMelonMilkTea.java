
public class WinterMelonMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public WinterMelonMilkTea() {
		
		description = "Winter Melon Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
