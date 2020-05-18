
public class WinterMelonTea extends Drink {

	public final boolean COLD = true;
	
	public WinterMelonTea() {
		
		description = "Winter Melon Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
