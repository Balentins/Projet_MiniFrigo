package Main;

import java.awt.event.ComponentListener;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {
	
	public static void main(String[] args){
		Model model = new Model();
		View view = new View(model);//instance de la vue
		view.init(); // lance la fonction qui initialise la vue
		
		Controller c = new Controller(model, view.getAlerteCond(), view.getAlerteTemp());
		//view.getAlerteCond().addComponentListener((ComponentListener) c);
		
	}

}
