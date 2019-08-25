package myGame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class RoulettePanel extends JPanel{


ScoreboardTable Scoreboard;
CasinoWheel WheelPanel;
NewRouletteTable Table;
SpinTable SpinPanel;

RoulettePanel(){
	Scoreboard = new ScoreboardTable();
	WheelPanel = new CasinoWheel();
	Table = new NewRouletteTable(Scoreboard);
	SpinPanel = new SpinTable(Scoreboard);
	
	setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
	

	
	add(Scoreboard);
	add(WheelPanel);
	add(Table);
	add(SpinPanel);
	
	
}




ScoreboardTable getScoreboardTable(){
	
	return Scoreboard;
}







void BuildPanel(Graphics g) {
	
	
	


	
	
}

























}
