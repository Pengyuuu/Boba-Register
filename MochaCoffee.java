
public class MochaCoffee extends Drink{
	
	public final boolean COLD = false;
	
	public MochaCoffee() {
		
		description = "Mocha Coffee";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
