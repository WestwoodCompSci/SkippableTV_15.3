package tv.skippable.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = -5049692097637413733L;

	/**
	 * Constructs the GUI.
	 */
	public MainWindow() {
		this.setTitle("skippable.tv");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set minimum size, and center the window
		this.setPreferredSize(new Dimension(640, 480));
		this.setMinimumSize(this.getPreferredSize());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.width /= 2;
		screenSize.height /= 2;

		screenSize.width -= this.getPreferredSize().width / 2;
		screenSize.height -= this.getPreferredSize().height / 2;
		
		this.setLocation(screenSize.width, screenSize.height);		
	}
	
	/**
	 * Shows the window. The basic UI has already been built in the constructor.
	 */
	public void showWindow() {
		this.setVisible(true);
	}
}
