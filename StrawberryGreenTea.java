
public class StrawberryGreenTea extends Drink {

	public final boolean COLD = true;
	
	public StrawberryGreenTea() {
		
		description = "Strawberry Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
