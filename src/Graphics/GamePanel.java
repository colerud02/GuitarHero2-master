package Graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Game.Game;

public class GamePanel extends JPanel {

	Game g;
	Image image;
	Image image1;
	Image image2;
	Image image3;
	Image image4;
	double redx = 430;
	double redy = 200;
	double greenx = 470;
	double greeny = 200;
	double yellowx = 480;
	double yellowy = 200;
	double bluex = 500;
	double bluey = 200;

	public GamePanel(Game g) throws IOException {
		super();
		this.g = g;
		this.setLayout(null);
		this.setSize(1000, 1000);
		image = ImageIO.read(getClass().getResource("gh3.lor.07.lg.jpg"));
		image1 = ImageIO.read(getClass().getResource("Green Button.jpg"));
		image2 = ImageIO.read(getClass().getResource("Red Button.jpg"));
		image3 = ImageIO.read(getClass().getResource("Yellow Button.jpg"));
		image4 = ImageIO.read(getClass().getResource("Blue Button.jpg"));

	}

	long lastTime = System.currentTimeMillis();
	long delta = 500;

	@Override
	public void paintComponent(Graphics g2) {

		super.paintComponent(g2);
		g.draw(g2);
		redy += .7;
		redx -= .37;
		greeny += .7;
		greenx -= .20;
		yellowy += .7;
		bluey += .7;
		bluex += .2;
		g2.drawImage(image, 0, 0, 1000, 500, null);

		// green
		if (lastTime + delta < System.currentTimeMillis()) {
			lastTime = System.currentTimeMillis();
			gr(g2);
		}
		// red
		if (lastTime + delta < System.currentTimeMillis()) {
			lastTime = System.currentTimeMillis();
			re(g2);
		}
		// yellow
		if (lastTime + delta < System.currentTimeMillis()) {
			lastTime = System.currentTimeMillis();
			ye(g2);
		}
		// Blue
		if (lastTime + delta < System.currentTimeMillis()) {
			lastTime = System.currentTimeMillis();
			bl(g2);
		}

	}

	public double getgreeny() {

		return greeny;
	}

	private void bl(Graphics g2) {
		if (greeny < 500) {
			g2.drawImage(image4, (int) bluex, (int) bluey, 70, 30, null);
		}
	}

	private void ye(Graphics g2) {
		if (redy < 500) {
			g2.drawImage(image3, (int) yellowx, (int) yellowy, 70, 30, null);
		}
	}

	private void re(Graphics g2) {
		if (yellowy < 500) {
			g2.drawImage(image2, (int) greenx, (int) greeny, 70, 30, null);
		}
	}

	private void gr(Graphics g2) {
		if (bluey < 500) {
			g2.drawImage(image1, (int) redx, (int) redy, 70, 30, null);
		}
	}

}
