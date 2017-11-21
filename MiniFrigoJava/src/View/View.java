package View;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Controller.Controller;
import Model.Icondensation;
import Model.Model;

public class View {
	JFrame frame;
	JTextField field;
	JButton button;
	JComboBox<String> combo;
	Label AlerteCond;
	
	Model model;
	Controller controlleur;
	
	
	public View(Model model, Controller controller)
	{
		this.controlleur = controller;
		this.model = model;
	}
	
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
		AlerteCond = new Label("le taux de condensation atteint une limite critique");
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		frame.getContentPane().add(combo);
		
		if (model.getCondensation() == true)
			{
			frame.getContentPane().add(AlerteCond);
			}
		
		frame.setVisible(true);
		frame.pack();
	}
}
