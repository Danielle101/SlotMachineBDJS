package SlotMachine1;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class machineMain {

	public static void main(String[] args) {
		File slot = new File("slot.wav");
		// PlaySound(slot);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to the BDJS SLOT MACHINE!");
		System.out.println("You have 1000 credits!");
		System.out.println("How much would you like to bet?:");
		int input = 0;
		input = sc.nextInt();
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
