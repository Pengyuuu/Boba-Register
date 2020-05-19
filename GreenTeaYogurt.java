
public class GreenTeaYogurt extends Drink {
	
	public final boolean COLD = true;
	
	public GreenTeaYogurt() {
		
		description = "Green Tea Yogurt";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
