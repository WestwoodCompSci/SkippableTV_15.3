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


public class Server 
{

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
    
	
}
