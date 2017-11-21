package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Model.Model;

public class Controller implements ActionListener {
	
	Model m;
	JTextField field;
	
	public Controller(Model m, JTextField field){
		this.m=m;
		this.field = field;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		m.setValeur(field.getText());

	}

}
