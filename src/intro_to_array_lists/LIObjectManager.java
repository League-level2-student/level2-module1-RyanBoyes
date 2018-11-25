package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;

public class LIObjectManager {
	LIRocketship R1;
	ArrayList<LIProjectile> Projectiles = new ArrayList<LIProjectile>();

	LIObjectManager(LIRocketship R1) {
		this.R1 = R1;
	}

	void update() {
		R1.update();
		for (int i = 0; i < Projectiles.size(); i++) {
			Projectiles.get(i);

		}
	}

	void draw(Graphics g) {
		R1.draw(g);
	}

	void addProjectile(LIProjectile Projectile) {
		Projectiles.add(Projectile);
	}

}
