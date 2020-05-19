
public class LycheeYogurt extends Drink {
	
	public final boolean COLD = true;
	
	public LycheeYogurt() {
		
		description = "Lychee Yogurt";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
