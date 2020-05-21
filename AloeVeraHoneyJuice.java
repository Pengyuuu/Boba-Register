
public class AloeVeraHoneyJuice extends Drink{
	
	public final boolean COLD = true;
	
	public AloeVeraHoneyJuice() {
		
		description = "Aloe Vera Honey Juice";
	}
	
	public double cost() {
		
		return 3.15;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
