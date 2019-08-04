package myGame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ScoreboardTable extends JPanel {
GamePanel Pobj;
String MoneyInBankText = "Money in bank: $";
int MoneyInBank;
JLabel BankDisplay;
Font ScoreboardFont;

	
	
	
ScoreboardTable(){

	ScoreboardFont = new Font("Ariel", Font.PLAIN, 18);
	MoneyInBank = 100;
setBackground(Color.BLACK);
BankDisplay = new JLabel(MoneyInBankText + MoneyInBank);
BankDisplay.setForeground(Color.WHITE);
BankDisplay.setFont(ScoreboardFont);
add(BankDisplay);




}












}
