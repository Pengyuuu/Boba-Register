
public class HoneyLemonJuice extends Drink{
	
	public final boolean COLD = true;
	
	public HoneyLemonJuice() {
		
		description = "Honey Lemon Juice";
	}
	
	public double cost() {
		
		return 3.15;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
