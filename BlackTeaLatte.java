
public class BlackTeaLatte extends Drink{
	
	public final boolean COLD = false;
	
	public BlackTeaLatte() {
		
		description = "Black Tea Latte";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
