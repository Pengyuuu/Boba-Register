
public class JasmineGreenTea extends Drink {

	public final boolean COLD = false;
	
	public JasmineGreenTea() {
		
		description = "Jasmine Green Tea";
	}
	
	public double cost() {
		
		return 2.65;
	}

	public boolean optionalTemperature() {
		
		return COLD;
	}
}
