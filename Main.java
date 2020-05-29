import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main (String[] args) {
		
		// allows user to keep ordering
		boolean start = true;
		
		// user's cart
		ArrayList<Drink> checkOut = new ArrayList<>();
		
		// creates the menu the user can order from
		ArrayList<MenuItem> menu = readMenu();
		
		while (start) {
			
			printMenu(menu);
			
			orderDrink(menu, checkOut);
			
			start = keepGoing();
		}
	}
	
	/**
	 * Checks if the user wants to keep going
	 * @return	true if user wants to keep going, false otherwise
	 */
	public static boolean keepGoing() {
		
		Scanner scan = new Scanner(System.in);
		
		// Ask if user wants to keep shopping
		System.out.print("Do you want to continue shopping? Y/N: ");
		
		String choice = scan.next();
		
		// Keep looping if user doesn't enter a y or n
		while (!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n"))) {
			
			System.out.print("Invalid input. Do you want to continue shopping? Y/N: ");
			
			choice = scan.next();
		}
		
		// If they want to continue return true, else return false
		if (choice.equalsIgnoreCase("Y")) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	/**
	 * Reads in all the drinks from the drinks text file
	 * @return	an arraylist holding all the drinks available for purchase
	 */
	public static ArrayList<MenuItem> readMenu() {
		
		// initialize a menu
		ArrayList<MenuItem> menu = new ArrayList<>();
		
		try {
			
			// read in the file and split the line by ;
			Scanner read = new Scanner(new File("drinks.txt"));
			
			do {
				
				String line = read.nextLine();
				
				String[] tokens = line.split(";");
								
				// change the second string in the line to a double
				double cost = Double.parseDouble(tokens[1]);
				
				// change the third string in the line to a boolean
				boolean cold = Boolean.parseBoolean(tokens[2]);
				
				// adds the menu item to the menu
				menu.add(new MenuItem(tokens[0], cost, cold));
			}
			
			while (read.hasNext());
			
			read.close();
		}
		
		catch (FileNotFoundException fnf) {
			
			System.out.println("File not found");
		}
		
		return menu;
	}
	
	/**
	 * Prints out the menu
	 * @param menu	arraylist with all the drinks
	 */
	public static void printMenu(ArrayList<MenuItem> menu) {
		
		// loop through the whole menu arraylist
		for (int i = 0; i < menu.size(); i++) {
					
			// at a certain index, print out the group the drinks belong to
			if (i == 0) {
						
				System.out.println("Fresh tea: ");
			}
			else if (i == 3) {
				
				System.out.println();
				
				System.out.println("Flavored tea: ");
			}
			else if (i == 22) {
				
				System.out.println();
				
				System.out.println("Yakult/Yogurt: ");
			}
			else if (i == 32) {
				
				System.out.println();
				
				System.out.println("Milk tea: ");
			}
			else if (i == 51) {
				
				System.out.println();

				System.out.println("Fruit juice: ");
			}
			else if (i == 56) {
				
				System.out.println();

				System.out.println("Latte: ");
			}
			else if (i == 58) {
				
				System.out.println();

				System.out.println("Coffee: ");
			}
			else if (i == 62) {
				
				System.out.println();

				System.out.println("Hot drinks: ");
			}
			
			// print out the drink's details
			System.out.println(i + 1 + ". " + menu.get(i));
		}
	}
	
	/**
	 * Prints out the available addons and their prices
	 */
	public static void printAddonMenu() {
		
		// define the addons and their prices
		String[] addons = {"Golden Boba", "Coconut Jelly", "Grass Jelly", "Coffee Jelly", "Rainbow Jelly", "Egg Pudding", "Aloe Vera", "Star Fruit Jelly", "Sea Cream", "Crystal Boba"};
		
		double[] addonPrice = {0.55, 0.55, 0.55, 0.55, 0.55, 0.55, 0.55, 0.55, 0.55, 0.75};
		
		// print loop to print out the addons and their prices
		for (int i = 0; i < addons.length + 1; i++) {
			
			if (i == 10) {
				
				System.out.println(i + 1 + ". Quit");
			}
			else {
				
				System.out.println(i + 1 + ". " + addons[i] + " " + addonPrice[i]);
			}
		}
	}
	
	public static Drink decorateDrink(int choice, Drink order) {
		
		return order;
	}
	public static ArrayList<Drink> orderDrink(ArrayList<MenuItem> menu, ArrayList<Drink> checkOut) {
		
		// creates scanner and drink factory
		Scanner scan = new Scanner(System.in);
		
		DrinkFactory kitchen = new DrinkFactory();
		
		// prints the menu
		printMenu(menu);
		
		// user orders the drink
		System.out.print("\n" + "What drink would you like to order?: ");
		
		int choice = scan.nextInt();
		
		Drink order = kitchen.getDrink(menu.get(choice).getName());
		
		// user decorates the drink with addons
		System.out.print("\n" + "Do you want addons? Y/N: ");
		
		String addonChoice = scan.next();
		
		// validate it
		while (!(addonChoice.equalsIgnoreCase("y") || addonChoice.equalsIgnoreCase("n"))) {
			
			System.out.print("Invalid input. Do you want addons? Y/N: ");
			
			addonChoice = scan.next();
		}
		
		if (addonChoice.equalsIgnoreCase("Y")) {
			
			// print out addons menu
			while (choice != 11) {
				
				printAddonMenu();
				
				// get user's choice
				System.out.print("\n" + "Select an addon: ");
				
				choice = scan.nextInt();
				
				// validate user's choice
				while (choice < 1 || choice > 11) {
					
					System.out.print("\n" + "Invalid input. Select an addon: ");
					
					choice = scan.nextInt();
				}
				
			}
			
		}
		// adds the drink to their cart
		checkOut.add(order);
		
		return checkOut;
	}
}


