
public class MangoYakult extends Drink {
	
	public final boolean COLD = true;
	
	public MangoYakult() {
		
		description = "Mango Yakult";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
