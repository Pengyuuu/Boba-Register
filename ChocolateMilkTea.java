
public class ChocolateMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public ChocolateMilkTea() {
		
		description = "Chocolate Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
