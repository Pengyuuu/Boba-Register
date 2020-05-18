
public class PassionFruitGreenTea extends Drink {

	public final boolean COLD = true;
	
	public PassionFruitGreenTea() {
		
		description = "Passion Fruit Green Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
