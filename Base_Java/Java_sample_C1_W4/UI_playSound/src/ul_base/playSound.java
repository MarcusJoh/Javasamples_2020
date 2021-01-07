package ul_base;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class playSound {

	public void play() {

		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("pop.wav")));
			clip.start();

		} catch (Exception exc) {
			System.out.println("The specified audio file is not supported.");

		}

	}
}