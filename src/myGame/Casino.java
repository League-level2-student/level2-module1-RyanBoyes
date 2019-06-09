package myGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Casino extends JPanel implements ActionListener, KeyListener, MouseListener {
	CasinoWheel WheelObj;
	Timer timer;
	Color rouletteColor;
	Color rouletteColor2;
	Color spinColor;
	
	
	JButton Rbutton;
	JButton Button2;
	JButton Button3;
	final int MENU_STATE = 0;
	final int ROULETTE_STATE = 1;
	final int GAME2_STATE = 2;
	int currentState = 0;
	
	Font titleFont;
	Font enterFont1;
	Font enterFont2;
	Font rouletteFont;
	Font returnFont;
	Font font0;
	Font font00;
	Font fontNum;
	Font fontOpt;
	Font MoneyRemaining;
	Font Disclaimer;

	int Money;
	String MoneyS;
	String MoneySpentS;
	int MoneySpent;
	
	JPanel GamePanel;
	
	JPanel wheelPanel;
	
	JPanel roulettePanel;
	JPanel tablePanel;
	JPanel option12;
	JPanel optionOther;
	
	JPanel spinPanel;

	JLabel cell;

	boolean tableDrawn = false;


	Casino() {
		WheelObj = new CasinoWheel();
		timer = new Timer(1000 / 60, this);
		rouletteColor = new Color(53, 86, 21);
		rouletteColor2 = new Color(53, 90, 18);
		spinColor = new Color(140,15,15);
		
		GamePanel = new JPanel();
		GamePanel.setLayout(new BoxLayout(GamePanel, BoxLayout.Y_AXIS));
		roulettePanel = new JPanel();
		roulettePanel.setLayout((new BoxLayout(roulettePanel, BoxLayout.PAGE_AXIS)));
		wheelPanel = new JPanel();
		tablePanel = new JPanel();
		option12 = new JPanel();
		optionOther = new JPanel();
		
		spinPanel = new JPanel();

		titleFont = new Font("Ariel", Font.BOLD, 48);
		enterFont1 = new Font("Ariel", Font.BOLD, 38);
		enterFont2 = new Font("Ariel", Font.BOLD, 38);
		rouletteFont = new Font("Ariel", Font.BOLD, 32);
		returnFont = new Font("Ariel", Font.PLAIN, 28);
		font0 = new Font("Ariel", Font.BOLD, 21);
		font00 = new Font("Ariel", Font.BOLD, 21);
		fontNum = new Font("Ariel", Font.BOLD, 15);
		fontOpt = new Font("Ariel", Font.BOLD, 19);
		MoneyRemaining = new Font("Ariel", Font.PLAIN, 15);
		Disclaimer = new Font("Ariel", Font.BOLD, 19);
		timer.start();

	}
	
	void startgame() {
		timer.start();
	}
	
	
	

	void drawMenuState(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, CasinoRunner.width, CasinoRunner.height);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Casino Name", 80, 90);

		g.setFont(enterFont1);
		g.setColor(Color.BLACK);
		g.drawString("Click the location you'd", 20, 180);

		g.setFont(enterFont2);
		g.setColor(Color.BLACK);
		g.drawString("like to go to", 130, 220);

		g.setFont(rouletteFont);
		g.setColor(Color.RED);
		g.drawString("Roulette: Hit '1'", 105, 390);

		g.setFont(Disclaimer);
		g.setColor(Color.BLACK);
		g.drawString("(DISCLAIMER: EVERYTHING IS IN TERMS OF CENTS)", 5, 275);

		g.setFont(returnFont);
		g.setColor(Color.BLACK);
		g.drawString("To return to the menu, press 'ESC.'", 15, 760);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Casino Name", 80, 90);

	}

	void updateMenuState() {

	}

	void updateRouletteState() {
	
	}

	void drawRouletteState(Graphics g) {
		

		wheelPanel.setBackground(rouletteColor);
		spinPanel.setBackground(spinColor);
		
		GamePanel.add(wheelPanel);
		GamePanel.add(roulettePanel);
		
		GamePanel.setVisible(false);
		
		
		
		

	}

	

	@Override
	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {
			drawMenuState(g);

		} else if (currentState == ROULETTE_STATE) {

			drawRouletteState(g);
			

			if (tableDrawn == false) {
				drawRouletteTable(g);
				tableDrawn = true;

			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_1) {
			MoneyS = JOptionPane
					.showInputDialog("How much money would you like to transfer to chips? (In terms of cents)");
			Money = Integer.parseInt(MoneyS);
			currentState = ROULETTE_STATE;

		}
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			currentState = MENU_STATE;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == ROULETTE_STATE) {

			updateRouletteState();
		}
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel h = (JLabel) e.getComponent();
		
		if(h.getText().equals("Spin")) {
			JOptionPane.showMessageDialog(null, "WORK");
		}
		else if(h.getText().equals(Money+"¢")) {
			JOptionPane.showMessageDialog(null, "Your current balance is "+ Money + "¢");
		}
		else {	MoneySpentS = JOptionPane.showInputDialog("How much would you like to bet on " + h.getText() + "?");
				MoneySpent = Integer.parseInt(MoneySpentS);
		}
		
		
		if (Money < MoneySpent) {
			JOptionPane.showMessageDialog(null, "Sorry, you don't have enough money.");
		} else {
			Money = Money - MoneySpent;
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
