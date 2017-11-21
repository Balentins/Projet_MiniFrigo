package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class View {
	JFrame frame;
	JTextField field;
	JButton button;
	JComboBox<String> combo;
	
	public JFrame getFrame() {
		return frame;
	}
	public JTextField getField() {
		return field;
	}
	public JButton getButton() {
		return button;
	}
	public JComboBox<String> getComboBox() {
		return combo;
	}
	
	public void init(){
		frame = new JFrame ("Exemple POO");
		field = new JTextField();
		field.setColumns(10);
		button = new JButton("OK");
		combo = new JComboBox<String>();
		for(int i=10; i<=20; i++)   
        {
        String I=""+i;
        combo.addItem(I);
        }

		
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		frame.getContentPane().add(combo);
		
		
		frame.setVisible(true);
		frame.pack();
	}
}
