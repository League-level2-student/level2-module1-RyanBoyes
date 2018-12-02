package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class LIAliens extends LIGameObject {

	LIAliens(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void update() {
		y++;
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}

	// ALIENS 10

}
