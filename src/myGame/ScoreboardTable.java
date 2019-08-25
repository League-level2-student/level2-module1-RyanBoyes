package myGame;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ScoreboardTable extends JPanel {

String MoneyInBankText = "Starting Balance: $";
int MoneyInBank;
int MoneyEntered;
String MoneyInBankS;
JLabel BankDisplay;
Font ScoreboardFont;
Random NumberRolledRDM;
int NumberRolled;
String NumberRolledS;

int MoneyInputI;

JLabel betClicked;
int betClickedI;


	
	
	
void getBalance() {
MoneyEntered = Integer.parseInt(MoneyInBankS = JOptionPane.showInputDialog("How much money would you like to add to your account?"));
	

	
}




ScoreboardTable(){
	 getBalance();
	 NumberRolledRDM = new Random();
	
	ScoreboardFont = new Font("Ariel", Font.PLAIN, 18);
	MoneyInBank = MoneyEntered;
setBackground(Color.BLACK);

BankDisplay = new JLabel();
BankDisplay.setText(MoneyInBankText + MoneyInBank);
BankDisplay.setForeground(Color.WHITE);
BankDisplay.setFont(ScoreboardFont);
add(BankDisplay);




}












}
