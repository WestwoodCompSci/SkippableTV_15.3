package tv.skippable.network;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Server 
{

	ObjectInputStream in;
	ObjectOutputStream out;
	public Server(String hostname) throws UnknownHostException, IOException
	{
		Socket socket = new Socket(hostname, 9001);
        in = new ObjectInputStream(socket.getInputStream());
        out = new ObjectOutputStream(socket.getOutputStream());
	}
	
	
}
