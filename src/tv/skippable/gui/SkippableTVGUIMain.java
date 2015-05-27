 package tv.skippable.gui;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.plaf.metal.*;

import tv.skippable.backend.Episode;
import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;
import tv.skippable.database.Database;
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
				//LoginDialogue w = new LoginDialogue();
				//w.setVisible(true);
				Database data=new Database();
				//create reviews
				ArrayList<Review> someShowReviews = new ArrayList<Review>();
				someShowReviews.add(new Review(4,"4/5"));
				someShowReviews.add(new Review(5,"5/5"));
				//create episodes
				ArrayList<Episode> someShowEpisodes = new ArrayList<Episode>();
				for(int i=1;i<14;i++){
					someShowEpisodes.add(new Episode("episode #"+i,i,1,23, someShowReviews));
				}
				//create and add show to database
				TVShow someShow=new TVShow("Some Show",someShowEpisodes);
				data.getshowList().add(someShow);
				
				//create and add a user
				User someUser = new User("qwe","asd");
				data.getuserList().add(someUser);
				
				someUser.addShow(someShow);
				
				LoginDialogue w = new LoginDialogue(data.getuserList());
				w.setVisible(true);
			}
		});
	}
}
