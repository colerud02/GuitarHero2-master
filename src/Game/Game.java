package Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import Graphics.buttons;

public class Game implements Runnable, ActionListener {
	int x = 0, y = 0;
	int timeCount = 0;
	Boolean greenUsed = false;
	Boolean redUsed = false;
	Boolean yellowUsed = false;
	Boolean blueUsed = false;
	Timer time = new Timer(1000, this);
	private ArrayList<buttons> buttonslist = new ArrayList<buttons>();

	public Game() {
		buttonslist.add(new buttons(buttons.BLUE));
		buttonslist.add(new buttons(buttons.GREEN));
		buttonslist.add(new buttons(buttons.RED));
		buttonslist.add(new buttons(buttons.YELLOW));

	}

	public ArrayList<buttons> getButtons() {
		return buttonslist;
	}

	public void run() {
		time.start();
		while (true) {
			if (timeCount == 1 && greenUsed == false) {
				buttonslist.add(new buttons(buttons.GREEN));
				greenUsed = true;
				blueUsed = false;
			}
			if (timeCount == 2 && redUsed == false) {
				greenUsed = false;
				buttonslist.add(new buttons(buttons.YELLOW));
				redUsed = true;
			}
			if (timeCount == 3 && yellowUsed == false) {
				redUsed = false;
				buttonslist.add(new buttons(buttons.RED));
				
				yellowUsed = true;
			}
			if (timeCount == 4 && blueUsed == false) {
				yellowUsed = false;
				buttonslist.add(new buttons(buttons.BLUE));
				timeCount = 0;
				blueUsed = true;
			}
			x++;
			y++;
			for (int i = 0; i < buttonslist.size(); i++) {
				buttonslist.get(i).tick();
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void draw(Graphics g) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timeCount++;

	}

}
