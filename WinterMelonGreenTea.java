
public class WinterMelonGreenTea extends Drink {

	public final boolean COLD = true;
	
	public WinterMelonGreenTea() {
		
		description = "Winter Melon Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
