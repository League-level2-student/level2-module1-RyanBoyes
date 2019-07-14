package myGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class NewRouletteTable extends JPanel implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color rouletteBackgroundColor = new Color(53, 86, 21);
	Color specialCellColor = new Color(177, 186, 201);
	HashMap<Integer, Color> numberColors = new HashMap<Integer, Color>();

	Font titleFont = new Font("Ariel", Font.BOLD, 48);
	Font enterFont1 = new Font("Ariel", Font.BOLD, 38);
	Font enterFont2 = new Font("Ariel", Font.BOLD, 38);
	Font rouletteFont = new Font("Ariel", Font.BOLD, 32);
	Font returnFont = new Font("Ariel", Font.PLAIN, 28);
	Font font0 = new Font("Ariel", Font.BOLD, 21);
	Font font00 = new Font("Ariel", Font.BOLD, 21);
	Font fontNum = new Font("Ariel", Font.BOLD, 15);
	Font fontOpt = new Font("Ariel", Font.BOLD, 19);
	Font MoneyRemaining = new Font("Ariel", Font.PLAIN, 15);
	Font Disclaimer = new Font("Ariel", Font.BOLD, 19);

	Color rouletteColor = new Color(53, 86, 21);
	Color rouletteColor2 = new Color(53, 90, 18);
	Color spinColor = new Color(140, 15, 15);

	int[] bets = new int[43];
	int currentBet = 10;
	int bank = 1000;
	int MoneyInputI;
	// 1-36 correspond to the same number
	// 37 is even
	// 38 is odd
	// 39 is red
	// 40 is Black
	// 41 is 1-18
	// 42 is 19-36

	NewRouletteTable() {
		this.initializeColorHashmap();
		Border panelPadding = BorderFactory.createLineBorder(rouletteBackgroundColor, 1);
		this.setBorder(new MatteBorder(-4, 10, -4, 10, rouletteBackgroundColor));
		GridLayout cellGrid = new GridLayout(12, 4);
		this.setLayout(cellGrid);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
		for (int i = 1; i < 37; i++) {
			if (i == 4) {
				JLabel tableCell = createSpecialCell("Even", border);
				this.add(tableCell);
			} else if (i == 7) {
				JLabel tableCell = createSpecialCell("Odd", border);
				this.add(tableCell);
			} else if (i == 16) {
				JLabel tableCell = createSpecialCell("Red", border);
				this.add(tableCell);
			} else if (i == 19) {
				JLabel tableCell = createSpecialCell("Black", border);
				this.add(tableCell);
			} else if (i == 28) {
				JLabel tableCell = createSpecialCell("1-18", border);
				this.add(tableCell);
			} else if (i == 31) {
				JLabel tableCell = createSpecialCell("19-36", border);
				this.add(tableCell);
			} else if (i == 1 || i == 10 || i == 13 || i == 22 || i == 25 || i == 34) {
				// add "invisible" placeholder cell in first column
				JLabel tableCell = new JLabel("", SwingConstants.CENTER);
				tableCell.setBackground(rouletteBackgroundColor);
				tableCell.setOpaque(true);
				this.add(tableCell);
			}
			JLabel tableCell = new JLabel(i + "", SwingConstants.CENTER);
			tableCell.setFont(fontNum);
			tableCell.addMouseListener(this);
			tableCell.setForeground(Color.WHITE);
			tableCell.setBackground(numberColors.get(i));
			tableCell.setBorder(border);
			tableCell.setOpaque(true);
			this.add(tableCell);
		}
	}

	private JLabel createSpecialCell(String label, Border border) {
		JLabel tableCell = new JLabel(label, SwingConstants.CENTER);
		tableCell.setFont(fontNum);
		tableCell.addMouseListener(this);
		tableCell.setForeground(Color.WHITE);
		Color cellColor = specialCellColor;
		if (label.contentEquals("Red")) {
			cellColor = Color.red;
		} else if (label.equals("Black")) {
			cellColor = Color.black;
		}
		tableCell.setBackground(cellColor);
		tableCell.setBorder(border);
		tableCell.setOpaque(true);
		return tableCell;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		// 37 is even
		// 38 is odd
		// 39 is red
		// 40 is Black
		// 41 is 1-18
		// 42 is 19-36

		JLabel clicked = (JLabel) e.getSource();
		String labelText = clicked.getText();
		if (isNumeric(labelText)) {
			bets[Integer.parseInt(labelText)] += currentBet;
		} else if (labelText.equals("Even")) {
			bets[37] += 5;
		} else if (labelText.equals("Odd")) {
			bets[38] += 5;
		} else if (labelText.equals("Red")) {
			bets[39] += 5;
		} else if (labelText.equals("Black")) {
			bets[40] += 5;
		} else if (labelText.equals("1-18")) {
			bets[41] += 5;
		} else if (labelText.equals("19-36")) {
			bets[32] += 5;
		}
		System.out.println(Arrays.toString(bets));
	}

	public static boolean isNumeric(String labelText) {
		try {
			Integer.parseInt(labelText);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel betClicked = (JLabel) e.getComponent();
		String MoneyInputS = JOptionPane.showInputDialog("Place your bet on " + betClicked.getText());
		MoneyInputI = Integer.parseInt(MoneyInputS);
		

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

	private void initializeColorHashmap() {
		numberColors.put(1, Color.RED);
		numberColors.put(2, Color.BLACK);
		numberColors.put(3, Color.RED);
		numberColors.put(4, Color.BLACK);
		numberColors.put(5, Color.RED);
		numberColors.put(6, Color.BLACK);
		numberColors.put(7, Color.RED);
		numberColors.put(8, Color.BLACK);
		numberColors.put(9, Color.RED);
		numberColors.put(10, Color.BLACK);
		numberColors.put(11, Color.BLACK);
		numberColors.put(12, Color.RED);
		numberColors.put(13, Color.BLACK);
		numberColors.put(14, Color.RED);
		numberColors.put(15, Color.BLACK);
		numberColors.put(16, Color.RED);
		numberColors.put(17, Color.BLACK);
		numberColors.put(18, Color.RED);
		numberColors.put(19, Color.RED);
		numberColors.put(20, Color.BLACK);
		numberColors.put(21, Color.RED);
		numberColors.put(22, Color.BLACK);
		numberColors.put(23, Color.RED);
		numberColors.put(24, Color.BLACK);
		numberColors.put(25, Color.BLACK);
		numberColors.put(26, Color.BLACK);
		numberColors.put(27, Color.RED);
		numberColors.put(28, Color.BLACK);
		numberColors.put(29, Color.BLACK);
		numberColors.put(30, Color.RED);
		numberColors.put(31, Color.BLACK);
		numberColors.put(32, Color.RED);
		numberColors.put(33, Color.BLACK);
		numberColors.put(34, Color.RED);
		numberColors.put(35, Color.BLACK);
		numberColors.put(36, Color.RED);
	}

	/*
	 * 
	 * 
	 * old constructor without special squares:
	 * 
	 * 
	 * 
	 * this.initializeColorHashmap(); GridLayout cellGrid = new GridLayout(12,3);
	 * this.setLayout(cellGrid); for (int i = 1; i < 37; i++) { JLabel tableCell =
	 * new JLabel(i + "", SwingConstants.CENTER); tableCell.setFont(fontNum);
	 * tableCell.addMouseListener(this); tableCell.setForeground(Color.WHITE);
	 * tableCell.setBackground(numberColors.get(i)); Border border =
	 * BorderFactory.createLineBorder(Color.GRAY, 1); tableCell.setBorder(border);
	 * tableCell.setOpaque(true); this.add(tableCell); }
	 * 
	 */
}