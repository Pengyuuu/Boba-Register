
public class JasmineGreenMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public JasmineGreenMilkTea() {
		
		description = "Jasmine Green Milk Tea";
	}
	
	public double cost() {
		
		return 3.35;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
