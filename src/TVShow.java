import java.util.List;


public class TVShow {

	private String name;
	private List <Season> seasons;
	
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
}
