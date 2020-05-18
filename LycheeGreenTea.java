
public class LycheeGreenTea extends Drink {

	public final boolean COLD = true;
	
	public LycheeGreenTea() {
		
		description = "Lychee Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
