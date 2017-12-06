package main;

import controller.Control;
import model.AppModel;
import view.MainForm;

public class MainClass {

	
	public static void main(String[] args) {
		
		AppModel model = new AppModel();
		MainForm view = new MainForm(model);
		new Control(model, view);
	}
		
	
	
}
