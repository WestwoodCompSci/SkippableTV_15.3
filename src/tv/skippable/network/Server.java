package tv.skippable.network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import tv.skippable.database.Database;
=======
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
>>>>>>> origin/master


public class Server 
{
<<<<<<< HEAD

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
=======
	ServerSocket serverSocket;
	int portNumber = 9001;
	
	
	public Server()
	{
		serverSocket = new ServerSocket(portNumber);
	    Socket clientSocket = serverSocket.accept();
	}
	
	private void run()
	{
		PrintWriter out =
		        new PrintWriter(clientSocket.getOutputStream(), true);
		    BufferedReader in = new BufferedReader(
		        new InputStreamReader(clientSocket.getInputStream()));
	}
    
>>>>>>> origin/master
	
}
