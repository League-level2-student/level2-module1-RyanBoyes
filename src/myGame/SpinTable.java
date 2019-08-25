package myGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SpinTable extends JPanel implements MouseListener{
	ScoreboardTable Sobj;

JLabel Spin;
Color SpinColor;
Font SpinFont;

SpinTable(ScoreboardTable Sobj){
	this.Sobj = Sobj;
	
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
		
		Sobj.NumberRolled = Sobj.NumberRolledRDM.nextInt(36)+1;
		System.out.println(Sobj.NumberRolled);
		
		
		if(Sobj.betClicked.getText().equals("Even")) {
			if(Sobj.NumberRolled%2==0) {
				System.out.println("WINNER");
			}
			else {
				System.out.println("");
			}
		}
		
		else if(Sobj.betClicked.getText().equals("Odd")) {
			if(Sobj.NumberRolled%2==1) {
				System.out.println("WINNER");
			}
			else {
				System.out.println("");
			}
		}
		
		if(Sobj.betClicked.getText().equals("Red")) {
			if(Sobj.NumberRolled==1) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==3) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==5) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==7) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==9) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==12) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==14) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==16) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==16) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==18) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==19) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==21) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==23) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==27) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==30) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==32) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==34) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==36) { System.out.println("WINNER"); }
			else {
				System.out.println("");
			}
		}
		
		if (Sobj.betClicked.getText().equals("Black")) {
			
		}
		
		
		
		
		
		if(Sobj.NumberRolled == Sobj.betClickedI) {
			System.out.println("WINNER");
		}
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
