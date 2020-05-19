
public class StrawberryYogurt extends Drink {
	
	public final boolean COLD = true;
	
	public StrawberryYogurt() {
		
		description = "Strawberry Yogurt";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
