package myGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener  {
Timer timer;
NewRouletteTable Cobj;
RoulettePanel Robj;
ScoreboardTable Sobj;
final int MENU_STATE;
final int ROULETTE_STATE;
int currentState;
JFrame frame;


GamePanel(JFrame frame){
	timer = new Timer(1000/60, this);
	Cobj = new NewRouletteTable(Sobj);
	
	
	MENU_STATE = 0;
	ROULETTE_STATE = 1;
	currentState = 0;
	this.frame = frame;
	this.frame.addKeyListener(this);
	//timer.start();
	
}
void drawMenuState(Graphics g) {
	

	g.setColor(Color.LIGHT_GRAY);
	g.fillRect(0, 0, CasinoRunner.width, CasinoRunner.height);

	g.setFont(Cobj.titleFont);
	g.setColor(Color.BLACK);
	g.drawString("Casino Name", 80, 90);

	g.setFont(Cobj.enterFont1);
	g.setColor(Color.BLACK);
	g.drawString("Click the location you'd", 20, 180);

	g.setFont(Cobj.enterFont2);
	g.setColor(Color.BLACK);
	g.drawString("like to go to", 130, 220);

	g.setFont(Cobj.rouletteFont);
	g.setColor(Color.RED);
	g.drawString("Roulette: Hit 'SPACE'", 70, 390);

	g.setFont(Cobj.Disclaimer);
	g.setColor(Color.BLACK);
	g.drawString("(DISCLAIMER: EVERYTHING IS IN TERMS OF CENTS)", 5, 275);

	g.setFont(Cobj.returnFont);
	g.setColor(Color.BLACK);
	g.drawString("To return to the menu, press 'ESC.'", 15, 760);

	g.setFont(Cobj.titleFont);
	g.setColor(Color.BLACK);
	g.drawString("Casino Name", 80, 90);

}

void drawRouletteState(Graphics g) {
	
	
	
	
	

}


public void paintComponent(Graphics g) {

	if (currentState == MENU_STATE) {
		drawMenuState(g);
		
		
	} else if (currentState == ROULETTE_STATE) {
		
		//Robj.paintComponent(g);
		
			
			
			
		
		
		
	

	}








}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	
	
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode()==KeyEvent.VK_SPACE) {
		currentState++;
	
		
		if(currentState==ROULETTE_STATE) {
			frame.add(new RoulettePanel());
			
			frame.pack();
			
			
			
			
		}
		
	}
	
		
	if(currentState>ROULETTE_STATE) {
		currentState = MENU_STATE;
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}
