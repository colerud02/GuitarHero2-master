package Game;


import java.awt.Graphics;
import java.util.ArrayList;

import Graphics.buttons;

public class Game implements Runnable {
	int x = 0, y= 0;
	private ArrayList<buttons> buttonslist = new ArrayList<buttons>();
	public Game()
	{
		buttonslist.add(new buttons(buttons.BLUE));
		buttonslist.add(new buttons(buttons.GREEN));
		buttonslist.add(new buttons(buttons.RED));
		buttonslist.add(new buttons(buttons.YELLOW));


	}
		public ArrayList<buttons> getButtons()
		{
			return buttonslist;
		}
	@Override
	public void run() 
	{
		while(true)
		{
			
			x++;
			y++;
			for(int i = 0; i < buttonslist.size(); i++)
			{
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

	public void draw(Graphics g) 
	{
		
	}

}
