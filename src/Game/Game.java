package Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import Graphics.Buttons;

public class Game implements Runnable, ActionListener {
	int x = 0, y = 0;
	int timeCount = 0;
	Boolean greenUsed = false;
	Boolean redUsed = false;
	Boolean yellowUsed = false;
	Boolean blueUsed = false;
	Timer time = new Timer(1000, this);
	private ArrayList<Buttons> buttonslist = new ArrayList<Buttons>();

	public Game() {
		buttonslist.add(new Buttons(Buttons.BLUE));
		buttonslist.add(new Buttons(Buttons.GREEN));
		buttonslist.add(new Buttons(Buttons.RED));
		buttonslist.add(new Buttons(Buttons.YELLOW));

	}

	public ArrayList<Buttons> getButtons() {
		return buttonslist;
	}

	public void run() {
		time.start();
		while (true) {
			if (timeCount == 1 && greenUsed == false) {
				buttonslist.add(new Buttons(Buttons.GREEN));
				greenUsed = true;
				blueUsed = false;
			}
			if (timeCount == 2 && redUsed == false) {
				greenUsed = false;
				buttonslist.add(new Buttons(Buttons.RED));
				redUsed = true;
			}
			if (timeCount == 3 && yellowUsed == false) {
				redUsed = false;
				buttonslist.add(new Buttons(Buttons.YELLOW));

				yellowUsed = true;
			}
			if (timeCount == 4 && blueUsed == false) {
				yellowUsed = false;
				buttonslist.add(new Buttons(Buttons.BLUE));
				timeCount = 0;
				blueUsed = true;
			}
			x++;
			y++;
			for (int i = 0; i < buttonslist.size(); i++) {
				buttonslist.get(i).tick();
			}
			clearButtons();
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

	public void clearButtons() {
		for(int i=buttonslist.size()-1; i>=0; i--)
		{
			Buttons removed = buttonslist.get(i);
			if (removed.getY()>550) {
				buttonslist.remove(i);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timeCount++;

	}

}
