package tv.skippable.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainFrame extends JFrame {
	public MainFrame() {
		
		this.setTitle("Skippable.TV");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(800,500));
		this.setMinimumSize(this.getPreferredSize());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.width /= 2;
		screenSize.height /= 2;

		screenSize.width -= this.getPreferredSize().width / 2;
		screenSize.height -= this.getPreferredSize().height / 2;
		
		this.setLocation(screenSize.width, screenSize.height);
		
		//this.addAllShowsGUI(); <--need it to add all the shows...i think...like a load function?
		//vBox
		Box vBox = Box.createVerticalBox();
		JScrollPane frame = new JScrollPane(vBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		this.setContentPane(frame);
		
		
		
		
		//More Boxes
		Box menuBox = Box.createHorizontalBox();
		Box lineBox = Box.createHorizontalBox();
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
		addShow.setPreferredSize(new Dimension(40,20));
		
		JButton myShows = new JButton ("My Shows...");
		addShow.setPreferredSize(new Dimension(40,20));
		
		menuBox.add(Box.createHorizontalStrut(5));
		menuBox.add(addShow);
		menuBox.add(Box.createHorizontalStrut(50));
		menuBox.add(myShows);
		menuBox.add(Box.createHorizontalStrut(5));
		
		
		
		
		//showBox
		JLabel title = new JLabel("Title of Show");
		title.setFont(new Font("Times Roman", Font.BOLD, 20));
		//title.setFont(title.getFont().deriveFont(40));
		
		String s = "Season 3" + ":" + "" + "2hrs 30 min";
		
		JLabel seasonNum = new JLabel (s);
		JProgressBar seasonPro = new JProgressBar();
		
		ImageIcon i1 = new ImageIcon("left arrow.png");
		Image image = i1.getImage();
		Image newIm = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newi1 = new ImageIcon(newIm);
		
		ImageIcon i2 = new ImageIcon("right arrow.png");
		Image image2 = i2.getImage();
		Image newIm2 = image2.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newi2 = new ImageIcon(newIm2);
		
		JButton arrow1 = new JButton(newi1); 
		arrow1.setMinimumSize(new Dimension(40,40));
		arrow1.setPreferredSize(new Dimension(40,40));
		arrow1.setMaximumSize(new Dimension(40,40));
		
		JButton arrow2 = new JButton(newi2);
		arrow2.setMinimumSize(new Dimension(40,40));
		arrow2.setPreferredSize(new Dimension(40,40));
		arrow2.setMaximumSize(new Dimension(40,40));
		
		
		showBox.add(Box.createHorizontalStrut(10));
		showBox.add(title);
		showBox.add(Box.createHorizontalStrut(50));
		showBox.add(seasonNum);
		showBox.add(Box.createHorizontalStrut(1));
		
		showBox.add(arrow1);
		showBox.add(Box.createHorizontalStrut(5));
		showBox.add(seasonPro);
		showBox.add(Box.createHorizontalStrut(5));
		showBox.add(arrow2);
		showBox.add(Box.createHorizontalStrut(30));
		
		
		//episodes
		
			
		//episode Progress

			JLabel question = new JLabel("What Episode Are You On?");
			question.setFont(new Font("Times Roman", Font.BOLD, 15));
			
			
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
			question2.setFont(new Font("Times Roman", Font.BOLD, 15));
			
			labelTime.add(Box.createHorizontalStrut(10));
			labelTime.add(question2);
			labelTime.add(Box.createHorizontalStrut(500));
			
			//time
			
			JLabel hours = new JLabel ("Hours:");
			JTextPane hoursText = new JTextPane();
			hoursText.setPreferredSize(new Dimension(100,40));
			hoursText.setMinimumSize(new Dimension(100,40));
			hoursText.setMaximumSize(new Dimension(100,40));
			
			
			 JLabel minutes = new JLabel ("Minutes:");
			 JTextPane minutesText = new JTextPane();
			 minutesText.setPreferredSize(new Dimension(100,40));
			 minutesText.setMinimumSize(new Dimension(100,40));
			 minutesText.setMaximumSize(new Dimension(100,40));
			
			
			
			//go picture
			ImageIcon i3 = new ImageIcon("go button.png");
			Image image3 = i3.getImage();
			Image newIm3 = image3.getScaledInstance(50,40 , java.awt.Image.SCALE_SMOOTH);
			ImageIcon newi3 = new ImageIcon(newIm3);
			
			//goButton
			JButton goButton = new JButton(newi3);
			goButton.setPreferredSize(new Dimension(50,40));
		//	goButton.setMaximumSize(new Dimension(50,40));
			goButton.setMinimumSize(new Dimension(50,40));

			
			//remove button
			
			ImageIcon i4 = new ImageIcon("remove button.png");
			Image image4 = i4.getImage();
			Image newIm4 = image4.getScaledInstance(200, 40, java.awt.Image.SCALE_SMOOTH);
			ImageIcon newi4 = new ImageIcon(newIm4);
			
			//removeButton
			JButton removeButton = new JButton(newi4);
			removeButton.setPreferredSize(new Dimension(200,40));
			removeButton.setMinimumSize(new Dimension(200,40));
			
			//timeBox
			 time.add(Box.createHorizontalStrut(5));
			 time.add(hours);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(hoursText);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(minutes);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(minutesText);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(goButton);
			 time.add(Box.createHorizontalStrut(10));
			 time.add(removeButton);
			 time.add(Box.createHorizontalStrut(10));
			 
			 
			 
			
		//ActionListeners
			 
			 //Add Shows
			 
			 addShow.addActionListener( new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						
						AddShowWindow w = new AddShowWindow();
						w.setVisible(true);

					
						
					}
					
				});
			 
			 goButton.addActionListener( new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						
						ChosenEpisodes p = new ChosenEpisodes();
						p.setVisible(true);

					
						
					}
					
				});
			 
			 myShows.addActionListener( new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						
						MyShowsWindow p = new MyShowsWindow();
						p.setVisible(true);

					
						
					}
					
				});
			 
			 
			 
			 
			 
			 
			 
		 
			 
			 

			 
		this.pack();
		this.setVisible(true);	
	}	
	
	public JFrame getFrame(){return this;}
	
	/*
	public void addShowGUI(TVShow show)
	{
		 show.getName();
		 
		
	}
	*/
	
	public void addAllShowsGUI(ArrayList allShows)
	{
		for (int i=0; i<allShows.size()-1; i++)
		{
			//addShowGUI(allShows.get(i));
		}
	}
}
