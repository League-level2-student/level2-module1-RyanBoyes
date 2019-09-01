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
		if(Sobj.MoneyInBank>=Sobj.MoneyInputI) {
			Sobj.MoneyInBank = Sobj.MoneyInBank - Sobj.MoneyInputI;
			JOptionPane.showMessageDialog(null, "Your current balance is $" + Sobj.MoneyInBank);
			Sobj.NumPayoutProcess = Sobj.MoneyInputI*35;
			Sobj.NumPayout = Sobj.NumPayoutProcess + Sobj.MoneyInputI;
			
			Sobj.DoublePayout = Sobj.MoneyInputI*2;
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Improper funds. Hit SPACE to add more money to your account.");
		}
		
		Sobj.NumberRolled = Sobj.NumberRolledRDM.nextInt(36)+1;
		System.out.println(Sobj.NumberRolled);
		
		
		if(Sobj.betClicked.getText().equals("Even")) {
			if(Sobj.NumberRolled%2==0) {
				System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );
			}
			else {
				System.out.println("");
			}
		}
		
		else if(Sobj.betClicked.getText().equals("Odd")) {
			if(Sobj.NumberRolled%2==1) {
				System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );
			}
			else {
				System.out.println("");
			}
		}
		
		if(Sobj.betClicked.getText().equals("Red")) {
			if(Sobj.NumberRolled==1) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==3) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );} else if(Sobj.NumberRolled==5) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==7) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==9) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==12) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==14) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==16) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); }  else if(Sobj.NumberRolled==18) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==19) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );} else if(Sobj.NumberRolled==21) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );} else if(Sobj.NumberRolled==23) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==25) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==27) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==30) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); } else if(Sobj.NumberRolled==32) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );} else if(Sobj.NumberRolled==34) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );} else if(Sobj.NumberRolled==36) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );}
		}
			else {
				System.out.println("");
			}
		
		
		if (Sobj.betClicked.getText().equals("Black")) {
			if(Sobj.NumberRolled==2) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==4) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==6) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==8) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==10) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==11) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==13) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==15) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==17) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==20) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==22) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==24) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  }  else if(Sobj.NumberRolled==26) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==28) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==29) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==31) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==33) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } else if(Sobj.NumberRolled==35 ) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank );  } 
		
		else {
			System.out.println("");
		}
		}
		if (Sobj.betClicked.getText().equals("1-18")) {
			if(Sobj.NumberRolled<19) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); 
			}
			else { System.out.println(""); }
		}
		
		if(Sobj.betClicked.getText().equals("19-36")) {
			if(Sobj.NumberRolled>18) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank ); }
			else {
				System.out.println("");
			}
		}
		
		if(Sobj.betClicked.getText().equals("1")) {
			if(Sobj.NumberRolled==1) { System.out.println("WINNER"); Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);
			}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("2")) {
			if(Sobj.NumberRolled==2) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("3")) {
			if(Sobj.NumberRolled==3) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("4")) {
			if(Sobj.NumberRolled==4) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("5")) {
			if(Sobj.NumberRolled==5) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("6")) {
			if(Sobj.NumberRolled==6) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("7")) {
			if(Sobj.NumberRolled==7) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("8")) {
			if(Sobj.NumberRolled==8) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("9")) {
			if(Sobj.NumberRolled==9) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("10")) {
			if(Sobj.NumberRolled==10) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("11")) {
			if(Sobj.NumberRolled==11) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("12")) {
			if(Sobj.NumberRolled==12) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("13")) {
			if(Sobj.NumberRolled==13) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("14")) {
			if(Sobj.NumberRolled==14) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("15")) {
			if(Sobj.NumberRolled==15) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("16")) {
			if(Sobj.NumberRolled==16) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("17")) {
			if(Sobj.NumberRolled==17) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("18")) {
			if(Sobj.NumberRolled==18) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("19")) {
			if(Sobj.NumberRolled==19) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("20")) {
			if(Sobj.NumberRolled==20) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("21")) {
			if(Sobj.NumberRolled==21) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("22")) {
			if(Sobj.NumberRolled==22) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("23")) {
			if(Sobj.NumberRolled==23) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("24")) {
			if(Sobj.NumberRolled==24) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("25")) {
			if(Sobj.NumberRolled==25) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("26")) {
			if(Sobj.NumberRolled==26) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("27")) {
			if(Sobj.NumberRolled==27) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("28")) {
			if(Sobj.NumberRolled==28) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("29")) {
			if(Sobj.NumberRolled==29) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("30")) {
			if(Sobj.NumberRolled==30) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("31")) {
			if(Sobj.NumberRolled==31) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("32")) {
			if(Sobj.NumberRolled==32) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("33")) {
			if(Sobj.NumberRolled==33) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("34")) {
			if(Sobj.NumberRolled==34) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("35")) {
			if(Sobj.NumberRolled==35) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("36")) {
			if(Sobj.NumberRolled==36) { System.out.println("WINNER");Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; System.out.println("Congratulations, your updated balance is " + Sobj.MoneyInBank);}
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
