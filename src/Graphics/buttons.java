package Graphics;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class buttons {
int x;
int y;

private Image image;
static Image image1;
static Image image2;
static Image image3;
static Image image4;

public buttons(int type)
{
	//blue
	if(type == 1)
	{
		this.image = image1;
		
	}
}
public void loadUp()
{
try {
	image1 = ImageIO.read(this.getClass().getResource("Green Button.jpg"));
image2 = ImageIO.read(this.getClass().getResource("Red Button.jpg"));
image3 = ImageIO.read(this.getClass().getResource("Yellow Button.jpg"));
image4 = ImageIO.read(this.getClass().getResource("Blue Button.jpg"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
