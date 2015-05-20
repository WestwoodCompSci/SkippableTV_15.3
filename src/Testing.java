import java.util.ArrayList;
import java.util.List;

import tv.skippable.backend.Review;
import tv.skippable.backend.Season;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.Episode;


public class Testing 
{

	//Shouldn't each TV show have an array or arraylist of seasons?
	
	public static void main(String[] args)
	{
		
		
		List<Episode> episodes = new ArrayList<Episode>();
		TVShow test = new TVShow("The Office", episodes);
		List<Review> reviews = new ArrayList<Review>();
		reviews.add(new Review(5, "10/10"));
		test.addEpisode(new Episode("title", 1, 1, 23, reviews));
		test.addEpisode(new Episode("title2", 2, 1, 22, new ArrayList<Review>()));
		List<Episode> eps = test.getEpisodes();
		Episode episode = eps.get(0);
		
		//I think there may be a problem with the epsort method. It doesn't seem to work with only one episode
		
		System.out.println(episode.getReviews().get(0).getName());
		System.out.println(episode.getName());
		System.out.println(eps.get(1).getName());
		
		List<Episode> episodes2 = new ArrayList<Episode>();
		Season s1 = new Season ("The Office", 1, episodes2);
		s1.addEpisode(test.getEpisodes().get(0));
		s1.addEpisode(test.getEpisodes().get(1));
		
		System.out.println(s1.getLength());
		s1.setLength();
		System.out.println(s1.getLength());
		
		
		
	}
	
	
	
	
	
	
	
	
			
			
}
