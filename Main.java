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
	
	public static ArrayList readMenu() {
		
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
}


