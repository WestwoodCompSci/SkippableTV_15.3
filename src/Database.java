
import java.util.*;
import org.json.simple.*;


public class Database {

	static ArrayList<User> userList;        //should this be static? eclipse told me to make it static	
//	data stems from list of users
	
	ArrayList<TVShow> showList;
//	data stems from user inputs into show collection
	
	
	public Database()
	{
		userList = new ArrayList<User>();
		showList = new ArrayList<TVShow>();
	}

	public List<TVShow> getshowList()
	{
		return showList;
	}
	
	public List<User> getuserList()
	{
		return userList;
	}
	
	//public void addUser(User a)
	//{
	//	userList.add(a);
	//}
	
	public void sortListAlpha()
	{
		//implement method that will search through user list to alphabetically sort all users
	}
	
	//public void deleteUser(User a)
	//{
	//	userList.remove(a);
	//}
		
	
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
		TVShow House_of_Cards = new TVShow("House of Cards", new ArrayList<Season>());
		thisOne.getshowList().add(House_of_Cards);
		User user1 = new User("dankLord69" , "420alldayeveryday");
		userList.add(user1);
		
	}
		
	
		
}


	