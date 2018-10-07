package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton nameButton;
	JButton listButton;
	ArrayList<String> guestNames;
	String name;
	String s;
	
	public static void main(String[] args) {
		new GuestBook().GuestBookNames();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	void GuestBookNames() {
		guestNames = new ArrayList<String>();
		frame = new JFrame();
		panel = new JPanel();
		nameButton = new JButton("Add Name");
		listButton = new JButton("View Names");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(nameButton);
		panel.add(listButton);
		nameButton.addActionListener(this);
		listButton.addActionListener(this);
		frame.setSize(300, 150);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==nameButton) {
		name = JOptionPane.showInputDialog("Enter a Name");
		guestNames.add(name);
		}
		
		
		
		if(e.getSource()==listButton) {
			for(int i = 0; i<guestNames.size();i++) {
				s = guestNames.get(i);
				JOptionPane.showMessageDialog(null, "Guest #" + i + ": " + s);
			}
		}
	}
	
	
	
}
