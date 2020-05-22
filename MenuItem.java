
public class MenuItem {
		
	private String name;
	
	private double cost;
	
	private boolean COLD;

	public MenuItem() {
		
		name = null;
		
		cost = 0.0;
	}
	
	public MenuItem(String name, double cost, boolean COLD) {
		
		this.name = name;
		
		this.cost = cost;
		
		this.COLD = COLD;
	}
	
	public boolean optionalTemperature() {
		
		return COLD;
	}
}
