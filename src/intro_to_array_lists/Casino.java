package intro_to_array_lists;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Casino implements ActionListener, KeyListener {
	JFrame frame;
	JPanel panel;
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
	Font enterFont;
	Font rouletteFont;

	public static void main(String[] args) {
		new Casino().setup();

	}

	Casino() {
		frame = new JFrame();
		panel = new JPanel();
		Rbutton = new JButton("ROULETTE");
		Button2 = new JButton("Game 2");
		Button3 = new JButton("Game 3");
		titleFont = new Font("Ariel", Font.BOLD, 48);
		enterFont = new Font("Ariel", Font.BOLD, 26);
		rouletteFont = new Font("Ariel", Font.BOLD, 23);
		
	}

	
	
	
	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(Rbutton);
		panel.add(Button2);
		panel.add(Button3);
		}
	
	
	
	
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, Casino.width, Casino.height);

		g.setFont(titleFont);
		g.drawString("Casino Name", 80, 90);
		g.setColor(Color.BLACK);

		g.setFont(enterFont);
		g.drawString("Click the location you'd like to go to", 5, 160);
		g.setColor(Color.BLACK);

		g.setFont(rouletteFont);
		g.setColor(Color.RED);
		g.drawString("Roulette: Type 1", 10, 350);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Casino Name", 80, 90);

	}
	void updateMenuState() {

	}

	
	
	void updateRouletteState() {
		
	}
	
	void drawRouletteState(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0,  Casino.width, Casino.height);
		
		
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		}
		else if(currentState == ROULETTE_STATE) {
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

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		}
		
	}
