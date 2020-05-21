
public class JasmineGreenTeaLatte extends Drink{
	
	public final boolean COLD = false;
	
	public JasmineGreenTeaLatte() {
		
		description = "Jasmine Green Tea Latte";
	}
	
	public double cost() {
		
		return 3.45;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
