
public class MangoGreenTea extends Drink {

	public final boolean COLD = true;
	
	public MangoGreenTea() {
		
		description = "Mango Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
