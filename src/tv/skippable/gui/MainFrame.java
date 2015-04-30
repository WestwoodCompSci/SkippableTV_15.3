package tv.skippable.gui;



import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame

{
	public MainFrame()
	{
		this.setTitle("Skippable.TV");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(700,500));
		this.setLocation(450, 200);
		
		
		
		JScrollPane frame = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		this.setContentPane(frame);
		
		
		//vBox
		Box vBox = Box.createVerticalBox();
		frame.add(vBox);
		
		//More Boxes
		Box showMenu = Box.createHorizontalBox();
		Box showTitle = Box.createHorizontalBox();
		Box episodes = Box.createHorizontalBox();
		Box episodeProgress = Box.createHorizontalBox();
		Box labelTime = Box.createHorizontalBox();
		Box time = Box.createHorizontalBox();
		
		//Adding Boxes
		vBox.add(showMenu);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(showTitle);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(episodes);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(episodeProgress);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(labelTime);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(time);
		frame.add(Box.createVerticalStrut(10));
		
		
		//showMenu Box
		
		JButton addShow = new JButton ("Add Show...");
		addShow.setFont(new Font("Times Roman", Font.PLAIN, 40));
		
		JButton myShows = new JButton ("My Shows...");
		myShows.setFont(new Font("Times Roman", Font.BOLD, 40));
		
		showMenu.add(Box.createHorizontalStrut(10));
		showMenu.add(addShow);
		showMenu.add(Box.createHorizontalStrut(100));
		showMenu.add(myShows);
		showMenu.add(Box.createHorizontalStrut(10));
		
		
		
	

		
	
		
		
		this.pack();
		this.setVisible(true);
		
		
		
		
		
		
		
			}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}} );
		
		
}

}

