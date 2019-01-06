package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class CGamePanel extends JPanel implements ActionListener, KeyListener {

	final int MENU_STATE = 0;
	final int ROULETTE_STATE = 1;

	int currentState = 0;

	Font titleFont;
	Font enterFont;
	Font rouletteFont;

	CGamePanel() {
		titleFont = new Font("Ariel", Font.BOLD, 48);
		enterFont = new Font("Ariel", Font.BOLD, 26);
		rouletteFont = new Font("Ariel", Font.BOLD, 33);
	}

	void updateMenuState() {

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
		g.drawString("Roulette", 10, 450);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Casino Name", 80, 90);

	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
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
		if (currentState == MENU_STATE) {
			updateMenuState();
		}
	}

}
