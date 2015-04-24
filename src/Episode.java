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

}
