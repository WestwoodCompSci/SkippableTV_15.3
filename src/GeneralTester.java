//import java.util.ArrayList;

import java.util.ArrayList;

import tv.skippable.backend.Episode;
import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;
import tv.skippable.database.Database;
import tv.skippable.gui.SkippableTVGUIMain;


public class GeneralTester {
	
	/*
	 * This is a general tester for me to look at the classes and how they 
	 * work together (if they work at all)
	 * 
	 * I will upload this to GitHub, feel free to use it as a template or 
	 * whatever but I would appreciate you not overwriting all my changes
	 * and then uploading them
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database db=new Database();
		
		ArrayList<Review> someShowReviews = new ArrayList<Review>();
		someShowReviews.add(new Review(1,"it sucks it's just like game of thrones"));
		someShowReviews.add(new Review(5,"it's awesome it reminds me of game of thrones"));
		
		ArrayList<Review> someShowReviews2=new ArrayList<Review>();
		someShowReviews2.add(new Review(1,"even worse than season 1"));
		someShowReviews2.add(new Review(5, "even better than season 1"));
		
		
		ArrayList<Episode> someShowEps = new ArrayList<Episode>();
		int i=1;
		while(i<14){
			someShowEps.add(new Episode("Episodetitle"+i,1, i, 24, someShowReviews));
			i++;
		}
		int itwo=1;
		while(itwo<14){
			someShowEps.add(new Episode("Episodetitle"+itwo,2, itwo, 24, someShowReviews2));
			itwo++;
		}
		
	
		TVShow someShow=new TVShow("Some Show",someShowEps);
		
		User someUser=new User("Some User","passwords");
		
		
		
		//printing to test
		
		System.out.println(someShow.getName());
		System.out.println(someShow.getLength());
		System.out.println(someShow.getEpisodes().get(0).getName());
		
		
		
		
		//SkippableTVGUIMain.main(args);
		
		
		
		
		
		
		
		
		

	}

	}
