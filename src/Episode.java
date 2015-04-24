import java.util.List;


public class Episode {

	private String name;
	private int length;		//in minutes
	private int episodeNumber;
	private List<Review> reviews;
	
	public Episode(String n, int number, int time, List<Review> r)
	{
		name = n;
		length = time;
		reviews = r;
		episodeNumber = number;
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
}
