
public class OolongTea extends Drink {
	
	public final boolean COLD = false;
	
	public OolongTea () {
		
		description = "Oolong Tea";
	}
	public double cost() {
		
		return 2.65;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
