package tv.skippable.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegisterDialogue extends JDialog {
	private static final long serialVersionUID = 1993578053536612277L;

	/**
	 * Initialises the things.
	 */
	public RegisterDialogue() {
		this.setTitle("Register — skippable.tv");
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
		
		Box vBox=Box.createVerticalBox();
		Box titleBox=Box.createHorizontalBox();
		Box nameBox=Box.createHorizontalBox();
		Box passBox=Box.createHorizontalBox();
		Box buttonBox=Box.createHorizontalBox();
		
		vBox.add(Box.createVerticalStrut(10));
		vBox.add(titleBox);
		vBox.add(Box.createVerticalStrut(10));
		vBox.add(nameBox);
		vBox.add(Box.createVerticalStrut(5));
		vBox.add(passBox);
		vBox.add(buttonBox);
		
		this.add(vBox);
		
		JLabel title=new JLabel("Enter your desired username and password.");
		titleBox.add(title);
		
		nameBox.add(Box.createHorizontalStrut(5));
		JLabel nameLabel=new JLabel("Username:");
		nameBox.add(nameLabel);
		nameBox.add(Box.createHorizontalStrut(5));
		JTextField nameField=new JTextField();
		nameField.setMaximumSize(new Dimension(300,80));
		//nameField.setMinimumSize(new Dimension(150,50));
		//nameField.setPreferredSize(new Dimension(150,50));
		nameBox.add(nameField);
		nameBox.add(Box.createHorizontalStrut(5));
		
		passBox.add(Box.createHorizontalStrut(5));
		JLabel passLabel=new JLabel("Password:");
		passBox.add(passLabel);
		passBox.add(Box.createHorizontalStrut(7));
		JTextField passField=new JTextField();
		passField.setMaximumSize(new Dimension(300,80));
		passBox.add(passField);
		passBox.add(Box.createHorizontalStrut(5));
		
		JButton confirmButton=new JButton("Confirm");
		buttonBox.add(confirmButton);
		JButton cancelButton=new JButton("Cancel");
		buttonBox.add(cancelButton);
		cancelButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		
		this.pack();
		
		
		
	}
	
	// test method
	public static void main(String[] args) {
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
				RegisterDialogue w = new RegisterDialogue();
				w.setVisible(true);
			}
		});
	}
}