
public class MangoYogurt extends Drink {
	
	public final boolean COLD = true;
	
	public MangoYogurt() {
		
		description = "Mango Yogurt";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
