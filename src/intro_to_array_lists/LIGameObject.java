package intro_to_array_lists;

import java.awt.Graphics;

public class LIGameObject {

int x;
int y;
int width;
int height;



LIGameObject(int x, int y, int width, int height){
	
}

void update() {
	if(x<400) {
		for(int a=0;a<100;a+=5) {
			x++;
			y++;
		}
	}
	
	
	
}

void draw(Graphics g) {
	g.fillRect(x, y, 100, 100);
}







}
