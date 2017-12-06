package model;

import java.awt.Dimension;

public class AppModel {

	private Dimension appDim;
	private String title = "Akademija MVC";
	private AppState state = AppState.IDLE;
	
	
	//konstruktor koji postavlja dimenzije prozora
	public AppModel() {
		
		setAppDim(new Dimension(600, 400));
	}

	
	//geteri i seteri
	public Dimension getAppDim() {
		return appDim;
	}

	public void setAppDim(Dimension appDim) {
		this.appDim = appDim;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AppState getState() {
		return state;
	}

	public void setState(AppState state) {
		this.state = state;
	}
	

	
}
