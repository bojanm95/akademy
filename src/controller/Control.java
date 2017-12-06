package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.AppModel;
import view.ViewInterface;

public class Control {
	
	AppModel model = null;
	ViewInterface view = null;

	public Control(AppModel model, ViewInterface view) {
	
		this.model = model;
		this.view = view;
		
		this.view.registerListener(listener);
		
	}
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "exit":
				System.exit(0);
				break;

			default:
				break;
			}
		}
	};
	
	
}
