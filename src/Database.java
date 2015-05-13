
import java.util.*;
import org.json.simple.*;


public class Database {

	static ArrayList<User> userList;        //should this be static? eclipse told me to make it static	
//	data stems from list of users
	
	ArrayList<TVShow> showList;
	ArrayList<Review> reviewList; //no idea what we're doing
//	data stems from user inputs into show collection
	
	
	public Database()
	{
		userList = new ArrayList<User>();
		showList = new ArrayList<TVShow>();
		reviewList = new ArrayList<Review>();
	}

	public List<TVShow> getshowList()
	{
		return showList;
	}
	
	public List<User> getuserList()
	{
		return userList;
	}
	
	public List<Review> getreviewList()
	{
		return reviewList;
	}
	
	//public void addUser(User a)
	//{
	//	userList.add(a);
	//}
	
	public void sortListAlpha()
	{
		for (int c = 0; c < userList.size(); c++) {
		      for (int d = 0; d < userList.size() - c; d++) {
		        if (userList.get(d).getUsername().compareTo(userList.get(d+1).getUsername()) < 0) /* For descending order use < */
		        {
		          User swap  = userList.get(d);
		          userList.set(d, userList.get(d+1));
		          userList.set(d+1,swap);
		        }
		      }
		    }
	}
	
	public void deleteUser(User a)
	{
		userList.remove(a);
	}
		
	
	public void addReview(Review r, Episode e)
	{
		e.getReviews().add(r);
	}
	
		
	//ADD JSON METHODS TO ADD STUFF TO THE DATABASE TEXT DOCUMENT TO WRITE DATA FROM LISTS TO FILE
	
	//                  http://www.json.org/            <--json.org = muy bueno
	
	//					https://code.google.com/p/json-simple/wiki/EncodingExamples			<-- json library api
	
	public static void main (String[] args)
	{
		Database thisOne = new Database();
		/*TVShow House_of_Cards = new TVShow("House of Cards", new ArrayList<Season>());
		thisOne.getshowList().add(House_of_Cards);*/
		User user1 = new User("dankLord69" , "420alldayeveryday");
		userList.add(user1);
		
	}
		
	
		
}


	