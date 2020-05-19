
public class PassionFruitYakult extends Drink {
	
	public final boolean COLD = true;
	
	public PassionFruitYakult() {
		
		description = "Passion Fruit Yakult";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
