package tv.skippable.backend;

public class Review {

	private int score;
	private String comment;
	
	public Review(int s, String c)
	{
		score = s;
		comment = c;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String getName()
	
	{
		return comment;
	}
}
