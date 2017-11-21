package Main;

import java.awt.event.ComponentListener;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {
	
	public static void main(String[] args){
		View view = new View();//instance de la vue
		view.init(); // lance la fonction qui initialise la vue
		
		Model model = new Model();
		Controller c = new Controller(model, view.getAlerteCond());
		view.getAlerteCond().addComponentListener((ComponentListener) c);
		
	}

}
