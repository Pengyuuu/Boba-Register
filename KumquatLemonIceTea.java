
public class KumquatLemonIceTea extends Drink {

	public final boolean COLD = true;
	
	public KumquatLemonIceTea() {
		
		description = "Kumquat Lemon Ice Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
