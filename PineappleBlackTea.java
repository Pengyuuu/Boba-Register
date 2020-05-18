
public class PineappleBlackTea extends Drink {

	public final boolean COLD = true;
	
	public PineappleBlackTea() {
		
		description = "Pineapple Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
