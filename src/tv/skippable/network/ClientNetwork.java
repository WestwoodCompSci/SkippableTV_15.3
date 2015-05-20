package tv.skippable.network;
//import User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import tv.skippable.backend.User;


public class ClientNetwork {
	
	String hostname = "55F9622";
	ObjectInputStream in;
	ObjectOutputStream out;
	
	public ClientNetwork()
	{
		
	}
	
	private void run() throws IOException {
		
        Socket socket = new Socket(hostname, 9001);
        in = new ObjectInputStream(socket.getInputStream());
        out = new ObjectOutputStream(socket.getOutputStream());
	}
	
	public User getUserShowList(String username,String password) throws IOException
	{
		out.writeObject(username);
		Server server = new Server();
		User user = new User(username, password);
		user.getShows();
		
		
		
		return null;
	}

}
