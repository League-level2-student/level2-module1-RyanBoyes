package intro_to_array_lists;

import java.awt.Graphics;

public class LIAliens extends LIGameObject {

	LIAliens(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void update() {
		super.update();
		y++;
	}

	void draw(Graphics g) {
		g.drawImage(LIGamePanel.alienImg, x, y, width, height, null);
	}

}
