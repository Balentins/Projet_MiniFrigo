package Controller;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Model;

public class Controller implements ActionListener {
	
	public Controller(Model m, Label alerteCond, Label alerteTemp)
	{
		this.m=m;
		this.alerteCond=alerteCond;
		this.alerteTemp=alerteTemp;
	}

	Model m;
	Label alerteCond;
	Label alerteTemp;
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		m.setCondensation(alerteCond.getText());
		m.setTemperature(alerteTemp.getText());
	}
	
}
