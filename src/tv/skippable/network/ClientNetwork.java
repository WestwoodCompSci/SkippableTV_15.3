package tv.skippable.network;
//import User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;

import tv.skippable.backend.User;


public class ClientNetwork {
	
	String hostname = "55F9622";
	BufferedReader in;
	PrintWriter out;
	Socket socket;
	
	public void listenSocket(){
	//Create socket connection
	   try{
	     socket = new Socket(hostname, 9001);
	     out = new PrintWriter(socket.getOutputStream(), true);
	     in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	   } catch (UnknownHostException e) {
	     System.out.println("Unknown host: " + hostname);
	     System.exit(1);
	   } catch  (IOException e) {
	     System.out.println("No I/O");
	     System.exit(1);
	   }
	}
	
	public void run()
	{
		String identify; 
		while(true)
		{
			try
			{
				identify = in.readLine();
			}
			catch (IOException e) 
			{ 
				System.out.println("Read failed");
				System.exit(-1);
			}
		}
	}
	

	public User getUser()
	{
		String identify; 
		while(true)
		{
			try
			{
				identify = in.readLine();
			}
			catch (IOException e) 
			{ 
				System.out.println("Read failed");
				System.exit(-1);
			}
		}
		//out
	}


	public User getUserShowList(String username,String password) throws IOException
	{
	//	out.writeObject(username);
		Server server = new Server();

		User user = new User(username, password);
		user.getShows();
		
		
		
		return null;
	}

	
	public TVShow getTVShow()
	{
		return null;

	}


}
