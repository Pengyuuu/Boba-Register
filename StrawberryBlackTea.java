
public class StrawberryBlackTea extends Drink {

	public final boolean COLD = true;
	
	public StrawberryBlackTea() {
		
		description = "Strawberry Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
