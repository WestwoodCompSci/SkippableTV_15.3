package tv.skippable.gui;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame

{
	public MainFrame()
	{
		this.setTitle("Skippable.TV");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(800,500));
		this.setLocation(350, 200);
		
		//vBox
		Box vBox = Box.createVerticalBox();
		
		
		JScrollPane frame = new JScrollPane(vBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		this.setContentPane(frame);
		
		
		
		
		//More Boxes
		Box menuBox = Box.createHorizontalBox();
		Box showBox = Box.createHorizontalBox();
		Box episodes = Box.createHorizontalBox();
		Box episodeProgress = Box.createHorizontalBox();
		Box labelTime = Box.createHorizontalBox();
		Box time = Box.createHorizontalBox();
		
		//Adding Boxes
		vBox.add(menuBox);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(showBox);
		frame.add(Box.createVerticalStrut(50));
		vBox.add(episodes);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(episodeProgress);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(labelTime);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(time);
		frame.add(Box.createVerticalStrut(10));
		
		
		//Menu Box
		
		JButton addShow = new JButton ("Add Show...");
		addShow.setFont(new Font("Times Roman", Font.PLAIN, 20));
		addShow.setPreferredSize(new Dimension(40,20));
		
		JButton myShows = new JButton ("My Shows...");
		myShows.setFont(new Font("Times Roman", Font.PLAIN, 20));
		addShow.setPreferredSize(new Dimension(40,20));
		
		menuBox.add(Box.createHorizontalStrut(5));
		menuBox.add(addShow);
		menuBox.add(Box.createHorizontalStrut(50));
		menuBox.add(myShows);
		menuBox.add(Box.createHorizontalStrut(5));
		
		//showBox
		
		JLabel title = new JLabel ("Title of Show");
		title.setFont(new Font("Times Roman", Font.BOLD, 40));
		
		String s = "Season 3" + ":" + "" + "2hrs 30 min";
		
		JLabel seasonNum = new JLabel (s);
		JProgressBar seasonPro = new JProgressBar();
		
		ImageIcon i1 = new ImageIcon("left-arrow-transparent.png");
		Image image = i1.getImage();
		Image newIm = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newi1 = new ImageIcon(newIm);
		
		
		
		ImageIcon i2 = new ImageIcon("right-arrow-transparent.png");
		Image image2 = i2.getImage();
		Image newIm2 = image2.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newi2 = new ImageIcon(newIm2);
		
		JButton arrow1 = new JButton(newi1);
		//arrow1.setPreferredSize(new Dimension(40,40));
		
		JButton arrow2 = new JButton(newi2);
		
		
		showBox.add(Box.createHorizontalStrut(10));
		showBox.add(title);
		showBox.add(Box.createHorizontalStrut(50));
		showBox.add(seasonNum);
		showBox.add(Box.createHorizontalStrut(1));
		showBox.add(arrow1);
		showBox.add(Box.createHorizontalStrut(15));
		showBox.add(seasonPro);
		showBox.add(Box.createHorizontalStrut(5));
		showBox.add(arrow2);
		showBox.add(Box.createHorizontalStrut(30));
		
		
		//episodes
		
			//png 
		//episode Progress
		
			JLabel question = new JLabel("What Episode?");
			
			
			JComboBox episodeList = new JComboBox ();
			episodeList.setPreferredSize(new Dimension(200,40));
			episodeList.setMaximumSize(new Dimension(200,40));
			
			episodeProgress.add(Box.createHorizontalStrut(10));
			episodeProgress.add(question);
			episodeProgress.add(Box.createHorizontalStrut(20));
			episodeProgress.add(episodeList);
			episodeProgress.add(Box.createHorizontalStrut(50));
			
		//labelTime Box
			
			JLabel question2 = new JLabel("How much time do I have?");
			
			labelTime.add(question2);
			
		//time
			
			JLabel hours = new JLabel ("Hours:");
			JTextPane hoursText = new JTextPane();
			hoursText.setPreferredSize(new Dimension(100,40));
			hoursText.setMaximumSize(new Dimension(100,40));
			
			
			 JLabel minutes = new JLabel ("Minutes:");
			 JTextPane minutesText = new JTextPane();
			 minutesText.setPreferredSize(new Dimension(100,40));
			minutesText.setMaximumSize(new Dimension(100,40));
			 
			 time.add(Box.createHorizontalStrut(10));
			 time.add(hours);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(hoursText);
			 time.add(Box.createHorizontalStrut(40));
			 time.add(minutes);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(minutesText);
			 time.add(Box.createHorizontalStrut(10));
			 
			//go button
			 
			 
			 //remove button
			
;			
		
		
		
		
		
		
		
		
	

		
	
		
		
		this.pack();
		this.setVisible(true);
		
		
		
		
		
		
		
			}
	
	
		
}



