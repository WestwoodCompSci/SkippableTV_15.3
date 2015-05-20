import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerNetwork {
	

	 public static void main(String[] args) throws IOException 
	   { 
	    ServerSocket serverSocket = null; 

	    try { 
	         serverSocket = new ServerSocket(10007); 
	        } 
	    catch (IOException e) 
	        { 
	         System.err.println("Could not listen on port: 10007."); 
	         System.exit(1); 
	        } 

	    Socket clientSocket = null; 
	    System.out.println ("Waiting for connection.....");

	    try { 
	         clientSocket = serverSocket.accept(); 
	        } 
	    catch (IOException e) 
	        { 
	         System.err.println("Accept failed."); 
	         System.exit(1); 
	        } 
	
	   }
}
