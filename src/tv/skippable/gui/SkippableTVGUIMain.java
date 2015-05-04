package tv.skippable.gui;

import javax.swing.*;
/**
 * Main function for the app. Creates a runnable to hold the main runloop, and
 * create the fun main window.
 * 
 * @author andrew
 */
public class SkippableTVGUIMain {
	public static void main(String[] args) {
		// Set the look and feel
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		// check if logged in? idk
		
		// Create UI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//new MainFrame();
				LoginDialogue w = new LoginDialogue();
				w.setVisible(true);
			}
		});
	}
}
