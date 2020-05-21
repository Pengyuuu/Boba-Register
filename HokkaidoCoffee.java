
public class HokkaidoCoffee extends Drink{
	
	public final boolean COLD = false;
	
	public HokkaidoCoffee() {
		
		description = "Hokkaido Coffee";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
