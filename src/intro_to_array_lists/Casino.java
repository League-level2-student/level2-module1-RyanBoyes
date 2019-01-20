package intro_to_array_lists;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Casino implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton Rbutton;
	JButton Button2;
	JButton Button3;
	final static int width = 500;
	final static int height = 800;
	CGamePanel GP;

	public static void main(String[] args) {
		new Casino().setup();

	}

	Casino() {
		frame = new JFrame();
		panel = new JPanel();

		GP = new CGamePanel();
	}

	void setup() {
		frame.add(GP);
		frame.addKeyListener(GP);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setVisible(true);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, width, height);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 10;
		c.gridy = 600;

		panel.add(Rbutton = new JButton("ROULETTE"), c);
		Rbutton.addActionListener(this);
		c.gridx = 200;
		c.gridy = 600;

		panel.add(Button2 = new JButton("Game 2"), c);
		Button2.addActionListener(this);
		c.gridx = 450;
		c.gridy = 600;

		panel.add(Button3 = new JButton("Game 3"), c);
		Button3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Rbutton) {
			System.out.println("HI");
		}
	}

}
