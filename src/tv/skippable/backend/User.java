package tv.skippable.backend;
import java.util.ArrayList;
import java.util.List;


public class User {

	private String username;
	private String password;
	private List<TVShow> showList;
	
	public User(String user, String pass)
	{
		username = user;
		password = pass;
		showList = new ArrayList<TVShow>();
	}
	
	public void addShow(TVShow show)
	{
		showList.add(show);
	}
	
	public List<TVShow> getShows()
	{
		return showList;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void updateShow(TVShow newShow)
	{
		for  (int i = 0; i < showList.size(); i++)
			if (showList.get(i).getName().equals(newShow.getName()))
				showList.set(i, newShow);
			else addShow(newShow);
	}
}
