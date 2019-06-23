package myGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CRouletteTable {










/*Casino Cobj2;

CRouletteTable(){

	Cobj2 = new Casino();
	
	
	}





void drawRouletteTable(Graphics g) {
	
	
	
	Cobj2.roulettePanel.add(Cobj2.tablePanel);
	Cobj2.roulettePanel.add(Cobj2.option12);
	Cobj2.roulettePanel.add(Cobj2.optionOther);
	Cobj2.roulettePanel.add(Cobj2.spinPanel);
	
	Cobj2.wheelPanel.setBounds(0, 0, 500, 300);
	Cobj2.tablePanel.setBounds(176, 300, 324, 600);
	Cobj2.optionOther.setBounds(0, 300, 88, 599);
	Cobj2.option12.setBounds(88, 300, 87, 599);
	Cobj2.spinPanel.setBounds(0, 900, 500, 60);


	GridLayout experimentLayout = new GridLayout(13, 3);
	Cobj2.tablePanel.setLayout(experimentLayout);
	GridLayout Layout2 = new GridLayout(3, 1);
	Cobj2.option12.setLayout(Layout2);
	GridLayout Layout3 = new GridLayout(4, 1);
	Cobj2.optionOther.setLayout(Layout3);

	int cellCounter = -2;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 13; j++) {

			Cobj2.cell = new JLabel(cellCounter + "", SwingConstants.CENTER);
		Cobj2.tablePanel.add(Cobj2.cell);

		Cobj2.cell.addMouseListener((MouseListener) this);
			Cobj2.cell.setForeground(Color.WHITE);
			Cobj2.cell.setFont(Cobj2.fontNum);
		Cobj2.cell.setOpaque(true);
			if (cellCounter == -2) {
				Cobj2.cell.setText("0");
				Cobj2.cell.setFont(Cobj2.font0);
				Cobj2.cell.setForeground(Color.WHITE);
				Cobj2.cell.setBackground(Cobj2.rouletteColor);
				cellCounter++;
			} else if (cellCounter == -1) {
				Cobj2.cell.setText(Cobj2.Money + "¢");
				Cobj2.cell.setFont(Cobj2.returnFont);
				Cobj2.cell.setForeground(Color.YELLOW);
				Cobj2.cell.setBackground(Cobj2.rouletteColor);
				cellCounter++;
			} else if (cellCounter == 0) {
				Cobj2.cell.setText("00");
				Cobj2.cell.setFont(Cobj2.font00);
				Cobj2.cell.setForeground(Color.WHITE);
				Cobj2.cell.setBackground(Cobj2.rouletteColor);
				cellCounter++;
			}

			else if (cellCounter % 2 == 1) {
				Cobj2.cell.setBackground(Color.BLACK);
				cellCounter++;
			} else {
				Cobj2.cell.setBackground(Color.RED);
				cellCounter++;

			}

		}
		
	}
	int optionCounter = 0;
	for (int i = 0; i < 1; i++) {
		for (int a = 0; a < 3; a++) {
			JLabel options = new JLabel(optionCounter + "", SwingConstants.CENTER);
			Cobj2.option12.add(options);

			options.addMouseListener((MouseListener) this);
			options.setForeground(Color.WHITE);
			options.setFont(Cobj2.fontOpt);
			options.setBackground(Cobj2.rouletteColor);
			options.setOpaque(true);

			if (optionCounter == 0) {
				options.setText("1-12");
				optionCounter++;
			} else if (optionCounter == 1) {
				options.setText("13-24");
				options.setBackground(Cobj2.rouletteColor2);
				optionCounter++;
			} else if (optionCounter == 2) {
				options.setText("25-36");
				optionCounter++;
			}

		}
	}
	int otherCounter = 0;
	for (int q = 0; q < 1; q++) {
		for (int w = 0; w < 4; w++) {
			JLabel other = new JLabel(otherCounter + "", SwingConstants.CENTER);
			Cobj2.optionOther.add(other);

			other.addMouseListener((MouseListener) this);
			other.setForeground(Color.WHITE);
			other.setFont(Cobj2.fontOpt);
			other.setBackground(Cobj2.rouletteColor);
			other.setOpaque(true);

			if (otherCounter == 0) {
				other.setText("1-18");
				otherCounter++;
			} else if (otherCounter == 1) {
				other.setForeground(Color.RED);
				other.setBackground(Cobj2.rouletteColor2);
				other.setText("EVENS");
				other.setFont(Cobj2.font0);
				otherCounter++;
			} else if (otherCounter == 2) {
				other.setForeground(Color.BLACK);
				other.setText("ODDS");
				other.setFont(Cobj2.font0);
				otherCounter++;
			} else if (otherCounter == 3) {
				other.setText("19-36");
				other.setBackground(Cobj2.rouletteColor2);
				otherCounter++;
			}

		}
	}
	int spinCounter = 0;
	for(int c = 0; c<1;c++) {
		JLabel Spin = new JLabel(spinCounter + "", SwingConstants.CENTER);
		Cobj2.spinPanel.add(Spin);
		Spin.addMouseListener((MouseListener) this);
		Spin.setForeground(Color.BLACK);
		Spin.setFont(Cobj2.titleFont);
		Spin.setBackground(Cobj2.spinColor);
		Spin.setOpaque(true);
		Spin.setText("Spin");
	}
	
	
	
	
	
	
	
	
	
	
	







}






}
/*
