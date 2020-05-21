
public class LonganTea extends Drink{
	
	public final boolean COLD = false;
	
	public LonganTea() {
		
		description = "Longan Tea";
	}
	
	public double cost() {
		
		return 3.05;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
