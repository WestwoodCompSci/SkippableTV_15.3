package tv.skippable.backend;
import java.util.List;


public class Episode{

	private String name;
	private int length;		//in minutes
	private int episodeNumber;	//last two digits are episode numbers, everything before
	private List<Review> reviews;
	
	public Episode(String name, int episode, int season, int length, List<Review> reviews)
	{
		this.name = name;
		this.length =  length;
		this.reviews = reviews;
		episodeNumber = season * 100 + episode;
	}
	
	public int getEpisodeNumber()
	{
		return episodeNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public List<Review> getReviews()
	{
		return reviews;
	}
	
	public double getRating()
	{
		int total = 0;
		for (int i = 0; i < reviews.size(); i++)
			total += reviews.get(i).getScore();
		double average = (double)total;
		return average / reviews.size();
	}
	
	public int epCompare(Episode other)
	{
		if (other.getEpisodeNumber() > getEpisodeNumber())
			return -1;
		else if (other.getEpisodeNumber() < getEpisodeNumber())
			return 1;
		return 0;
	}
	
	public int rateCompare(Episode other)
	{
		if (other.getRating() > getRating())
			return -1;
		else if (other.getRating() < getRating())
			return 1;
		return 0;
	}
}
