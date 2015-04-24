import java.util.List;


public class Season {
	//Fields
	private List<Episode> episodes;
	private String show;
	private int seasonNumber;
	
	//Constructor
	public Season(String show, int seasonNumber, List<Episode> episodes)
	{
		this.show = show;
		this.seasonNumber = seasonNumber;
		this.episodes = episodes;
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
	
	public void addEpisode(Episode episode)
	{
		
	}
	
	public void addEpisodes(List<Episode> episodes)
	{
		
	}
}
