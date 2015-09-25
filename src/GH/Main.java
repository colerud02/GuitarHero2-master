package GH;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import Game.Game;
import Graphics.GameFrame;
import Graphics.Buttons;

public class Main {
	GameFrame gf;
	Game g;
	AudioClip sound = JApplet.newAudioClip(getClass().getResource("Nirvana_-_Smells_Like_Teen_Spirit.wav"));
	
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
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	private void init() {
		JOptionPane.showMessageDialog(null, "HI!!! Thanks for playing my game. If you have already played Guitar Hero than you should catch on quick. q=green, w=red, e=yellow, r=blue. No need to strum though. The score is displayed at the top of the screen! Thanks for playing!");
		g = new Game();
		gf = new GameFrame(g);
		gf.setSize(1000, 500);
		sound.play();
	}
}
