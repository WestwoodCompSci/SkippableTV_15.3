//import java.util.ArrayList;

import java.util.ArrayList;

import tv.skippable.backend.Episode;
import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;
import tv.skippable.database.Database;
import tv.skippable.gui.LoginDialogue;
import tv.skippable.gui.SkippableTVGUIMain;


public class GeneralTester {
	
	/*
	 * At this point I am testing by manually inputting data for
	 * several shows into the database to see if the rest can work
	 * with that
	*/
	
	

	public static void main(String[] args) {
		
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
		data.getshowList().add(new TVShow("Some Show",someShowEpisodes));
		
		//create and add a user
		User someUser = new User("some_user","passwords");
		data.getuserList().add(someUser);
		
		LoginDialogue w = new LoginDialogue(data.getuserList());
		w.setVisible(true);

	}

	}
