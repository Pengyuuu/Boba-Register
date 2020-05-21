
public class AloeVeraKiwiJuice extends Drink{
	
	public final boolean COLD = true;
	
	public AloeVeraKiwiJuice() {
		
		description = "Aloe Vera Kiwi Juice";
	}
	
	public double cost() {
		
		return 3.15;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
