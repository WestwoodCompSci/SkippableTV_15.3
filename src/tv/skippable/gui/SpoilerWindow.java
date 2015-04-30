package tv.skippable.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class SpoilerWindow {

	public SpoilerWindow()
	{
		final JFrame frame = new JFrame("Spoilers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400, 300));
		frame.setLocation(400, 200);
		Box vBox = Box.createVerticalBox();
		frame.add(vBox);
		Box ratingBox = Box.createHorizontalBox();
		Box buttonBox = Box.createHorizontalBox();
		Box textBox = Box.createHorizontalBox();
		vBox.add(ratingBox);
		vBox.add(buttonBox);
		vBox.add(textBox);
		
		//ratingBox
		JLabel title = new JLabel("Rating:");
		title.setFont(new Font("MS Comic Sans", Font.PLAIN, 14));
		//todo: make the rating number value visible. Maybe add a progress bar to create a visual.
		
		ratingBox.add(title);
		
		//buttonBox
		JButton showSpoilers = new JButton("[Show Spoilers]");
		showSpoilers.setBackground(new Color(200,0,0,200));
		buttonBox.add(showSpoilers);
		//textBox
		JTextPane spoilerPane = new JTextPane();
		JScrollPane spoilerScroll = new JScrollPane(spoilerPane);
		textBox.add(spoilerScroll);
		
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() 
			{
				new SpoilerWindow();
			}} );
	}
	
	
	
}
