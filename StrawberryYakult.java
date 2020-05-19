
public class StrawberryYakult extends Drink {
	
	public final boolean COLD = true;
	
	public StrawberryYakult() {
		
		description = "Strawberry Yakult";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
