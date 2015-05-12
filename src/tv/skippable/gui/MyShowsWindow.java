package tv.skippable.gui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

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
				
				
		
		
		
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() 
			{
				new MyShowsWindow();
			}} );
	}
	}
