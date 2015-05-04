import java.util.List;


public class TVShow {

	private String name;
	private List <Season> seasons;
	private int length; //in minutes
	public TVShow(String n, List <Season> s)
	{
		name = n;
		seasons = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Season> getSeasons()
	{
		return seasons;
	}
	
	public void setLength()
	{
		int total = 0;
		for (int i = 0; i < seasons.size(); i++)
		{
			total += seasons.get(i).getLength();
		}
		
		length = total;
	}
	
	public int getLength()
	{
		return length;
	}
}
