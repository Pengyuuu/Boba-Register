
public class HoneyGreenTea extends Drink {

	public final boolean COLD = true;
	
	public HoneyGreenTea() {
		
		description = "Honey Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
