package tv.skippable.gui;



import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class AddShowWindow extends JFrame
{
	
	public AddShowWindow() 
	{
		//The window consists of a horizontal box with half of it containing a Scroll Pane of shows
		//and the other half contains a vertical box with components that change when you select a show
		//and also an "add show" and "cancel" button. idk what i'm doing.
		
		this.setTitle("Add Show");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setPreferredSize(new Dimension(600, 400));
		this.setLocation(400, 200);
		Box mainBox = Box.createVerticalBox();
		this.add(mainBox);
		Box hBox = Box.createHorizontalBox();
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox);
		mainBox.add(Box.createVerticalStrut(5));
		hBox.add(Box.createHorizontalStrut(5));
		String[] titles = null;
		Scanner scan;
		int count = 0;
		try
		{
			
			scan = new Scanner(new File("Titles.txt"));
			while(scan.hasNextLine())
			{
				String nextLine = scan.nextLine();
				titles[count] = nextLine;
				count++;
			}
			scan.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		JList showList = new JList(titles);
		
		JScrollPane scrollList = new JScrollPane(showList);
		
		hBox.add(scrollList);
		hBox.add(Box.createHorizontalStrut(5));
		
		//vert Box
		Box vBox = Box.createVerticalBox();
		vBox.add(Box.createHorizontalStrut(5));
		JTextPane titlePane = new JTextPane();
		titlePane.setSize(309,50);
		titlePane.setPreferredSize(new Dimension(309,50));
		titlePane.setMaximumSize(new Dimension(309,50));
		titlePane.setMinimumSize(new Dimension(309,50));
		JTextPane descPane = new JTextPane();
		JButton cancelButton = new JButton("Cancel");
		JButton addButton = new JButton("Add");
		Box smallHBox = Box.createHorizontalBox();
		smallHBox.add(cancelButton);
		smallHBox.add(Box.createHorizontalStrut(5));
		smallHBox.add(addButton);
		vBox.add(titlePane);
		vBox.add(Box.createVerticalStrut(5));
		vBox.add(descPane);
		vBox.add(smallHBox);
		hBox.add(vBox);
		hBox.add(Box.createHorizontalStrut(5));
		
		
		addButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
				
			}
			
		});
		
		
		cancelButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				dispose();
			
				
			}
			
		});
		
		
	
		this.pack();
		this.setVisible(true);
	}
	
	
	
	//TESTER: WILL BE REMOVED
public static void main(String[] args)
{
	SwingUtilities.invokeLater(new Runnable() {

		@Override
		public void run() 
		{
			new AddShowWindow();
		}} );
}
}
//todo: add art aspect
//todo: make the buttons do things



