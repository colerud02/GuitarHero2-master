package Game;


import java.awt.Graphics;

public class Game implements Runnable {
	int x = 0, y= 0;

	@Override
	public void run() 
	{
		while(true)
		{
			
			x++;
			y++;
			try {
				Thread.sleep(2000);
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
