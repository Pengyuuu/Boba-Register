
public class KiwiGreenTea extends Drink {

	public final boolean COLD = true;
	
	public KiwiGreenTea() {
		
		description = "Kiwi Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
