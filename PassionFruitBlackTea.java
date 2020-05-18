
public class PassionFruitBlackTea extends Drink {

	public final boolean COLD = true;
	
	public PassionFruitBlackTea() {
		
		description = "Passion Fruit Black Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
