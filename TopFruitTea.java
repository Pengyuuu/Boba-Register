
public class TopFruitTea extends Drink {

	public final boolean COLD = true;
	
	public TopFruitTea() {
		
		description = "Top Fruit Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
