
public class GingerMilkTea extends Drink{
	
	public final boolean COLD = false;
	
	public GingerMilkTea() {
		
		description = "Ginger Milk Tea";
	}
	
	public double cost() {
		
		return 3.05;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
