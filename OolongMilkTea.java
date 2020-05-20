
public class OolongMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public OolongMilkTea() {
		
		description = "Oolong Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
