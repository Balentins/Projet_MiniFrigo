package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class View {
	JFrame frame;
	JTextField field;
	JButton button;
	
	public JFrame getFrame() {
		return frame;
	}
	public JTextField getField() {
		return field;
	}
	public JButton getButton() {
		return button;
	}
	
	public void init(){
		frame = new JFrame ("Exemple POO");
		field = new JTextField();
		field.setColumns(10);
		button = new JButton("OK");
		
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		
		frame.setVisible(true);
		frame.pack();
	}
}
