
public class GingerTea extends Drink{
	
	public final boolean COLD = false;
	
	public GingerTea() {
		
		description = "Ginger Tea";
	}
	
	public double cost() {
		
		return 3.05;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
