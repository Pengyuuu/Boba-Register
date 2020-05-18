
public class PeachBlackTea extends Drink {

	public final boolean COLD = true;
	
	public PeachBlackTea() {
		
		description = "Peach Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
