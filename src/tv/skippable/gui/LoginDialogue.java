package tv.skippable.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import tv.skippable.backend.Episode;
import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;

public class LoginDialogue extends JDialog {
	private static final long serialVersionUID = -5853916478565948100L;

	private JTextField username;
	private JPasswordField password;
	
	public LoginDialogue(List<User> users) {
		this.setTitle("Log In — skippable.tv");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// Set minimum size, and centre the window
		this.setPreferredSize(new Dimension(380, 185));
		this.setMinimumSize(this.getPreferredSize());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.width /= 2;
		screenSize.height /= 2;

		screenSize.width -= this.getPreferredSize().width / 2;
		screenSize.height -= this.getPreferredSize().height / 2;
		
		this.setLocation(screenSize.width, screenSize.height);
		
		// Create a vertical box into which everything is added
		Box content = Box.createVerticalBox();
		
		// Add a little help text
		Box introBox = Box.createHorizontalBox();

		introBox.add(Box.createHorizontalStrut(8));
		introBox.add(new JLabel("Enter your username and password to get started."));
		introBox.add(Box.createHorizontalStrut(8));
		
		content.add(introBox, BorderLayout.NORTH);
		
		// Create a panel with spring layout
		JPanel formPanel = new JPanel(new SpringLayout());
				
		// Add the username row
		JLabel usernameLabel = new JLabel("Username:");
		formPanel.add(usernameLabel);
		
		username = new JTextField();
		usernameLabel.setLabelFor(username);
		formPanel.add(username);

		// Add the password row
		JLabel passwordLabel = new JLabel("Password:");
		formPanel.add(passwordLabel);
		
		password = new JPasswordField();
		passwordLabel.setLabelFor(password);
		formPanel.add(password);
		
		content.add(formPanel);
		
		// create the spring layout grid
		SpringUtilities.makeCompactGrid(formPanel, 2, 2, 6, 6, 6, 6);
		
		// Add the "Forgot Password?", "Log In" and "Cancel" buttons
		Box buttons = Box.createHorizontalBox();

		JButton forgot = new JButton("Forgot Password");
		forgot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		buttons.add(forgot);

		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
			}
		});
		buttons.add(register);
		
		buttons.add(Box.createHorizontalGlue());
		
		// login button actually logs the user in, yo
		JButton logIn = new JButton("Log In");
		logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				User loginUser=null;
				
				for(User u:users){
					if(u.getUsername().equals(username.getText())){
						loginUser=u;
						break;
					}
				}
				if(loginUser==null){
					username.setText("This user does not exist");
					password.setText("");
				}
				else if(!loginUser.getPassword().equals(password.getPassword())){
					password.setText("");
					username.setText("Incorrect password");
				}
				else{
					ArrayList<Episode> episodeList = new ArrayList<Episode>();
					Episode episode = new Episode("Default", 1, 1, 0, null);
					episodeList.add(episode);
					TVShow defaultshow = new TVShow("Show", episodeList);
					MainFrame w = new MainFrame(loginUser, defaultshow);
					w.setVisible(true);
					dispose();
				}
				/*ArrayList<Episode> episodeList = new ArrayList<Episode>();
				Episode episode = new Episode("Default", 1, 1, 0, null);
				episodeList.add(episode);
				TVShow defaultshow = new TVShow("Show", episodeList);
				User defaultUser = new User("random", "password");
				MainFrame w = new MainFrame(defaultUser, defaultshow);
				w.setVisible(true);
				dispose();*/
			}
		});
		buttons.add(logIn);
		
		// clicking cancel terminates the application
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttons.add(cancel);
		
		// Add everything
		content.add(buttons, BorderLayout.SOUTH);
		getContentPane().add(content);
		
		
		register.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				RegisterDialogue w = new RegisterDialogue();
				w.setVisible(true);

			
				
			}
			
		});
	}	
	
	
	// test method
	/*public static void main(String[] args) {
		// Set the look and feel
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		// Create UI
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginDialogue w = new LoginDialogue();
				w.setVisible(true);
			}
		});
	}*/
}
