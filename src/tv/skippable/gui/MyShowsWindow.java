package tv.skippable.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.metal.*;

public class MyShowsWindow extends JFrame 
{
	public MyShowsWindow()
	{
		this.setTitle("My Shows");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setPreferredSize(new Dimension(600, 400));
		this.setLocation(400, 200);
		
		//vBox
			Box vBox = Box.createVerticalBox();
			JScrollPane frame = new JScrollPane(vBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
			this.setContentPane(frame);
			
			String[] potato = {
					"test 1", "yolo the obamacare",
					"nein pls"
			};
				
			JList list = new JList(potato); //data has type Object[]
			list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			list.setLayoutOrientation(JList.VERTICAL);
			list.setVisibleRowCount(-1);
			
			JScrollPane listScroller = new JScrollPane(list);
			vBox.add(listScroller);
			
			
			//once we make a selection
		/*	myShows.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					
					//store their choice and implement into main frame
					
					dispose();
				}
				
				
				
			});*/
		
		
		
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args)
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
	}
	}
