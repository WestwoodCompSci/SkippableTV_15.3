package tv.skippable.backend;
import java.util.ArrayList;
import java.util.List;


public class TVShow {

	private String name;
	private List<Episode> episodes;
	private int length; //in minutes
	
	public TVShow(String n, List <Episode> eps)
	{
		name = n;
		episodes = eps;
		epSort();
		updateLength();
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Episode> getEpisodes()
	{
		return episodes;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public List<Episode> getSeason(int seasonNumber)
	{
		List<Episode> season = new ArrayList<Episode>();
		for (int i = 0; i < episodes.size(); i++) {
			if (episodes.get(i).getEpisodeNumber() / 100 == seasonNumber)
				season.add(episodes.get(i));
		}
		return season;
	}
	
	public TVShow bestByRating(double minRating)
	{
		rateSort();
		TVShow toWatch = new TVShow(getName(), new ArrayList<Episode>());
		List<Episode> tempEpisodes = getEpisodes();
		int index = 0;
		for (int i = 0; i < tempEpisodes.size(); i++) {
			if (tempEpisodes.get(i).getRating() < minRating) {
				index = i;
			}
		}
		tempEpisodes.subList(index, tempEpisodes.size() -1);
		toWatch.addEpisodes(tempEpisodes);
		toWatch.epSort();
		return toWatch;
	}
	
	public TVShow bestByTime(int minutes)
	{
		rateSort();
		TVShow toWatch = new TVShow(getName(), new ArrayList<Episode>());
		
		for(int i = episodes.size() - 1; i >= 0; i--) {
			if (toWatch.getLength() + episodes.get(i).getLength() > minutes) {
				break;
			}
			toWatch.addEpisode(episodes.get(i));
		}
		toWatch.epSort();
		return toWatch;
	}
	
	public void addEpisode(Episode toAdd)
	{
		episodes.add(toAdd);
		updateLength();
		epSort();
	}
	
	public void addEpisodes(List<Episode> toAdd)
	{
		for(Episode x : toAdd)
		{
			this.addEpisode(x);
		}
		updateLength();
		epSort();
	}
	
	public void epSort()
	{
		QuickSort sorter = new QuickSort();
		Episode[] toSort = new Episode[episodes.size()];
		for(int i = 0; i < toSort.length; i++) {
			toSort[i] = episodes.get(i);
		}
		
		Episode[] sorted = sorter.quickSort(toSort);
		episodes.clear();
		for (Episode x : sorted) {
			episodes.add(x);
		}
	}
	
	public void rateSort()
	{
		QuickSort sorter = new QuickSort();
		Episode[] toSort = new Episode[episodes.size()];
		for(int i = 0; i < toSort.length; i++) {
			toSort[i] = episodes.get(i);
		}
		
		Episode[] sorted = sorter.quickSort2(toSort);
		episodes.clear();
		for (Episode x : sorted) {
			episodes.add(x);
		}
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
	
	private class QuickSort {
		private Episode[] episodes;
		private int length;
		
		//used for epSort
		private Episode[] quickSort(Episode[] stuff)
		{
			if(stuff == null || stuff.length == 0)
				return new Episode[0];
			episodes = stuff;
			length = stuff.length;
			sortHelper(0, length - 1);
			return episodes;
		}
		
		private void sortHelper(int lo, int hi)
		{
			int i = lo;
			int j = hi;
			
			Episode pivot = episodes[lo + (hi - lo) / 2];
			
			while(i <= j) {
				while(episodes[i].epCompare(pivot) < 0) {
					i++;
				}
				while(episodes[j].epCompare(pivot) > 0) {
					j--;
				}
				
				if (i <= j)  {
					Episode help = episodes[i];
					episodes[i] = episodes[j];
					episodes[j] = help;
					i++;
					j--;
				}
			}
			
			if (lo < j) {
				sortHelper(lo, j);
			}
			if (i < hi) {
				sortHelper(i, hi);
			}
		}
		
		//used for rateSort
		private Episode[] quickSort2 (Episode[] stuff)
		{
			if(stuff == null || stuff.length == 0)
				return new Episode[0];
			episodes = stuff;
			length = stuff.length;
			sortHelper2(0, length - 1);
			return episodes;
		}
		
		private void sortHelper2 (int lo, int hi)
		{

			int i = lo;
			int j = hi;
			
			Episode pivot = episodes[lo + (hi - lo) / 2];
			
			while(i <= j) {
				while(episodes[i].rateCompare(pivot) < 0) {
					i++;
				}
				while(episodes[j].rateCompare(pivot) > 0) {
					j--;
				}
				
				if (i <= j)  {
					Episode help = episodes[i];
					episodes[i] = episodes[j];
					episodes[j] = help;
					i++;
					j--;
				}
			}
			
			if (lo < j) {
				sortHelper2(lo, j);
			}
			if (i < hi) {
				sortHelper2(i, hi);
			}
		}
	}
}
