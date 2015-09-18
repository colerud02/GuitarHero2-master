package Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import Game.Game;

public class GameFrame extends JFrame implements Runnable, KeyListener {
	Game g;
	GamePanel gp;
	int Score = 0;
	public GameFrame(Game g) {
		super();
		this.g = g;

		try {
			gp = new GamePanel(g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.add(gp);
		this.setBounds(0, 0, 1000, 1000);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setTitle("Score = " + Score);
	}

	public void run() {
		while (true) {
			this.repaint();
			gp.repaint();
		}
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub

		char key = event.getKeyChar();

		if (key == 'q') {
			ArrayList<Buttons> q = g.getButtons();
			boolean check = false;
			for (Buttons green : q) {
				if (green.getColor() == Buttons.GREEN) {
					double g = green.getY();
					if (g < 480 && g > 440) {
						check = true;
						break;
					}
				}
			}
			System.out.println("" + check);
			if (check == true) {
				Score += 5;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
			if (check == false) {
				Score -= 3;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
		}
		else if (key == 'w') {
			ArrayList<Buttons> w = g.getButtons();
			boolean check = false;
			for (Buttons red : w) {
				if (red.getColor() == Buttons.RED) {
					double r = red.getY();
					if (r < 480 && r > 440) {
						check = true;
						break;
					}
				}
			}
			System.out.println("" + check);
			if (check == true) {
				Score += 5;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
			if (check == false) {
				Score -= 3;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
		}
		else if (key == 'e') {
			ArrayList<Buttons> e = g.getButtons();
			boolean check = false;
			for (Buttons yellow : e) {
				if (yellow.getColor() == Buttons.YELLOW) {
					double y = yellow.getY();
					if (y < 480 && y > 440) {
						check = true;
						break;
					}
				}
			}
			System.out.println("" + check);
			if (check == true) {
				Score += 5;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
			if (check == false) {
				Score -= 3;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
		}
		else if (key == 'r') {
			ArrayList<Buttons> r = g.getButtons();
			boolean check = false;
			for (Buttons blue : r) {
				if (blue.getColor() == Buttons.BLUE) {
					double b = blue.getY();
					if (b < 480 && b > 440) {
						check = true;
						break;
					}
				}
			}
			System.out.println("" + check);
			if (check == true) {
				Score += 5;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}
			if (check == false) {
				Score -= 3;
				System.out.println("Score = " + Score);
				this.setTitle("Score = " + Score);
			}		
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
