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
		try {
			ServerSocket listener = new ServerSocket(9090);

			while (true) {
				socket = listener.accept();
				out = new ObjectOutputStream(socket.getOutputStream());
				input = new ObjectInputStream(socket.getInputStream());
				User user = new User(username, password);
				
				String username = (String) input.readObject();
				if (username.startsWith("GETLIST"))
				{
					out.writeObject(user.getList(username.substring(7,username.length()-1)));
				}
				else if(username.startsWith("CONFIRM"))
				{
					out.writeObject(this.confirm());
				}
				else if(username.startsWith("REGISTER"))
				{
					out.writeObject(this.register());
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
		 
	
	
	/*
	 * if(out == null) { throws new Exception(); }
	 * out.print("....");
	 * 
	 */
	
}
