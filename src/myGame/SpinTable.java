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
			if(Sobj.NumberRolled==1) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==3) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==5) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==7) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==9) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==12) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==14) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==16) { System.out.println("WINNER"); }  else if(Sobj.NumberRolled==18) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==19) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==21) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==23) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==27) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==30) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==32) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==34) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==36) { System.out.println("WINNER"); }
		}
			else {
				System.out.println("");
			}
		
		
		if (Sobj.betClicked.getText().equals("Black")) {
			if(Sobj.NumberRolled==2) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==4) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==6) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==8) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==10) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==11) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==13) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==15) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==17) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==20) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==22) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==24) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==25) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==26) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==28) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==29) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==31) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==33) { System.out.println("WINNER"); } else if(Sobj.NumberRolled==35 ) { System.out.println("WINNER"); } 
		
		else {
			System.out.println("");
		}
		}
		if (Sobj.betClicked.getText().equals("1-18")) {
			if(Sobj.NumberRolled<19) { System.out.println("WINNER");
			}
			else { System.out.println(""); }
		}
		
		if(Sobj.betClicked.getText().equals("19-36")) {
			if(Sobj.NumberRolled>18) { System.out.println("WINNER");}
			else {
				System.out.println("");
			}
		}
		
		if(Sobj.betClicked.getText().equals("1")) {
			if(Sobj.NumberRolled==1) { System.out.println("WINNER");}
			else {
				System.out.println("");
			}
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
