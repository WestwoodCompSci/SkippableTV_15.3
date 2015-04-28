package tv.skippable.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class RegisterDialogue extends JDialog {
	private static final long serialVersionUID = 1993578053536612277L;

	/**
	 * Initialises the things.
	 */
	public RegisterDialogue() {
		this.setTitle("Register — skippable.tv");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// Set minimum size, and centre the window
		this.setPreferredSize(new Dimension(400, 500));
		this.setMinimumSize(this.getPreferredSize());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.width /= 2;
		screenSize.height /= 2;

		screenSize.width -= this.getPreferredSize().width / 2;
		screenSize.height -= this.getPreferredSize().height / 2;
		
		this.setLocation(screenSize.width, screenSize.height);
	}
	
	// test method
	public static void main(String[] args) {
		// Set the look and feel
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		// Create UI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RegisterDialogue w = new RegisterDialogue();
				w.setVisible(true);
			}
		});
	}
}