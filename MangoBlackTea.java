
public class MangoBlackTea extends Drink {

	public final boolean COLD = true;
	
	public MangoBlackTea() {
		
		description = "Mango Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
