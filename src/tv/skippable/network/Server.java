package tv.skippable.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import tv.skippable.backend.User;
import tv.skippable.database.Database;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server 
{
	
	private ServerSocket listener;
	private Socket socket;
	private ObjectOutputStream out;
	private ObjectInputStream input;
	private boolean inUse;
	
	public Server()
	{
		Database d = new Database(); //How do we access the database? Just created a new instance of database here to use. Perhaps needs to reivse.
		while(true)
		{
			try {
				ServerSocket listener = new ServerSocket(9090);
	
				while (true) {
					socket = listener.accept();
					out = new ObjectOutputStream(socket.getOutputStream());
					input = new ObjectInputStream(socket.getInputStream());
					User user = null;
				
					String username = (String) input.readObject();
					if (username.startsWith("GETLIST"))
					{
						for (int i = 0; i < d.getuserList().size(); i++)
						{
							if (d.getuserList().get(i).getUsername().equals(username.substring(7)))
							{
								user = d.getuserList().get(i);
							}
						}
						out.writeObject(user.getShows());
					}
					else if(username.startsWith("CONFIRM"))
					{
						String [] s = username.split("\n");
						for (int i = 0; i < d.getuserList().size(); i++)
						{
							if (d.getuserList().get(i).getUsername().equals(s[0].substring(7)))
							{
								if (d.getuserList().get(i).getPassword().equals(s[1]))
								{
									out.writeBoolean(true);
									return;
								}
							}
						}
						out.writeBoolean(false);
					}
					else if(username.startsWith("REGISTER"))
					{
						String [] s = username.split("\n");
						for (int i = 0; i < d.getuserList().size(); i++)
						{
							if (d.getuserList().get(i).getUsername().equals(s[0].substring(8)))
							{
								out.writeBoolean(false);
								return;
							}
						}
						//we have to add the user to the database, but there is no adduser() function on the database?
						
						
					}
					/// read input
					// relay input to appropriate methods
					// get return values from methods
					// write output
					
				}
	//			listener.close();
			}
			catch(Exception e) {}
		}
	}
		 
	
	
	/*
	 * if(out == null) { throws new Exception(); }
	 * out.print("....");
	 * 
	 */
	
}
