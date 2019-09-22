package myGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ScoreboardTable extends JPanel {

String MoneyInBankText = "Starting Balance: ";
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

int NumPayoutProcess;
int NumPayout;

int DoublePayout;

JLabel wheelLabel;
JLabel wheelLabel90;
JLabel wheelLabel180;
JLabel wheelLabel270;
public BufferedImage wheelImg;
public BufferedImage wheelImg90;
public BufferedImage wheelImg180;
public BufferedImage wheelImg270;

JLabel[] wheelImages = {wheelLabel,wheelLabel90,wheelLabel180,wheelLabel270};

int currentWheelImg;

boolean Spinning;
int timerCount;
int timerLimit = 250;


	
	
	
void getBalance() {
MoneyEntered = Integer.parseInt(MoneyInBankS = JOptionPane.showInputDialog("How much money would you like to add to your account? ($1 = 100)"));
	

	
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


	BufferedImage rotate(BufferedImage image, double angle) {
    double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
    int w = image.getWidth(), h = image.getHeight();
    int neww = (int)Math.floor(w*cos+h*sin), newh = (int) Math.floor(h * cos + w * sin);
    GraphicsConfiguration gc = getDefaultConfiguration();
    BufferedImage result = gc.createCompatibleImage(neww, newh, Transparency.TRANSLUCENT);
    Graphics2D g = result.createGraphics();
    g.translate((neww - w) / 2, (newh - h) / 2);
    g.rotate(angle, w / 2, h / 2);
    g.drawRenderedImage(image, null);
    g.dispose();
    return result;
}

	GraphicsConfiguration getDefaultConfiguration() {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice gd = ge.getDefaultScreenDevice();
    return gd.getDefaultConfiguration();
}









}
