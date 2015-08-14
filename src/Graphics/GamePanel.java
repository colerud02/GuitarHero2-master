package Graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

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
		ArrayList<buttons> temp = g.getButtons();
		for(int i = 0; i < temp.size(); i++)
		{
			temp.get(i).draw(g2);
		}

	}

	public double getgreeny() {

		return greeny;
	}


}
