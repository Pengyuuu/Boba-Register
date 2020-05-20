
public class TaroMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public TaroMilkTea() {
		
		description = "Taro Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
