package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
JFrame frame;
final static int width = 500;
final static int height = 800;
LIGamePanel GP;
public static void main(String[] args) {
new LeagueInvaders()	.setup();

}

LeagueInvaders(){
	frame = new JFrame();
	GP = new LIGamePanel();
}


void setup() {
	frame.add(GP);
	frame.addKeyListener(GP);
	frame.getContentPane().setPreferredSize(new Dimension(width, height));
	frame.pack();
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GP.startGame();
	
}







}
