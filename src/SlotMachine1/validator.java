package SlotMachine1;

import java.util.Scanner;

public class validator {
	
	static Scanner sc = new Scanner(System.in);
	int playerbank = 50;
	
	// Validates that input is an integer value
	public static int readValidInt() {
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Please enter a valid number: ");
		}
		int x = sc.nextInt();
		sc.nextLine();
		return x;
	}
	// Validates that input is within the range you set.  Will need to be called in main.
	public static int getValidInt(int min, int max) {
		int i = readValidInt();
		while (i < min || i > max) {
			System.out.print("Bruh, you know you only have " + playerbank + " dollars:");  // this can be changed to needed values
			i = readValidInt();
		}
		return i;
	}

}
