package tv.skippable.network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import tv.skippable.database.Database;


public class Server 
{

	Scanner in;
	PrintWriter out;
	Socket socket;
	public Server(String hostname) throws UnknownHostException, IOException
	{
		 try{
			 socket = new Socket(hostname, 9001);
			  } catch (IOException e) {
			    System.out.println("Could not listen on port 9001");
			    System.exit(-1);
			  }
		
		 out = new PrintWriter(socket.getOutputStream(), true);
	     in = new Scanner(new InputStreamReader(socket.getInputStream()));
	}
	
	public void run() throws ClassNotFoundException
	{
		String identify;
		while(true)
		{
			try
			{
				identify = (String) in.readObject();
			}
			catch (IOException e) 
			{
				System.out.println("Read failed");
				System.exit(-1);
			}
		}
	
	}
	
}
