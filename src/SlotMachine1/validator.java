package SlotMachine1;


public class validator {
	

	int playerbank = 50;
	
	// Validates that input is an integer value
	public static int readValidInt() {
		while (!machineMain.sc.hasNextInt()) {
			machineMain.sc.nextLine();
			System.out.print("Please enter a valid number: ");
		}
		int x = machineMain.sc.nextInt();
		machineMain.sc.nextLine();
		return x;
	}
	// Validates that input is within the range you set.  Will need to be called in main.
	public static int getValidInt(int min, int max) {
		int i = readValidInt();
		while (i < min || i > max) {
			System.out.print("Bruh, you know you only have " + player.getBank() + " dollars:");  // this can be changed to needed values
			i = readValidInt();
		}
		return i;
	}

}
