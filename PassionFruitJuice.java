
public class PassionFruitJuice extends Drink{
	
	public final boolean COLD = true;
	
	public PassionFruitJuice() {
		
		description = "Passion Fruit Juice";
	}
	
	public double cost() {
		
		return 3.15;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
