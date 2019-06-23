package myGame;

import java.awt.Dimension;

import javax.swing.JFrame;

public class CasinoRunner {
	JFrame frame;
	final static int width = 500;
	final static int height = 800;
	Casino Cobj;

	
	
	public static void main(String[] args) {
		new CasinoRunner().setup();
	}
	
	
	
	
	void setup() {
	frame = new JFrame();
	frame.add(new NewRouletteTable());
	frame.setSize(width, height);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	}
	
	
	
	
	
	
	
	
	
	
}
