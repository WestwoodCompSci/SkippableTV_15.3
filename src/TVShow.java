import java.util.ArrayList;
import java.util.List;


public class TVShow {

	private String name;
	private List <Episode> episodes;
	private int length; //in minutes
	public TVShow(String n, List <Episode> eps)
	{
		name = n;
		episodes = eps;
		setLength();
		orderFixer(episodes);
	}
	
	private List<Episode> orderFixer(List<Episode> preCheck)
	{
		List<Episode> postCheck = new ArrayList<Episode>();
		for(int i = 0; i < preCheck.size(); i++)
		{
			 postCheck.add(preCheck.get(i).getEpisodeNumber() - 1, preCheck.get(i));
		}
		return postCheck;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Episode> getEpisodes()
	{
		return episodes;
	}
	
	public void addEpisode(Episode ep)
	{
		episodes.add(ep);
		setLength();
		orderFixer(episodes);
	}
	
	public void addEpisodes(List<Episode> eps)
	{
		for(Episode x : eps)
		{
			this.addEpisode(x);
		}
		setLength();
	}
	
	public void setLength()
	{
		int total = 0;
		for (int i = 0; i < episodes.size(); i++)
		{
			total += episodes.get(i).getLength();
		}
		
		length = total;
	}
	
	public int getLength()
	{
		return length;
	}
	
	
}
