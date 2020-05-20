
public class MangoMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public MangoMilkTea() {
		
		description = "Mango Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
