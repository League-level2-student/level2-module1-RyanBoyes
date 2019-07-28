package myGame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ScoreboardTable extends JPanel {
NewRouletteTable Cobj;
String MoneyInBankText = "Money in bank: $";
int MoneyInBank = 100;
JLabel BankDisplay;
Font ScoreboardFont;

	
	
	
ScoreboardTable(){
	Cobj = new NewRouletteTable();
	ScoreboardFont = new Font("Ariel", Font.PLAIN, 18);
setBackground(Color.BLACK);
BankDisplay = new JLabel(MoneyInBankText + MoneyInBank);
BankDisplay.setForeground(Color.WHITE);
BankDisplay.setFont(ScoreboardFont);
add(BankDisplay);




}












}
