
public class HokkaidoBlackMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public HokkaidoBlackMilkTea() {
		
		description = "Hokkaido Black Milk Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
