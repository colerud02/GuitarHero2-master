package GH;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Game.Game;
import Graphics.GameFrame;
import Graphics.Buttons;

public class Main {
	GameFrame gf;
	Game g;
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(
			"Foo_Fighters_-_The_Pretender.wav"));
	//AudioClip sound13 = JApplet.newAudioClip(getClass().getResource(
		//	"Royal_Blood_-_Little_Monster_(Official_Video).wav"));
	public static void main(String[] args) {
		Buttons b = new Buttons(Buttons.BLUE);
		b.loadUp();
		Main m = new Main();
		m.init();
		m.run();
		
	}

	private void run() {
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(gf);
		t1.start();
		t2.start();
		
		try {
			t2.sleep(6666666);
	} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void init() {
		JOptionPane
				.showMessageDialog(
						null,
						"HI!!! Thanks for playing my game. If you have already played Guitar Hero than you should catch on quick."
								+ "\nq=green, w=red, e=yellow, r=blue. No need to strum though. The score is displayed at the top of the screen!"
								+ "\n                                                          Thanks for playing!");
		
		g = new Game();
		gf = new GameFrame(g);
		gf.setSize(1000, 500);
		sound.play();
	}
}
