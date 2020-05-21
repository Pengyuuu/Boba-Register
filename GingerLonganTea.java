
public class GingerLonganTea extends Drink{
	
	public final boolean COLD = false;
	
	public GingerLonganTea() {
		
		description = "Ginger Longan Tea";
	}
	
	public double cost() {
		
		return 3.05;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
