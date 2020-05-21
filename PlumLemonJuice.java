
public class PlumLemonJuice extends Drink{
	
	public final boolean COLD = true;
	
	public PlumLemonJuice() {
		
		description = "Plum Lemon Juice";
	}
	
	public double cost() {
		
		return 3.15;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
