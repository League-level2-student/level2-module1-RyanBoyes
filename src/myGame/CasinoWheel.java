package myGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasinoWheel extends JPanel{
public BufferedImage wheelImg;
	JLabel wheelLabel;
 Color rouletteColor;

CasinoWheel(){
	try {
		wheelImg = ImageIO.read(this.getClass().getResourceAsStream("Wheel2.png"));
	} catch(IOException e){
		e.printStackTrace();
	}
	rouletteColor = new Color(53,86,21);
	
	
	setBackground(rouletteColor);
	wheelLabel = new JLabel();
	wheelLabel.setIcon(new ImageIcon(wheelImg));
	
	add(wheelLabel);
}







	
public static BufferedImage rotate(BufferedImage image, double angle) {
    double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
    int w = image.getWidth(), h = image.getHeight();
    int neww = (int)Math.floor(w*cos+h*sin), newh = (int) Math.floor(h * cos + w * sin);
    GraphicsConfiguration gc = getDefaultConfiguration();
    BufferedImage result = gc.createCompatibleImage(neww, newh, Transparency.TRANSLUCENT);
    Graphics2D g = result.createGraphics();
    g.translate((neww - w) / 2, (newh - h) / 2);
    g.rotate(angle, w / 2, h / 2);
    g.drawRenderedImage(image, null);
    g.dispose();
    return result;
}

private static GraphicsConfiguration getDefaultConfiguration() {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice gd = ge.getDefaultScreenDevice();
    return gd.getDefaultConfiguration();
}



	
	
	

	
	
	

	
	
	
	
	
	
	
	
}
