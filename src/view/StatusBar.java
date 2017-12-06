package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.AppState;

public class StatusBar extends JPanel {


	private static final long serialVersionUID = 1L;
	private JLabel lblLeft;
	private Dimension lblDim = new Dimension(150, 20);
	private JLabel lblCenter;
	private JLabel lblRight;
	
	public StatusBar(AppState state) {
		super(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY));
		lblLeft = new JLabel("Status: "+state);
		lblLeft.setPreferredSize(lblDim);
		lblLeft.setMaximumSize(lblDim);
		lblLeft.setMinimumSize(lblDim);
		lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblLeft, BorderLayout.WEST);
	
		lblRight = new JLabel("Right");
		lblRight.setPreferredSize(lblDim);
		lblRight.setMaximumSize(lblDim);
		lblRight.setMinimumSize(lblDim);
		lblRight.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblRight, BorderLayout.EAST);
		
		lblCenter = new JLabel("Center");
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.black));
		add(lblCenter, BorderLayout.CENTER);
	}
	
}
