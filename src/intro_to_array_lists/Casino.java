package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Casino {
	JFrame frame;
	JPanel panel;
	JLabel Rlabel;
	final static int width = 500;
	final static int height = 800;
	CGamePanel GP;

	public static void main(String[] args) {
		new Casino().setup();

	}

	Casino() {
		frame = new JFrame();

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
		panel.add(Rlabel);
		Rlabel.setVisible(true);
		Rlabel.addMouseListener(this);

	}

}
