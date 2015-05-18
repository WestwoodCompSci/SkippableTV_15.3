import java.util.ArrayList;
import java.util.List;

import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.Episode;


public class Testing 
{

	//Shouldn't each TV show have an array of seasons?
	
	public static void main(String[] args)
	{
		
		
		List<Episode> episodes = new ArrayList<Episode>();
		TVShow test = new TVShow("The Office", episodes);
		List<Review> reviews = new ArrayList<Review>();
		reviews.add(new Review(5, "10/10"));
		test.addEpisode(new Episode("title", 1, 1, 23, new ArrayList<Review>()));
		List<Episode> eps = test.getEpisodes();
		Episode episode = eps.get(0);
		
		System.out.println(episode.getReviews().get(0).getName());
		
		
	}
	
	
	
	
	
	
	
	
			
			
}
