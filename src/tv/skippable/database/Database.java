package tv.skippable.database;

import java.util.*;

import org.json.simple.*;

import tv.skippable.backend.Episode;
import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;

import java.io.FileWriter;
import java.io.IOException;


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
	
	public void save(List<User> a) 	//writing data to text document?
	{
		JSONArray list = new JSONArray();
		JSONObject obj = new JSONObject();
		//obj.put("Name:", "Database");
		
		for (int i = 0; i < a.size(); i++)
		{
			JSONObject alpha = new JSONObject();
			alpha.put("username", a.get(i).getUsername());
			alpha.put("password", a.get(i).getPassword());
			
			JSONArray betalist = new JSONArray();
			for (int j = 0 ; j < a.get(i).getShows().size(); j++)
			{
				betalist.add(a.get(i).getShows().get(j).getName());
			}
			
			alpha.put("user show list", betalist);
			
			list.add(alpha);
		}
		
		
		obj.put("User list", list);
		
		try {
			FileWriter file = new FileWriter("H:/Comp. Sci SL/CompSciSL_Workspace/SkippableTV_15.3/src/Database Text Document");
			file.write(obj.toJSONString());
			file.flush();
			file.close();
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		/*finally
			{
			file.flush();
			file.close();
			}*/
		System.out.print(obj);
	
	
	}
	
	public void storeShows(List<TVShow> a)
	{
		
		for (int i = 0; i < a.size(); i++){
			showList.add(a.get(i));
		}
		
		
	}
	
	//I NEED TO MAKE A METHOD THAT WILL GO THROUGH THE TV SHOW LIST A-Z FILE AND TURN IT INTO A LIST<TVSHOW>
	//SO I CAN USE IT AS A PARAMETER IN THE ABOVE METHOD
	
	
	
		
	
	//                  http://www.json.org/            
	
	//					https://code.google.com/p/json-simple/wiki/EncodingExamples			
	public static void main (String[] args) 
	{
		Database thisOne = new Database();
		TVShow House_of_Cards = new TVShow("House of Cards", new ArrayList<Episode>());
		TVShow The_Simpsons = new TVShow("The Simpsons", new ArrayList<Episode>());
		thisOne.getshowList().add(House_of_Cards);
		User user1 = new User("dankLord69" , "420alldayeveryday");
		User user2 = new User("dankmemecreatorbydowneyultrasoft" , "password");
		User user3 = new User("North Korea", "Best Korea");
		User user4 = new User("Riley Taylor", "youtube tutorial legend");
		user1.addShow(House_of_Cards);
		user1.addShow(The_Simpsons);
		user2.addShow(The_Simpsons);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		thisOne.save(userList);
		
	}
		
	
		
}


	