package tv.skippable.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.metal.*;

import tv.skippable.backend.Episode;
import tv.skippable.backend.Review;
import tv.skippable.backend.TVShow;
import tv.skippable.backend.User;

public class MyShowsWindow extends JFrame 
{
	public MyShowsWindow(User user)
	{
		this.setTitle("My Shows");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setPreferredSize(new Dimension(600, 400));
		this.setLocation(400, 200);
		
		//vBox
			Box vBox = Box.createVerticalBox();
			JScrollPane frame = new JScrollPane(vBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
			this.setContentPane(frame);
			
			//testing for list actionListener
			//ArrayList<Episode> episodeList= new ArrayList<Episode>();
			//Episode e = new Episode("Ep1", 1, 1, 23, null);
			//episodeList.add(e);
			//TVShow show1 = new TVShow("show1", episodeList); 
			//String name1 = show1.getName();
			//TVShow[] myShows = {show1};
			//String[] myShowsName = {name1};
			//-------------------------------
			
			//String[] potato = {
			//		"test 1", "yolo the obamacare",
			//		"nein pls"
					
					//can we change this to an array of TVShows instead of String? I think it makes it easier to implement later...and then the JList just displays the TVShow title?
			//};
			
			String[] userShowTitles=new String[user.getShows().size()];
			for(int i=0;i<user.getShows().size();i++){
				userShowTitles[i]=user.getShows().get(i).getName();				
			}
			
			JList list = new JList(userShowTitles); //data has type Object[]
			list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			list.setLayoutOrientation(JList.VERTICAL);
			list.setVisibleRowCount(-1);
			
			JButton j = new JButton("Cancel");
			JScrollPane listScroller = new JScrollPane(list);
			vBox.add(listScroller);
			
			
			//once we make a selection
			list.addListSelectionListener(new ListSelectionListener()
			{

				@Override
				public void valueChanged(ListSelectionEvent arg0) {
					
					
					//store what we selected to be implemented on Main Frame:
					String value = (String) list.getSelectedValue();
					int i = list.getSelectedIndex();
					TVShow selectedShow = user.getShows().get(i);
					System.out.println(selectedShow.getName());
					
					MainFrame frame = new MainFrame(user,selectedShow);
					
					dispose();
					
					
				}

				
				
				
				
			});
		
		
		
		
		this.pack();
		this.setVisible(true);
	}
	
	/*public static void main(String[] args)
	{
		
		try {
			DefaultMetalTheme t = new DefaultMetalTheme();
			MetalLookAndFeel.setCurrentTheme(t);
			UIManager.setLookAndFeel(new MetalLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace(); 
		}
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() 
			{
				new MyShowsWindow();
			}} );
	}*/
	}
