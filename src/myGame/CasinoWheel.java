package myGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CasinoWheel extends BufferedImage {
	public static BufferedImage wheelImg;
	
	
	public CasinoWheel(int width, int height, int imageType) {
		super(width, height, imageType);
		// TODO Auto-generated constructor stub
	}








	
	
	
	
	
	
	
	void drawWheel(Graphics g) {
		g.drawImage(wheelImg, 0,0,500,800, null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
