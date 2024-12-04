package gamelab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame implements ActionListener {
	
	private JTextArea[] textarea;
	private JPanel[] panel;
	private JLabel[] label;
	private JTextField textfield;
	private JButton button;
	

	public static void main(String[] args) {
		new Interface();
	}

	public Interface() {
		buildWindow();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
	}

	private void buildWindow() {
		setTitle("Interface");
		setLayout(new GridLayout(3, 3, 10, 10)); // Specifies 3x3 grid layout
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null); // Center window
		setVisible(true); // Make window appear
	}
}
