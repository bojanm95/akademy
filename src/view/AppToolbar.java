package view;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class AppToolbar extends JToolBar implements ViewInterface {

	
	private static final long serialVersionUID = 1L;
	private JButton btnNew;
	private JButton btnOpen;
	private JButton btnSave;

	
	public AppToolbar() {
		
		btnNew = new JButton(new ImageIcon("icons/application_add.png"));
		btnNew.setActionCommand("new");
		btnNew.setFocusPainted(false);
		btnNew.setFocusable(false);
		
		btnOpen = new JButton(new ImageIcon("icons/folder-open.png"));
		btnOpen.setActionCommand("open");
		btnOpen.setFocusPainted(false);
		btnOpen.setFocusable(false);
		
		btnSave = new JButton(new ImageIcon("icons/disk.png"));
		btnSave.setActionCommand("save");
		btnSave.setFocusPainted(false);
		btnSave.setFocusable(false);
		
		
		add(btnNew);
		add(btnOpen);
		addSeparator();
		add(btnSave);
	}


	public void update() {
		
	}


	public void registerListener(ActionListener listener) {
		btnNew.addActionListener(listener);
		btnOpen.addActionListener(listener);
		btnSave.addActionListener(listener);
		
	}
	
	
	
	
}
