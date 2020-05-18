
public class DrinkFactory {

	/**
	 * Creates a drink object based on user's choice
	 * @param type	user's choice of drink
	 * @return		user's drink
	 */
	public Drink getDrink(String type) {
		
		// Fresh tea section
		if (type.equalsIgnoreCase("Assam black Tea")) {
			
			return new AssamBlackTea();
		}
		else if (type.equalsIgnoreCase("Jasmine Green Tea")) {
			
			return new JasmineGreenTea();
		}
		else if (type.equalsIgnoreCase("Oolong Tea")) {
			
			return new OolongTea();
		}
		
		// Flavored tea section
		else if (type.equalsIgnoreCase("Peach Green Tea")) {
			
			return new PeachGreenTea();
		}
		else if (type.equalsIgnoreCase("Peach Black Tea")) {
			
			return new PeachBlackTea();
		}
		else if (type.equalsIgnoreCase("Passion Fruit Green Tea")) {
			
			return new PassionFruitGreenTea();
		}
		else if (type.equalsIgnoreCase("Passion Fruit Black Tea")) {
			
			return new PassionFruitBlackTea();
		}
		else if (type.equalsIgnoreCase("Strawberry Green Tea")) {
			
			return new StrawberryGreenTea();
		}
		else if (type.equalsIgnoreCase("Strawberry Black Tea")) {
			
			return new StrawberryBlackTea();
		}
		else if (type.equalsIgnoreCase("Mango Green Tea")) {
			
			return new MangoGreenTea();
		}
		else if (type.equalsIgnoreCase("Mango Black Tea")) {
			
			return new MangoBlackTea();
		}
		else if (type.equalsIgnoreCase("Lychee Green Tea")) {
			
			return new LycheeGreenTea();
		}
		else if (type.equalsIgnoreCase("Lychee Black Tea")) {
			
			return new LycheeBlackTea();
		}
		else if (type.equalsIgnoreCase("Honey Green Tea")) {
			
			return new HoneyGreenTea();
		}
		else if (type.equalsIgnoreCase("Honey Black Tea")) {
			
			return new HoneyBlackTea();
		}
		else if (type.equalsIgnoreCase("Pineapple Green Tea")) {
			
			return new PineappleGreenTea();
		}
		else if (type.equalsIgnoreCase("Pineapple Black Tea")) {
			
			return new PineappleBlackTea();
		}
		else if (type.equalsIgnoreCase("Kiwi Green Tea")) {
			
			return new KiwiGreenTea();
		}
		else if (type.equalsIgnoreCase("Kiwi Black Tea")) {
			
			return new KiwiBlackTea();
		}
		else if (type.equalsIgnoreCase("Winter Melon Tea")) {
			
			return new WinterMelonTea();
		}
		else if (type.equalsIgnoreCase("Winter Melon Green Tea")) {
			
			return new WinterMelonGreenTea();
		}
		else if (type.equalsIgnoreCase("Kumquat Tea")) {
			
			return new KumquatTea();
		}
		else if (type.equalsIgnoreCase("Kumquat Lemon Ice Tea")) {
			
			return new KumquatLemonIceTea();
		}
		else if (type.equalsIgnoreCase("Top Fruit Tea")) {
			
			return new TopFruitTea();
		}
		
		// Yakult and Yogurt section
		else {
			
			return null;
		}
	}
}
