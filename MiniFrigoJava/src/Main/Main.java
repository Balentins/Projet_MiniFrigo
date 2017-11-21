package Main;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {
	
	public static void main(String[] args){
		View view = new View();
		view.init();
		
		Model model = new Model();
		
		Controller c = new Controller(model, view.getField());
		view.getButton().addActionListener(c);
		
	}

}
