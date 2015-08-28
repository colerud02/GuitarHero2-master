package GH;

import Game.Game;
import Graphics.GameFrame;
import Graphics.buttons;

public class Main {
	GameFrame gf;
	Game g;

	public static void main(String[] args) {
		buttons b = new buttons(buttons.BLUE);
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
	}

	private void init() {
		g = new Game();
		gf = new GameFrame(g);
		gf.setSize(1000, 500);

	}
}
