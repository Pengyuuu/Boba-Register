
public class LycheeBlackTea extends Drink {

	public final boolean COLD = true;
	
	public LycheeBlackTea() {
		
		description = "Lychee Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
