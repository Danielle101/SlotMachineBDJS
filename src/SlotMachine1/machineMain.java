package SlotMachine1;

import java.util.Scanner;

public class machineMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to the BDJS SLOT MACHINE!");
		System.out.println("You have 1000 credits!");

		String keepPlaying = "y";

		while (keepPlaying.equalsIgnoreCase("y")) {
			System.out.print("How much would you like to bet?:");

			// Validation for player input...between 1 and money left in bank
			int input = validator.getValidInt(1, player.getBank());
			player.setBet(input);

			// subtract bet from bank
			player.setBank(player.getBank() - player.getBet());
			slots.checkWin();
			if (player.getBank() == 0) {
				System.out.println("Take your BROKE ass home, bro!!");
				return;
			}
			System.out.print("Would you like to try your luck again (y/n): ");
			keepPlaying = validator.readYorN("y", "n");
		} // end while to keep going

		System.out.println("Thanks for playing.");
		System.out.println("Please cash out at the front desk.");
	}

}
