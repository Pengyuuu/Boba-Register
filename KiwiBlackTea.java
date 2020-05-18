
public class KiwiBlackTea extends Drink {

	public final boolean COLD = true;
	
	public KiwiBlackTea() {
		
		description = "Kiwi Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
