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
	Timer timer;
	Color rouletteColor;
	Color rouletteColor2;
	Color spinColor;
	JFrame frame;
	Casino panel;
	JButton Rbutton;
	JButton Button2;
	JButton Button3;
	final int MENU_STATE = 0;
	final int ROULETTE_STATE = 1;
	final int GAME2_STATE = 2;
	int currentState = 0;
	final static int width = 500;
	final static int height = 960;
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

	JPanel roulettePanel;
	JPanel wheelPanel;
	JPanel tablePanel;
	JPanel option12;
	JPanel optionOther;
	JPanel MoneyRemainingPanel;
	JPanel spinPanel;

	JLabel cell;

	boolean tableDrawn = false;

	public static void main(String[] args) {
		new Casino().setup();

	}

	void setup() {

		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setSize(width, height);

		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

	}

	Casino() {
		timer = new Timer(1000 / 60, this);
		rouletteColor = new Color(53, 86, 21);
		rouletteColor2 = new Color(53, 90, 18);
		spinColor = new Color(140,15,15);
		frame = new JFrame();
		panel = this;

		roulettePanel = new JPanel();
		roulettePanel.setLayout((new BoxLayout(roulettePanel, BoxLayout.PAGE_AXIS)));
		wheelPanel = new JPanel();
		tablePanel = new JPanel();
		option12 = new JPanel();
		optionOther = new JPanel();
		MoneyRemainingPanel = new JPanel();
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

	void drawMenuState(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, Casino.width, Casino.height);

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
		panel.setVisible(false);

		wheelPanel.setBackground(rouletteColor);
		spinPanel.setBackground(spinColor);

		g.setColor(rouletteColor2);
		g.fillRect(0, 0, 200, 20);

		

	}

	void drawRouletteTable(Graphics g) {

		roulettePanel.setLayout(null);
		roulettePanel.add(wheelPanel);
		roulettePanel.add(tablePanel);
		roulettePanel.add(option12);
		roulettePanel.add(optionOther);
		roulettePanel.add(MoneyRemainingPanel);
		roulettePanel.add(spinPanel);

		wheelPanel.setBounds(0, 0, 500, 300);
		tablePanel.setBounds(176, 300, 324, 600);
		optionOther.setBounds(0, 300, 88, 599);
		option12.setBounds(88, 300, 87, 599);
		MoneyRemainingPanel.setBounds(0, 0, 20, 7);
		spinPanel.setBounds(0, 900, 500, 60);

		GridLayout experimentLayout = new GridLayout(13, 3);
		tablePanel.setLayout(experimentLayout);
		GridLayout Layout2 = new GridLayout(3, 1);
		option12.setLayout(Layout2);
		GridLayout Layout3 = new GridLayout(4, 1);
		optionOther.setLayout(Layout3);

		int cellCounter = -2;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 13; j++) {

				cell = new JLabel(cellCounter + "", SwingConstants.CENTER);
				tablePanel.add(cell);

				cell.addMouseListener(this);
				cell.setForeground(Color.WHITE);
				cell.setFont(fontNum);
				cell.setOpaque(true);
				if (cellCounter == -2) {
					cell.setText("0");
					cell.setFont(font0);
					cell.setForeground(Color.WHITE);
					cell.setBackground(rouletteColor);
					cellCounter++;
				} else if (cellCounter == -1) {
					cell.setText(Money + "¢");
					cell.setFont(returnFont);
					cell.setForeground(Color.YELLOW);
					cell.setBackground(rouletteColor);
					cellCounter++;
				} else if (cellCounter == 0) {
					cell.setText("00");
					cell.setFont(font00);
					cell.setForeground(Color.WHITE);
					cell.setBackground(rouletteColor);
					cellCounter++;
				}

				else if (cellCounter % 2 == 1) {
					cell.setBackground(Color.BLACK);
					cellCounter++;
				} else {
					cell.setBackground(Color.RED);
					cellCounter++;

				}

			}
		}
		int optionCounter = 0;
		for (int i = 0; i < 1; i++) {
			for (int a = 0; a < 3; a++) {
				JLabel options = new JLabel(optionCounter + "", SwingConstants.CENTER);
				option12.add(options);

				options.addMouseListener(this);
				options.setForeground(Color.WHITE);
				options.setFont(fontOpt);
				options.setBackground(rouletteColor);
				options.setOpaque(true);

				if (optionCounter == 0) {
					options.setText("1-12");
					optionCounter++;
				} else if (optionCounter == 1) {
					options.setText("13-24");
					options.setBackground(rouletteColor2);
					optionCounter++;
				} else if (optionCounter == 2) {
					options.setText("25-36");
					optionCounter++;
				}

			}
		}
		int otherCounter = 0;
		for (int q = 0; q < 1; q++) {
			for (int w = 0; w < 4; w++) {
				JLabel other = new JLabel(otherCounter + "", SwingConstants.CENTER);
				optionOther.add(other);

				other.addMouseListener(this);
				other.setForeground(Color.WHITE);
				other.setFont(fontOpt);
				other.setBackground(rouletteColor);
				other.setOpaque(true);

				if (otherCounter == 0) {
					other.setText("1-18");
					otherCounter++;
				} else if (otherCounter == 1) {
					other.setForeground(Color.RED);
					other.setBackground(rouletteColor2);
					other.setText("EVENS");
					other.setFont(font0);
					otherCounter++;
				} else if (otherCounter == 2) {
					other.setForeground(Color.BLACK);
					other.setText("ODDS");
					other.setFont(font0);
					otherCounter++;
				} else if (otherCounter == 3) {
					other.setText("19-36");
					other.setBackground(rouletteColor2);
					otherCounter++;
				}

			}
		}
		int spinCounter = 0;
		for(int c = 0; c<1;c++) {
			JLabel Spin = new JLabel(spinCounter + "", SwingConstants.CENTER);
			spinPanel.add(Spin);
			Spin.addMouseListener(this);
			Spin.setForeground(Color.BLACK);
			Spin.setFont(titleFont);
			Spin.setBackground(spinColor);
			Spin.setOpaque(true);
			Spin.setText("Spin");
		}
		
		
		
		
		
		
		
		
		
		
		frame.add(roulettePanel);
		frame.pack();

	}

	@Override
	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {
			drawMenuState(g);

		} else if (currentState == ROULETTE_STATE) {

			drawRouletteState(g);
			System.out.println("t");

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
