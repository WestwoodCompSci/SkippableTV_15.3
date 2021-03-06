package tv.skippable.gui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import tv.skippable.backend.*;
import tv.skippable.network.*;

import javax.swing.*;

public class MainFrame extends JFrame {
	public MainFrame(User user, TVShow show) {
		
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
		
		
		//vBox
		Box vBox = Box.createVerticalBox();
		JScrollPane frame = new JScrollPane(vBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		this.setContentPane(frame);
		
		
		
		
		//More Boxes
		Box menuBox = Box.createHorizontalBox();
		JSeparator line2 = new JSeparator();
		Box showBox = Box.createHorizontalBox();
		Box episodes = Box.createHorizontalBox();
		Box episodeProgress = Box.createHorizontalBox();
		Box labelTime = Box.createHorizontalBox();
		Box time = Box.createHorizontalBox();
		JSeparator line = new JSeparator();
		
		//Adding Boxes
		vBox.add(menuBox);
		frame.add(Box.createVerticalStrut(10));
		vBox.add(line2);
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
		vBox.add(line);
		
		
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
		
		
		//lineBox
		
		
		
		
		
		
		//showBox
		
		JLabel title = new JLabel(show.getName());
		
		title.setFont(new Font("Times Roman", Font.BOLD, 20));
		//title.setFont(title.getFont().deriveFont(40));
		
		String s = "Season: " + show.getSeason(1) + " ";
		
		JLabel seasonNum = new JLabel (s);
		JProgressBar seasonPro = new JProgressBar();
		
		JButton arrow1 = new JButton(GUIHelpers.getIcon("images/left arrow.png", 20, 20));
		arrow1.setMinimumSize(new Dimension(40,40));
		arrow1.setPreferredSize(new Dimension(40,40));
		arrow1.setMaximumSize(new Dimension(40,40));

		JButton arrow2 = new JButton(GUIHelpers.getIcon("images/right arrow.png", 20, 20));
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
			
			//changing arraylist to array
			ArrayList<Episode> episodeList1 =  (ArrayList<Episode>) show.getEpisodes();
			String[] episodeTitles = new String[episodeList1.size()];
			for(int i =0; i<episodeList1.size()-1; i++ )
			{
				episodeTitles[i]=episodeList1.get(i).getName();
			}
			
			JComboBox episodeList = new JComboBox (episodeTitles);
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
			
			
			//goButton
			JButton goButton = new JButton(GUIHelpers.getIcon("images/go button.png", 50, 40));
			goButton.setPreferredSize(new Dimension(50,40));
		//	goButton.setMaximumSize(new Dimension(50,40));
			goButton.setMinimumSize(new Dimension(50,40));
			
			//removeButton
			JButton removeButton = new JButton(GUIHelpers.getIcon("images/remove button.png", 200, 40));
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
						
						MyShowsWindow p = new MyShowsWindow(user);
						p.setVisible(true);
						dispose();

					
						
					}
					
				});
			 
			 arrow1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					//change to seasons prior
					
				}
				 
			 });
			 
			 arrow2.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						//change to seasons after
						
					}
					 
				 });
			 
			 
			 

			 
		this.pack();
		this.setVisible(true);	
	}	
	
	public JFrame getFrame(){return this;}
	
	
	public void addShowGUI(TVShow show)
	{
		
	
		//show title 
		String s = show.getName();
		 
		//show length
		int time = show.getLength();
		
		//get season
		
		//# episode per season
		for(int i =0; i<show.getEpisodes().size()-1; i++)
		{
			
			JButton episode = new JButton(show.getEpisodes().get(i).getName());
		}
		
		//
		
		
		
		 
		 
		
	}
	
	
	/*public void addAllShowsGUI(ArrayList<TVShow> allShows)
	{
		for (int i=0; i<allShows.size()-1; i++)
		{
			addShowGUI(allShows.get(i));
		}
	}
	*/
}
