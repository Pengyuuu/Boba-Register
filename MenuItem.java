
public class MenuItem {
		
	/** Name of the drink */
	private String name;
	
	/** How much the drink costs */
	private double cost;
	
	/** Can the drink only be served cold */
	private boolean COLD;

	/**
	 * Default constructor
	 */
	public MenuItem() {
		
		name = null;
		
		cost = 0.0;
	}
	
	/**
	 * Constructs a menu item
	 * @param name	name of drink
	 * @param cost	price of drink	
	 * @param COLD	can the drink only be served cold
	 */
	public MenuItem(String name, double cost, boolean COLD) {
		
		this.name = name;
		
		this.cost = cost;
		
		this.COLD = COLD;
	}
	
	/**
	 * Returns if the drink can't be served hot
	 * @return	whether or not the drink can only be served cold
	 */
	public boolean optionalTemperature() {
		
		return COLD;
	}
	
	/**
	 * Prints out the drink with it's name and cost
	 */
	@Override
	public String toString() {
		
		return name + " " + cost;
	}
}
