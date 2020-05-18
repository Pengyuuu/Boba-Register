
public class KumquatTea extends Drink {

	public final boolean COLD = false;
	
	public KumquatTea() {
		
		description = "Kumquat Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}

