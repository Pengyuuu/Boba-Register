
public class LycheeYakult extends Drink {
	
	public final boolean COLD = true;
	
	public LycheeYakult() {
		
		description = "Lychee Yakult";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
