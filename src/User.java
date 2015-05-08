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
}
