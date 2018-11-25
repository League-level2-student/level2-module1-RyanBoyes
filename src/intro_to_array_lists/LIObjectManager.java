package intro_to_array_lists;

import java.awt.Graphics;

public class LIObjectManager {

	LIRocketship R1;

	LIObjectManager(LIRocketship R1) {
		this.R1 = R1;
	}

	void update() {
		R1.update();
	}

	void draw(Graphics g) {
		R1.draw(g);
	}

}
