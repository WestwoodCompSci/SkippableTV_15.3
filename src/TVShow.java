import java.util.ArrayList;
import java.util.List;


public class TVShow {

	private String name;
	private List <Season> seasons;
	private int length; //in minutes
	public TVShow(String n, List <Season> s)
	{
		name = n;
		seasons = s;
		updateLength();
		orderFixer(seasons);
	}
	
	private List<Season> orderFixer(List<Season> preCheck)
	{
		List<Season> postCheck = new ArrayList<Season>();
		for(int i = 0; i < preCheck.size(); i++)
		{
			 postCheck.add(preCheck.get(i).getSeasonNumber() - 1, preCheck.get(i));
		}
		return postCheck;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Season> getSeasons()
	{
		return seasons;
	}
	
	public void addSeason(Season s)
	{
		seasons.add(s.getSeasonNumber() - 1, s);
		updateLength();
	}
	
	public void addSeasons(List<Season> ssns)
	{
		for(Season x : ssns)
		{
			this.seasons.add(x.getSeasonNumber() - 1, x);
		}
		updateLength();
	}
	
	public void updateLength()
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
