
public class PineappleGreenTea extends Drink {

	public final boolean COLD = true;
	
	public PineappleGreenTea() {
		
		description = "Pineapple Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
