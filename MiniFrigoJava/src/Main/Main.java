package Main;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {
	
	public static void main(String[] args){

		
		Model model = new Model();
		
		Controller c = new Controller(model, view);
		View view = new View(model,c);
		view.init();
		view.getButton().addActionListener(c);
		
	}

}
