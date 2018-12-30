package intro_to_array_lists;

import java.awt.Graphics;

public class LIRocketship extends LIGameObject {
	int speed;

	LIRocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}

	void update() {
		super.update();
	}

	void draw(Graphics g) {
		g.drawImage(LIGamePanel.rocketImg, x, y, width, height, null);
	}

}
