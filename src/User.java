import java.util.List;


public class User {

	private String username;
	private String password;
	private List<TVShow> showList;
	
	public User(String user, String pass)
	{
		username = user;
		password = pass;
	}
	
	public void addShow(TVShow show)
	{
		showList.add(show);
	}
	
	
}
