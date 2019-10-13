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
	CasinoWheel Wobj;

JLabel Spin;
Color SpinColor;
Font SpinFont;

SpinTable(ScoreboardTable Sobj){
	
	this.Sobj = Sobj;
	Wobj = new CasinoWheel(Sobj);
	
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
private CasinoWheel CasinoWheel(ScoreboardTable sobj2) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	
	
	if(e.getSource()==Spin) {
		
	
		
		
		
		
		if(Sobj.MoneyInBank<Sobj.MoneyInputI) {
			JOptionPane.showMessageDialog(null, "Improper funds. To add more money, reset game panel.");
			
		}
		else if(Sobj.MoneyInBank>=Sobj.MoneyInputI) {
			Sobj.MoneyInBank = Sobj.MoneyInBank - Sobj.MoneyInputI;
			
			Sobj.NumPayoutProcess = Sobj.MoneyInputI*35;
			Sobj.NumPayout = Sobj.NumPayoutProcess + Sobj.MoneyInputI;
			
			Sobj.DoublePayout = Sobj.MoneyInputI*2;
		
		
		Sobj.NumberRolled = Sobj.NumberRolledRDM.nextInt(36)+1;
		JOptionPane.showMessageDialog(null, "Number rolled: " + Sobj.NumberRolled);
		
		
		if(Sobj.betClicked.getText().equals("Even")) {
			if(Sobj.NumberRolled%2==0) {
				JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);
			}
			else {
				System.out.println("");
			}
		}
		
		else if(Sobj.betClicked.getText().equals("Odd")) {
			if(Sobj.NumberRolled%2==1) {
				JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);
			}
			else {
				System.out.println("");
			}
		}
		
		if(Sobj.betClicked.getText().equals("Red")) {
			if(Sobj.NumberRolled==1) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==3) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);} else if(Sobj.NumberRolled==5) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==7) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==9) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==12) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==14) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==16) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); }  else if(Sobj.NumberRolled==18) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==19) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);} else if(Sobj.NumberRolled==21) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);} else if(Sobj.NumberRolled==23) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==25) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==27) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==30) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); } else if(Sobj.NumberRolled==32) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);} else if(Sobj.NumberRolled==34) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);} else if(Sobj.NumberRolled==36) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
		}
			else {
				System.out.println("");
			}
		
		
		if (Sobj.betClicked.getText().equals("Black")) {
			if(Sobj.NumberRolled==2) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==4) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==6) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==8) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==10) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==11) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==13) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==15) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==17) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==20) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==22) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==24) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  }  else if(Sobj.NumberRolled==26) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==28) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==29) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==31) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==33) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } else if(Sobj.NumberRolled==35 ) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);  } 
		
		else {
			System.out.println("");
		}
		}
		if (Sobj.betClicked.getText().equals("1-18")) {
			if(Sobj.NumberRolled<19) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); 
			}
			else { System.out.println(""); }
		}
		
		if(Sobj.betClicked.getText().equals("19-36")) {
			if(Sobj.NumberRolled>18) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.DoublePayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank); }
			else {
				System.out.println("");
			}
		}
		
		if(Sobj.betClicked.getText().equals("1")) {
			if(Sobj.NumberRolled==1) { JOptionPane.showMessageDialog(null, "WINNER");; Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);
			}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("2")) {
			if(Sobj.NumberRolled==2) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("3")) {
			if(Sobj.NumberRolled==3) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("4")) {
			if(Sobj.NumberRolled==4) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("5")) {
			if(Sobj.NumberRolled==5) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("6")) {
			if(Sobj.NumberRolled==6) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("7")) {
			if(Sobj.NumberRolled==7) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("8")) {
			if(Sobj.NumberRolled==8) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("9")) {
			if(Sobj.NumberRolled==9) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("10")) {
			if(Sobj.NumberRolled==10) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("11")) {
			if(Sobj.NumberRolled==11) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("12")) {
			if(Sobj.NumberRolled==12) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("13")) {
			if(Sobj.NumberRolled==13) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("14")) {
			if(Sobj.NumberRolled==14) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("15")) {
			if(Sobj.NumberRolled==15) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("16")) {
			if(Sobj.NumberRolled==16) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("17")) {
			if(Sobj.NumberRolled==17) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("18")) {
			if(Sobj.NumberRolled==18) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("19")) {
			if(Sobj.NumberRolled==19) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("20")) {
			if(Sobj.NumberRolled==20) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("21")) {
			if(Sobj.NumberRolled==21) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("22")) {
			if(Sobj.NumberRolled==22) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("23")) {
			if(Sobj.NumberRolled==23) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("24")) {
			if(Sobj.NumberRolled==24) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("25")) {
			if(Sobj.NumberRolled==25) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("26")) {
			if(Sobj.NumberRolled==26) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("27")) {
			if(Sobj.NumberRolled==27) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("28")) {
			if(Sobj.NumberRolled==28) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("29")) {
			if(Sobj.NumberRolled==29) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("30")) {
			if(Sobj.NumberRolled==30) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("31")) {
			if(Sobj.NumberRolled==31) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("32")) {
			if(Sobj.NumberRolled==32) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("33")) {
			if(Sobj.NumberRolled==33) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("34")) {
			if(Sobj.NumberRolled==34) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("35")) {
			if(Sobj.NumberRolled==35) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
		}
		if(Sobj.betClicked.getText().equals("36")) {
			if(Sobj.NumberRolled==36) { JOptionPane.showMessageDialog(null, "WINNER");;Sobj.MoneyInBank = Sobj.MoneyInBank + Sobj.NumPayout; JOptionPane.showMessageDialog(null, "Congratulations, your updated balance is " + Sobj.MoneyInBank);}
			else {
				System.out.println("");
			}
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
