package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class LIObjectManager {
	LIRocketship R1;
	ArrayList<LIProjectile> Projectiles;
	ArrayList<LIAliens> Aliens;
	long enemyTimer;
	int enemySpawnTime;

	LIObjectManager(LIRocketship R1) {
		this.R1 = R1;
		Projectiles = new ArrayList<LIProjectile>();
		Aliens = new ArrayList<LIAliens>();
		enemyTimer = 0;
		enemySpawnTime = 3000;

	}

	void update() {
		R1.update();
		for (int i = 0; i < Projectiles.size(); i++) {
			Projectiles.get(i).update();

		}
		for (int i = 0; i < Aliens.size(); i++) {
			Aliens.get(i).update();

		}

	}

	void draw(Graphics g) {
		R1.draw(g);
		for (int a = 0; a < Projectiles.size(); a++) {
			Projectiles.get(a).draw(g);
		}
		for (int a = 0; a < Aliens.size(); a++) {
			Aliens.get(a).draw(g);
		}

	}

	void addProjectile(LIProjectile Projectile) {
		Projectiles.add(Projectile);
	}

	void addAlien(LIAliens Alien) {
		Aliens.add(Alien);
	}

	void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new LIAliens(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

}
