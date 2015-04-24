import java.util.List;


public class Episode {

	private String name;
	private int length;
	private List<Review> reviews;
	
	public Episode(String n, int time, List<Review> r)
	{
		name = n;
		length = time;
		reviews = r;
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
