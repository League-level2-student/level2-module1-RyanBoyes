package myGame;

import java.awt.Dimension;

import javax.swing.JFrame;

public class CasinoRunner {
	JFrame frame;
	final static int width = 500;
	final static int height = 960;
	Casino Cobj;

	
	
	public static void main(String[] args) {
		new CasinoRunner().setup();
	}
	
	
	CasinoRunner(){
		frame = new JFrame();
		Cobj = new Casino();
		
	}
	
	
	
	
	void setup() {
		frame.add(Cobj);
		frame.addKeyListener(Cobj);
		
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cobj.startgame();
	}
	
	
	
	
	
	
	
	
	
	
}
