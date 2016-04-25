package SlotMachine1;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
	// Class calls for audio files
	static File slot = new File("slot.wav");
	static File win = new File("win.wav");
	static File lose = new File("loser.wav");
	public static File getWin() {
		return win;
	}

	public static File getSlot() {
		return slot;
	}
	
	public static File getLoser() {
		return lose;
	}

	// Pulls sound from file and plays, adds delay until file is finished
	public static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {

		}
	}
}
