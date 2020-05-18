
public class PeachGreenTea extends Drink {

	public final boolean COLD = true;
	
	public PeachGreenTea() {
		
		description = "Peach Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
