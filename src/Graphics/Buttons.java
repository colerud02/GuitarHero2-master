package Graphics;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JApplet;

public class Buttons {
	double x = 0;
	double y = 200;

	private Image image;
	static Image image1;
	static Image image2;
	static Image image3;
	static Image image4;

	public static final int BLUE = 1;
	public static final int GREEN = 2;
	public static final int YELLOW = 3;
	public static final int RED = 4;

	private int type;

	public Buttons(int type) {

		this.type = type;
		// blue
		if (type == 1) {
			x = 520;
			this.image = image4;

		}
		if (type == 2) {
			x = 415;
			this.image = image1;

		}
		if (type == 3) {
			x = 490;
			this.image = image3;

		}
		if (type == 4) {
			x = 453;
			this.image = image2;

		}
	}

	public void draw(Graphics g) {
		g.drawImage(image, (int) x, (int) y, 40, 40, null);
	}

	public void tick() {
		/*
		 * double redx = 430; double redy = 200; double greenx = 470; double
		 * greeny = 200; double yellowx = 480; double yellowy = 200; double
		 * bluex = 500; double bluey = 200;
		 * 
		 * 2redy += .7; redx -= .37; 1greeny += .7; greenx -= .20; 3yellowy +=
		 * .7; 4bluey += .7; bluex += .2;
		 */
		switch (type) {
		case BLUE:
			x += .4 * 2;
			y += 1.4 * 2;
			break;
		case RED:
			y += 1.4 * 2;
			x -= .37 * 2;
			break;
		case GREEN:
			y += 1.4 * 2;
			x -= .47 * 2;
			break;
		case YELLOW:
			y += 1.4 * 2;

			break;
		}
	}

	public double getX() {
		return x;

	}

	public double getY() {
		return y;

	}

	public int getColor() {
		return type;

	}

	public void loadUp() {
		try {
			image1 = ImageIO.read(this.getClass().getResource(
					"GreenButton.jpg"));
			image2 = ImageIO
					.read(this.getClass().getResource("redButton.jpg"));
			image3 = ImageIO.read(this.getClass().getResource(
					"YellowButton.jpg"));
			image4 = ImageIO.read(this.getClass()
					.getResource("Bluebutton.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
