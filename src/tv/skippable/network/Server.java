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

import tv.skippable.database.Database;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server 
{

		 public static void main(String[] args) throws Exception 
		 {
			 ServerSocket listener = new ServerSocket(9090);
			 try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                    BufferedReader input =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()));
                }finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
	

	
	private void run()
	{
		PrintWriter out =
		        new PrintWriter(clientSocket.getOutputStream(), true);
		    BufferedReader in = new BufferedReader(
		        new InputStreamReader(clientSocket.getInputStream()));
	}
    
	
}
