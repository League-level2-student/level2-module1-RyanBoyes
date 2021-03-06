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
	timer.start();
	
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

	g.setFont(Cobj.enterFont2);
	g.setColor(Color.RED);
	g.drawString("Roulette: Hit 'SPACE'", 55, 640);

	g.setFont(Cobj.Disclaimer);
	g.setColor(Color.BLACK);
	g.drawString("(DISCLAIMER: EVERYTHING IS IN TERMS OF CENTS)", 5, 275);

	g.setFont(Cobj.enterFont2);
	g.setColor(Color.BLACK);
	g.drawString("HOW TO PLAY:", 100, 340);
	
	g.setFont(Cobj.Disclaimer);
	g.setColor(Color.black);
	g.drawString("Enter the amount of money you would like to play",  5,  370);

	g.setFont(Cobj.Disclaimer);
	g.setColor(Color.black);
	g.drawString("with, and select 1 button to bet on. The number",  20,  390);

	g.setFont(Cobj.Disclaimer);
	g.setColor(Color.black);
	g.drawString("rolled will appear in the console, as well as if it is",  5,  410);
	
	g.setFont(Cobj.Disclaimer);
	g.setColor(Color.black);
	g.drawString("a winner.", 217,  430);
	
	
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
	//repaint();
	
	
	/*Sobj.timerCount++;
		
		Sobj.Spinning = true;
		Sobj.currentWheelImg++;
		if(Sobj.currentWheelImg>3) {
			Sobj.currentWheelImg = 0;
		}
		if(Sobj.timerCount>=Sobj.timerLimit) {
			Sobj.Spinning = false;
		}
		*/
	
	
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
