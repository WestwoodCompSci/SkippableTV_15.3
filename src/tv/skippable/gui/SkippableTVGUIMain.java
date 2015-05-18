 package tv.skippable.gui;

import javax.swing.*;
import javax.swing.plaf.metal.*;
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
			DefaultMetalTheme t = new DefaultMetalTheme();
			MetalLookAndFeel.setCurrentTheme(t);
			UIManager.setLookAndFeel(new MetalLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace(); 
		}
		
		
		// check if logged in? idk
		
		// Create UI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginDialogue w = new LoginDialogue();
				w.setVisible(true);
			}
		});
	}
}
