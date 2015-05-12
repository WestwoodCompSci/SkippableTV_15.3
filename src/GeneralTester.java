import java.util.ArrayList;

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
		
		
		ArrayList<Episode> someShowS1Eps = new ArrayList<Episode>();
		int i=1;
		while(i<14){
			someShowS1Eps.add(new Episode("EpisodeS1E"+i, i, 24, someShowReviews));
			i++;
		}
		ArrayList<Episode> someShowS2Eps = new ArrayList<Episode>();
		int itwo=1;
		while(itwo<14){
			someShowS2Eps.add(new Episode("EpisodeS2E"+itwo, itwo, 24, someShowReviews2));
			itwo++;
		}
		
		Season someShowS1=new Season("Some Show", 1, someShowS1Eps);
		Season someShowS2=new Season("Some Show",2,someShowS2Eps);
		
		ArrayList<Season> someShowSeasons=new ArrayList<Season>();
		someShowSeasons.add(someShowS1);
		someShowSeasons.add(someShowS2);
		
		TVShow someShow=new TVShow("Some Show",someShowSeasons);
		
		User someUser=new User("Some User","passwords");
		
		
		
		//printing to test
		
		System.out.println(someShow.getName());
		System.out.println(someShow.getSeasons());
		System.out.println(someShow.getLength());
		System.out.println(someShow.getSeasons().get(0).getEpisodes().get(4).getEpisodeNumber());
		
		
		
		
		//SkippableTVGUIMain.main(args);
		
		
		
		
		
		
		
		
		

	}

}
