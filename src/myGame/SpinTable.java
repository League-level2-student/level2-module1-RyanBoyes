package myGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SpinTable extends JPanel implements MouseListener{

JLabel Spin;
Color SpinColor;
Font SpinFont;

SpinTable(){
	
Spin = new JLabel();
SpinColor = new Color(148,9,9);
SpinFont = new Font("Ariel", Font.BOLD, 60);

Spin.setText("Spin");
Spin.setForeground(Color.BLACK);
Spin.setFont(SpinFont);
Spin.addMouseListener(this);
add(Spin);
setBackground(SpinColor);




}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==Spin) {
		JOptionPane.showMessageDialog(null, "Work");
	}
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}





}
