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
import java.util.List;
import java.util.Scanner;

import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;
import tv.skippable.backend.User;


public class ClientNetwork {
	
	String hostname = "55F9622"; //Depends
	BufferedReader in;
	PrintWriter out;
	Socket socket;
	ObjectInputStream obIn;
	
	public void listenSocket(){
	//Create socket connection
	   try{
	     socket = new Socket(hostname, 9090);
	     
	     out = new PrintWriter(socket.getOutputStream(), true);
	     in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	     obIn = new ObjectInputStream(socket.getInputStream());
	     
	   } catch (UnknownHostException e) {
	     System.out.println("Unknown host: " + hostname);
	     System.exit(1);
	   } catch  (IOException e) {
	     System.out.println("No I/O");
	     System.exit(1);
	   }
	}
	
	public boolean confirmUser(String username, String password) throws IOException
	{
		out.println("CONFIRM" + password + "\n" + username);
		Boolean temp;
		while(true)
		{
			temp = (Boolean) obIn.readBoolean();
			break;
		}
		return temp;
	}
	
	public boolean registerUser(String username, String password) throws IOException
	{
		out.println("REGISTER" + password + "\n" + username);
		Boolean temp;
		while(true)
		{
			temp = (Boolean) obIn.readBoolean();
			break;
		}
		return temp;
	}
	
	public List<TVShow> getUserShowList(String username) throws IOException
	{
		
	//push a username, receive object userShowList
		List<TVShow> temp;
		out.println("GETLIST" + username);
		while(true)
		{
			temp = null;
			try 
			{
				temp = (List<TVShow>) obIn.readObject();
				break;
			}
			catch (ClassNotFoundException e) 
			{ 
				System.out.println("Read failed");
				System.exit(-1);
			}
		}
		
		return temp;
	}



}
