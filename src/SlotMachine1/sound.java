package SlotMachine1;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
	static File slot = new File("slot.wav");
	static File win = new File("win.wav");
	public static File getWin() {
		return win;
	}

	public static File getSlot() {
		return slot;
	}

	public static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		} catch (Exception e) {

		}
	}
}
