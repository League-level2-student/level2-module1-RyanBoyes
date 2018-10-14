package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;
public class LIGamePanel extends JPanel implements ActionListener{
Timer timer;





void startGame() {
	timer = new Timer(1000/60,this);
	timer.start();
}













@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Whatever your heart desires");
}
}
