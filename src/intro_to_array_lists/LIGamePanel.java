package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LIGamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = 0;
	Font titleFont;
	Font enterFont;
	Font instructionFont;
	Font overFont;
	Font enemyFont;
	Font restartFont;
	LIRocketship ship;
	LIObjectManager Oman;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	public static BufferedImage spaceImg;

	LIGamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		enterFont = new Font("Arial", Font.PLAIN, 36);
		instructionFont = new Font("Arial", Font.PLAIN, 20);
		overFont = new Font("Arial", Font.PLAIN, 48);
		enemyFont = new Font("Arial", Font.PLAIN, 36);
		restartFont = new Font("Arial", Font.PLAIN, 36);
		ship = new LIRocketship(250, 700, 50, 50);
		Oman = new LIObjectManager(ship);

		try {

			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));

			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));

			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));

			spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}

	void startGame() {

		timer.start();
	}

	void updateMenuState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);

		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 20, 130);
		g.setColor(Color.YELLOW);
		g.setFont(enterFont);
		g.drawString("Press ENTER to start.", 70, 400);
		g.setColor(Color.YELLOW);
		g.setFont(instructionFont);
		g.drawString("Press SPACE for instructions.", 120, 650);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 20, 130);
		g.setColor(Color.YELLOW);

	}

	void updateGameState() {
		Oman.update();
		Oman.manageEnemies();
		Oman.checkCollision();
		Oman.purgeObjects();
		if (ship.isAlive == false) {
			currentState = END_STATE;
		}

	}

	void drawGameState(Graphics g) {
		g.drawImage(spaceImg, 0, 0, LeagueInvaders.width, LeagueInvaders.height, null);

		Oman.draw(g);

	}

	void updateEndState() {

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);

		g.setFont(overFont);
		g.drawString("GAME OVER", 100, 175);
		g.setColor(Color.BLACK);
		g.setFont(enemyFont);
		g.drawString("You killed" + " lots of " + "enemies", 50, 400);
		g.setColor(Color.BLACK);
		g.setFont(restartFont);
		g.drawString("Press ENTER to restart", 70, 650);
		g.setColor(Color.BLACK);
		g.setFont(overFont);
		g.drawString("GAME OVER", 100, 175);
		g.setColor(Color.BLACK);

	}

	@Override

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();
		}

		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.x -= 35;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.x += 35;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.y -= 35;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.y += 35;
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}
			if (currentState == MENU_STATE) {
				ship = new LIRocketship(250, 700, 50, 50);
				Oman = new LIObjectManager(ship);

			}

		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.x -= 35;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.x += 35;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.y -= 35;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.y += 35;
		}

		else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			Oman.addProjectile(new LIProjectile(ship.x + 21, ship.y, 10, 10));

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
