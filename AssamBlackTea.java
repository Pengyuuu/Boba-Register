
public class AssamBlackTea extends Drink {
	
	public final boolean COLD = false;
	
	public AssamBlackTea() {
		
		description = "Assam Black Tea";
	}
	
	public double cost() {
		
		return 2.65;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
