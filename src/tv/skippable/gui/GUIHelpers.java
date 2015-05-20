package tv.skippable.gui;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 * Various things to help with GUI stuff.
 * 
 * @author tristan
 */
public class GUIHelpers {
	/**
	 * Loads an image from the tv.skippable.gui.images package, and creates an
	 * ImageIcon from it.
	 * 
	 * @param name Filename in the folder.
	 * @return An ImageIcon, or NULL if there was an error.
	 */
	public static ImageIcon getIcon(String name) {
		URL path = GUIHelpers.class.getResource(name);
		
		return new ImageIcon(path);
	}
}
