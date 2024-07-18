package com.itep.cal;
import java.awt.*;
public class GUI extends JFrame {

	public GUI() {
		JLabel l1=new JLabel("Welcome");
		setVisible(true);
		setSize(400,400);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GUI();

	}

}
