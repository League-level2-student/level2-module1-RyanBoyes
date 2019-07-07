package myGame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class RoulettePanel extends JPanel{


ScoreboardTable Scoreboard;
CasinoWheel WheelPanel;
NewRouletteTable Table;
JPanel SpinPanel;

RoulettePanel(){
	Scoreboard = new ScoreboardTable();
	WheelPanel = new CasinoWheel();
	Table = new NewRouletteTable();
	SpinPanel = new JPanel();
	
	setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
	

	
	add(Scoreboard);
	add(WheelPanel);
	add(Table);
	add(SpinPanel);
	
	
}



void BuildPanel(Graphics g) {
	
	
	


	
	
}

























}
