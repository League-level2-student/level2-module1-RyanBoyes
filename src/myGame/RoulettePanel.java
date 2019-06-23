package myGame;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class RoulettePanel {

JPanel RoulettePanel;
JPanel Scoreboard;
JPanel WheelPanel;
JPanel TablePanel;

RoulettePanel(){
	RoulettePanel = new JPanel();
	RoulettePanel.setLayout(new BoxLayout(RoulettePanel,BoxLayout.PAGE_AXIS));
	Scoreboard = new JPanel();
	WheelPanel = new JPanel();
	TablePanel = new JPanel();
	
}



void BuildPanel() {
	
	RoulettePanel.add(Scoreboard);
	RoulettePanel.add(WheelPanel);
	RoulettePanel.add(TablePanel);
	
	Scoreboard.setBounds(0, 0, CasinoRunner.width, 30);
	WheelPanel.setBounds(0, 30, CasinoRunner.width, 350);
	TablePanel.setBounds(0, 380, CasinoRunner.width, 420);
	
	Scoreboard.setBackground(Color.BLACK);
	
}

























}
