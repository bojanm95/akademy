package view;

import java.awt.event.ActionListener;

public interface ViewInterface {
	
	public void update();
	
	public void registerListener(ActionListener listener);

}
