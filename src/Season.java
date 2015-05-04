import java.util.ArrayList;
import java.util.List;


public class Season {
	//Fields
	private List<Episode> episodes;
	private String show;
	private int seasonNumber;
	private int length; //in minutes
	
	//Constructor
	public Season(String show, int seasonNumber, List<Episode> episodes)
	{
		this.show = show;
		this.seasonNumber = seasonNumber;
		this.episodes = orderFixer(episodes);
		setLength();
	}
	
	//Accessors
	public int getSeasonNumber()
	{
		return seasonNumber;
	}
	
	public String getShow()
	{
		return show;
	}
	
	public List<Episode> getEpisodes()
	{
		return episodes;
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
	
	public void addEpisode(Episode episode)
	{
		episodes.add(episode.getEpisodeNumber() - 1, episode);
		setLength();
	}
	
	public void addEpisodes(List<Episode> eps)
	{
		for(Episode x : eps)
		{
			this.episodes.add(x.getEpisodeNumber() - 1, x);
		}
		setLength();
	}
	
	public int getLength()
	{
		return length;
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
}
