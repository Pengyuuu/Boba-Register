
public class HokkaidoOolongMilkTea extends Drink {
	
	public final boolean COLD = false;
	
	public HokkaidoOolongMilkTea() {
		
		description = "Hokkaido Oolong Milk Tea";
	}
	
	public double cost() {
		
		return 3.25;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}

}
