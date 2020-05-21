
public class VanillaCoffee extends Drink{
	
	public final boolean COLD = false;
	
	public VanillaCoffee() {
		
		description = "Vanilla Coffee";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
