package intro_to_array_lists;

import javax.swing.JFrame;

public class LeagueInvaders {
JFrame frame;
final int width = 500;
final int height = 800;
public static void main(String[] args) {
new LeagueInvaders()	.setup();
}

void constructor() {
	
	
}


void setup() {
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}







}
