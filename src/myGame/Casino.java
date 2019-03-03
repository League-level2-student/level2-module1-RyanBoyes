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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Casino extends JPanel implements ActionListener, KeyListener, MouseListener {
	Timer timer;
	Color rouletteColor;
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
	final static int height = 800;
	Font titleFont;
	Font enterFont1;
	Font enterFont2;
	Font rouletteFont;
	Font returnFont;

	JPanel roulettePanel;
	JPanel wheelPanel;
	JPanel tablePanel;

	public static void main(String[] args) {
		new Casino().setup();

	}

	void setup() {

		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setSize(width, height);
		frame.pack();
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

	}

	Casino() {
		timer = new Timer(1000 / 60, this);
		rouletteColor = new Color(53, 86, 21);
		frame = new JFrame();
		panel = this;

		roulettePanel = new JPanel();
		roulettePanel.setLayout((new BoxLayout(roulettePanel, BoxLayout.PAGE_AXIS)));
		wheelPanel = new JPanel();
		tablePanel = new JPanel();

		titleFont = new Font("Ariel", Font.BOLD, 48);
		enterFont1 = new Font("Ariel", Font.BOLD, 38);
		enterFont2 = new Font("Ariel", Font.BOLD, 38);
		rouletteFont = new Font("Ariel", Font.BOLD, 32);
		returnFont = new Font("Ariel", Font.PLAIN, 28);
		timer.start();
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, Casino.width, Casino.height);

		g.setFont(titleFont);
		g.drawString("Casino Name", 80, 90);
		g.setColor(Color.BLACK);

		g.setFont(enterFont1);
		g.drawString("Click the location you'd", 20, 180);
		g.setColor(Color.BLACK);

		g.setFont(enterFont2);
		g.drawString("like to go to", 130, 220);
		g.setColor(Color.BLACK);

		g.setFont(rouletteFont);
		g.setColor(Color.RED);
		g.drawString("Roulette: Hit '1'", 105, 350);

		g.setFont(returnFont);
		g.setColor(Color.BLACK);
		g.drawString("To return to the menu, press 'ESC.'", 15, 760);

		g.setFont(titleFont);
		g.drawString("Casino Name", 80, 90);
		g.setColor(Color.BLACK);

	}

	void updateMenuState() {

	}

	void updateRouletteState() {

	}

	void drawRouletteState(Graphics g) {
		frame.add(roulettePanel);
		roulettePanel.add(tablePanel);
		roulettePanel.add(wheelPanel);
		g.setColor(rouletteColor);
		g.fillRect(0, 0, Casino.width, Casino.height);

		GridLayout experimentLayout = new GridLayout(4, 12);
		tablePanel.setLayout(experimentLayout);
		int cellCounter = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 12; j++) {
				JLabel cell = new JLabel(cellCounter + "", SwingConstants.CENTER);
				tablePanel.add(cell);

				cell.addMouseListener(this);
				cell.setForeground(Color.WHITE);
				cell.setOpaque(true);
				if (j % 2 == 1) {
					cell.setBackground(Color.BLACK);
					cellCounter++;
				} else {
					cell.setBackground(Color.RED);
					cellCounter++;

				}
			}
		}

	}

	@Override
	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {
			drawMenuState(g);

		} else if (currentState == ROULETTE_STATE) {
			drawRouletteState(g);
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
			currentState = ROULETTE_STATE;
			System.out.println("Work");
		} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
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
