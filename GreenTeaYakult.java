
public class GreenTeaYakult extends Drink {
		
	public final boolean COLD = true;
	
	public GreenTeaYakult() {
		
		description = "Green Tea Yakult";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
