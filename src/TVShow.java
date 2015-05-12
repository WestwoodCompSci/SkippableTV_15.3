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
		epSort();
		updateLength();
	}
	
	private void epSort()
	{
		
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
		updateLength();
		epSort();
	}
	
	public void addEpisodes(List<Episode> eps)
	{
		for(Episode x : eps)
		{
			this.addEpisode(x);
		}
		updateLength();
		epSort();
	}
	
	public void updateLength()
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
	
	public List<Episode> bestEpsRating(double minRating)
	{
		List<Episode> goodEps = episodes;
		for (Episode x : goodEps)
		{
			if (x.getRating() < minRating)
				goodEps.remove(x);
		}
		
		return goodEps;
	}
	
	public List<Episode> bestEpsTime(int minutes)
	{
		List<Episode> showEps = episodes;
		List<Episode> goodEps = new ArrayList<Episode>();
		rateSort(showEps);
		int time = 0;
		for (int i = 0; i < goodEps.size(); i++)
		{
			time += show
		}
		return null;
	}
}
