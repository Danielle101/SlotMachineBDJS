package SlotMachine1;

import java.util.Random;

public class slots {
	// Initialize variables for wheels, win check and payouts
	private static int wheel1;
	private static int wheel2;
	private static int wheel3;
	private static int gameWin;
	private static int winnings;

	// Method for RNG for slot machine wheels
	public static int randomGen() {
		Random r = new Random();
		int random = r.nextInt(5) + 1;
		return random;
	}

	// Method to check for wins, each wheel makes a call to RNG method
	public static void checkWin() {
		wheel1 = randomGen();
		wheel2 = randomGen();
		wheel3 = randomGen();
		
		// Prints the slot machine to console
		sound.PlaySound(sound.getSlot());
		printBoard();
		
		// check for win and send to payout
		if (wheel1 == wheel2 && wheel2 == wheel3) {
			gameWin = wheel1;
			payOut();
			System.out.println("You're a Winner!!!!");
			System.out.println("You won + " + winnings);
			sound.PlaySound(sound.getWin());
		} else {
			System.out.println("You lose!" + "\n");
			sound.PlaySound(sound.getLoser());
		}
		System.out.println("Your bank: $" + player.getBank());
	}

	// Switch to show payouts and math for wins
	public static void payOut() {
		switch (gameWin) {
		case 1:
			winnings = player.getBet() * 2;
			player.setBank((player.getBank() + winnings));
			break;
		case 2:
			winnings = player.getBet() * 3;
			player.setBank((player.getBank() + winnings));
			break;
		case 3:
			winnings = player.getBet() * 4;
			player.setBank((player.getBank() + winnings));
			break;
		case 4:
			winnings = player.getBet() * 5;
			player.setBank((player.getBank() + winnings));
			break;
		case 5:
			winnings = player.getBet() * 10;
			player.setBank((player.getBank() + winnings));
			break;
		}
	}

	// Method to print slot machine
	public static void printBoard() {
		System.out.println(wheel1 + " | " + wheel2 + " | " + wheel3);
	}
}
