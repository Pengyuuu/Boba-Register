
public class LonganMilkTea extends Drink{
	
	public final boolean COLD = false;
	
	public LonganMilkTea() {
		
		description = "Longan Milk Tea";
	}
	
	public double cost() {
		
		return 3.05;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
