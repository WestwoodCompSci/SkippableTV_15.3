import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientNetwork {

	 public static void main(String[] args) throws IOException 
	 {
		 
	 String serverHostName = "127.0.0.1"; //To be changed to the actual server's ip address.
	 
	 System.out.println ("Attemping to connect to host " + serverHostName);
	
		 Socket s = null;
		 PrintWriter o = null;
		 BufferedReader i = null;
	 
	
	     try 
	     {
	    	 s = new Socket(serverHostName, 4242); 
	    	 o = new PrintWriter(s.getOutputStream(), true);
	         i = new BufferedReader(new InputStreamReader(s.getInputStream()));
	    	 
	    	 
	     }
	     catch (UnknownHostException e)
	     {
	    	 System.err.println("Host is unknown error: " + serverHostName);
	         System.exit(1);
	     }
	     catch (IOException e)
	     {
	    	   System.err.println("Couldn't get I/O for "
                       + "the connection to: " + serverHostName);
	    	   System.exit(1);
	     }
	     
	 
	 
	 InputStream in = s.getInputStream();

	 }
	
}
