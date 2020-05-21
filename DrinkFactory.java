
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
		else if (type.equalsIgnoreCase("Green Tea Yakult")) {
			
			return new GreenTeaYakult();
		}
		else if (type.equalsIgnoreCase("Green Tea Yogurt")) {
			
			return new GreenTeaYogurt();
		}
		else if (type.equalsIgnoreCase("Passion Fruit Yakult")) {
			
			return new PassionFruitYakult();
		}
		else if (type.equalsIgnoreCase("Passion Fruit Yogurt")) {
			
			return new PassionFruitYogurt();
		}
		else if (type.equalsIgnoreCase("Lychee Yakult")) {
			
			return new LycheeYakult();
		}
		else if (type.equalsIgnoreCase("Lychee Yogurt")) {
			
			return new LycheeYogurt();
		}
		else if (type.equalsIgnoreCase("Mango Yakult")) {
			
			return new MangoYakult();
		}
		else if (type.equalsIgnoreCase("Mango Yogurt")) {
			
			return new MangoYogurt();
		}
		else if (type.equalsIgnoreCase("Strawberry Yakult")) {
			
			return new StrawberryYakult();
		}
		else if (type.equalsIgnoreCase("Strawberry Yogurt")) {
			
			return new StrawberryYogurt();
		}
		
		// Milk tea section
		else if (type.equalsIgnoreCase("Signature Milk Tea")) {
			
			return new SignatureMilkTea();
		}
		else if (type.equalsIgnoreCase("Jasmine Green Milk Tea")) {
			
			return new JasmineGreenMilkTea();
		}
		else if (type.equalsIgnoreCase("Oolong Milk Tea")) {
			
			return new OolongMilkTea();
		}
		else if (type.equalsIgnoreCase("Coffee Milk Tea")) {
			
			return new CoffeeMilkTea();
		}
		else if (type.equalsIgnoreCase("Taro Milk Tea")) {
			
			return new TaroMilkTea();
		}
		else if (type.equalsIgnoreCase("Matcha Milk Tea")) {
			
			return new MatchaMilkTea();
		}
		else if (type.equalsIgnoreCase("Chocolate Milk Tea")) {
			
			return new ChocolateMilkTea();
		}
		else if (type.equalsIgnoreCase("Honey Milk Tea")) {
			
			return new HoneyMilkTea();
		}
		else if (type.equalsIgnoreCase("Strawberry Milk Tea")) {
			
			return new StrawberryMilkTea();
		}
		else if (type.equalsIgnoreCase("Lychee Milk Tea")) {
			
			return new LycheeMilkTea();
		}
		else if (type.equalsIgnoreCase("Winter Melon Milk Tea")) {
			
			return new WinterMelonMilkTea();
		}
		else if (type.equalsIgnoreCase("Peach Milk Tea")) {
			
			return new PeachMilkTea();
		}
		else if (type.equalsIgnoreCase("Mango Milk Tea")) {
			
			return new MangoMilkTea();
		}
		else if (type.equalsIgnoreCase("Passion Fruit Milk Tea")) {
			
			return new PassionFruitMilkTea();
		}
		else if (type.equalsIgnoreCase("Brown Sugar Milk Tea")) {
			
			return new BrownSugarMilkTea();
		}
		else if (type.equalsIgnoreCase("Hazelnut Milk Tea")) {
			
			return new HazelnutMilkTea();
		}
		else if (type.equalsIgnoreCase("Vanilla Milk Tea")) {
			
			return new VanillaMilkTea();
		}
		else if (type.equalsIgnoreCase("Hokkaido Black Milk Tea (Caramel)")) {
			
			return new HokkaidoBlackMilkTea();
		}
		else if (type.equalsIgnoreCase("Hokkaido Oolong Milk Tea (Toffee Candy)")) {
			
			return new HokkaidoOolongMilkTea();
		}
		
		// Fruit Juice part
		else if (type.equalsIgnoreCase("Aloe Vera Kiwi Juice")) {
			
			return new AloeVeraKiwiJuice();
		}
		else if (type.equalsIgnoreCase("Aloe Vera Honey Juice")) {
			
			return new AloeVeraHoneyJuice();
		}
		else if (type.equalsIgnoreCase("Plum Lemon Juice")) {
			
			return new PlumLemonJuice();
		}
		else if (type.equalsIgnoreCase("Honey Lemon Juice")) {
			
			return new HoneyLemonJuice();
		}
		else if (type.equalsIgnoreCase("Passion Fruit Juice")) {
			
			return new PassionFruitJuice();
		}
		
		// Latte part
		else if (type.equalsIgnoreCase("Black Tea Latte")) {
			
			return new BlackTeaLatte();
		}
		else if (type.equalsIgnoreCase("Jasmine Green Tea Latte")) {
			
			return new JasmineGreenTeaLatte();
		}
		else {
			
			return null;
		}
	}
}
