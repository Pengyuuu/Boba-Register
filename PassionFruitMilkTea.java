
public class PassionFruitMilkTea extends Drink {
	
	public final boolean COLD = true;
	
	public PassionFruitMilkTea() {
		
		description = "Passion Fruit Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
