
public class HazelnutCoffee extends Drink{
	
	public final boolean COLD = false;
	
	public HazelnutCoffee() {
		
		description = "Hazelnut Coffee";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
