package SlotMachine1;

import java.util.Scanner;

public class machineMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		printGreeting();

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

	/**
	 * 
	 */
	public static void printGreeting() {
		System.out.println("Welcome to the BDJS SLOT MACHINE!\n");
		System.out.println("Rules of the Game:");
		System.out.println(
				"1. You may not bid more than the amount that you have in your bank.\n" + "2. You may not bid zero.\n"
						+ "3. If all three numbers on all three wheels match then you are a winner!\n");

		System.out.println("Winner Payout Chart:\nTriple 1s : You win your bet amount x 2\n"
				+ "Triple 2s : You win your bet amount x 3\nTriple 3s : You win your bet amount x 4\n"
				+ "Triple 4s : You win your bet amount x 5\nTriple 5s : You win your bet amount x 10\n");

		System.out.println("You have 1000 credits!");
	}

}
