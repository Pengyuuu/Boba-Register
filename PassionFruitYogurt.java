
public class PassionFruitYogurt extends Drink {
	
	public final boolean COLD = true;
	
	public PassionFruitYogurt() {
		
		description = "Passion Fruit Yogurt";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
