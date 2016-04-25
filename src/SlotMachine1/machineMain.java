package SlotMachine1;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class machineMain {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		File slot = new File("slot.wav");
		
		System.out.println("Welcome to the BDJS SLOT MACHINE!");
		System.out.println("You have 1000 credits!");
		
		String keepPlaying = "y";
		while(keepPlaying.equalsIgnoreCase("y")){
		System.out.print("How much would you like to bet?:");
		int input = sc.nextInt();
		sc.nextLine();
		player.setBet(input);
		//subtract bet from bank
		player.setBank(player.getBank()-player.getBet());
		PlaySound(slot);
		slots.checkWin();
		
		System.out.print("Would you like to try your luck again (y/n): ");
		keepPlaying = sc.nextLine();
		}//end while to keep going
		System.out.println("Thanks for playing.");
		System.out.println("Please cash out at the front desk.");
	}

//	PlaySound method plays clip from file (taken from input)
	public static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		} catch (Exception e) {

		}
	}

}
