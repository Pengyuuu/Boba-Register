
public class HoneyBlackTea extends Drink {

	public final boolean COLD = true;
	
	public HoneyBlackTea() {
		
		description = "Honey Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
