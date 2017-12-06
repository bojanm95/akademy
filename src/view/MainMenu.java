package view;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MainMenu extends JMenuBar implements ViewInterface {

	//declaration of variables
	private static final long serialVersionUID = 1L;
	JMenuItem menuFileOpen = null;
	JMenuItem menuFileExit = null;
	JMenu menuFile = null;
	
	public MainMenu() {
		//file menu
		menuFile = new JMenu("File");
		add(menuFile);
		
		//open item
		menuFileOpen = new JMenuItem("Open");
		menuFileOpen.setIcon(new ImageIcon("icons/folder-open.png"));
		menuFileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.VK_CONTROL));
		menuFileOpen.setActionCommand("open");
		menuFileOpen.setMnemonic(KeyEvent.VK_O);
		menuFile.add(menuFileOpen);
		
		//exit item
		menuFileExit = new JMenuItem("Exit");
		menuFileExit.setIcon(new ImageIcon("icons/false.png"));
		menuFileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.VK_CONTROL));
		menuFileExit.setActionCommand("exit");
		menuFileExit.setMnemonic(KeyEvent.VK_X);
		menuFile.add(menuFileExit);
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void registerListener(ActionListener listener) {
		
		menuFileOpen.addActionListener(listener);
		menuFileExit.addActionListener(listener);
		
	}
	
}
