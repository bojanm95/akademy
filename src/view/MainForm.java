package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import model.AppModel;

public class MainForm extends JFrame implements ViewInterface {

	private static final long serialVersionUID = 1L;
	private AppModel model = null;
	private Dimension scrDim = Toolkit.getDefaultToolkit().getScreenSize();
	private MainMenu menuBar = null;
	
	public MainForm(AppModel model) {
		
		try {
			UIManager.setLookAndFeel(LookAndFeel.WINDOWS.getLAF());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("Unable to load LAF!");
		}
		
		
		this.model = model;
		//main frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(model.getTitle());
		setSize(model.getAppDim());
		setLocation(scrDim.width/2 - model.getAppDim().width/2, scrDim.height/2 - model.getAppDim().height/2);
		setIconImage(new ImageIcon("icons/application.png").getImage());
		menuBar = new MainMenu();
		setJMenuBar(menuBar);
		
		//content pane
		JPanel contentPane = new JPanel(new BorderLayout());
		
		AppToolbar toolBar = new AppToolbar();
		contentPane.add(toolBar,BorderLayout.NORTH);
		
		StatusBar statusBar = new StatusBar(model.getState());
		contentPane.add(statusBar,BorderLayout.SOUTH);
		
		setContentPane(contentPane);
		setVisible(true);
	}

	
	public void update() {
		// TODO Auto-generated method stub
		
	}

	
	public void registerListener(ActionListener listener) {

		menuBar.registerListener(listener);
	}
	
	
}
