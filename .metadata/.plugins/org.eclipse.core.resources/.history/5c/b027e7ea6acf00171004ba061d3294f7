package Controller;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Model;

public class Controller implements ActionListener {
	
	public Controller(Model m, Label alerteCond)
	{
		this.m=m;
		this.alerteCond=alerteCond;
	}

	Model m;
	Label alerteCond;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		m.setCondensation(alerteCond.getText());

	}

}
