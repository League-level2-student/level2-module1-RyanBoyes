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
	ScoreboardTable Sobj;

	
 Color rouletteColor;


CasinoWheel(ScoreboardTable Sobj){
	this.Sobj = Sobj;
	try {
		Sobj.wheelImg = ImageIO.read(this.getClass().getResourceAsStream("Wheel2.png"));
	} catch(IOException e){
		e.printStackTrace();
	}
	try {
		Sobj.wheelImg90 = ImageIO.read(this.getClass().getResourceAsStream("Wheel2-90 copy.png"));
	} catch(IOException e){
		e.printStackTrace();
	}
	try {
		Sobj.wheelImg180 = ImageIO.read(this.getClass().getResourceAsStream("Wheel2-180 copy.png"));
	} catch(IOException e){
		e.printStackTrace();
	}
	try {
		Sobj.wheelImg270 = ImageIO.read(this.getClass().getResourceAsStream("Wheel2-270 copy.png"));
	} catch(IOException e){
		e.printStackTrace();
	}
	
	
	
	
	
	rouletteColor = new Color(53,86,21);
	
	
	setBackground(rouletteColor);
	Sobj.wheelLabel = new JLabel();
	Sobj.wheelLabel90 = new JLabel();
	Sobj.wheelLabel180 = new JLabel();
	Sobj.wheelLabel270 = new JLabel();
	
	
	Sobj.wheelLabel.setIcon(new ImageIcon(	Sobj.wheelImg));
	Sobj.wheelLabel90.setIcon(new ImageIcon(	Sobj.wheelImg90));
	Sobj.wheelLabel180.setIcon(new ImageIcon(	Sobj.wheelImg180));
	Sobj.wheelLabel270.setIcon(new ImageIcon(	Sobj.wheelImg270));
	
	
	
	
	
	add(Sobj.wheelLabel);
	
	
	
}





	
	
	

	
	
	

	
	
	
	
	
	
	
	
}
