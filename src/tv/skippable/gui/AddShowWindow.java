package tv.skippable.gui;



import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class AddShowWindow {
	
	public AddShowWindow()
	{
		//The window consists of a horizontal box with half of it containing a Scroll Pane of shows
		//and the other half contains a vertical box with components that change when you select a show
		//and also an "add show" and "cancel" button. idk what i'm doing.
		
		final JFrame frame = new JFrame("Add Show");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600, 400));
		frame.setLocation(400, 200);
		Box mainBox = Box.createVerticalBox();
		frame.add(mainBox);
		Box hBox = Box.createHorizontalBox();
		mainBox.add(Box.createVerticalStrut(5));
		mainBox.add(hBox);
		mainBox.add(Box.createVerticalStrut(5));
		hBox.add(Box.createHorizontalStrut(5));
		JList showList = new JList();
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
		
		addButton.addActionListener(new ActionListener()
		{
			
		})
		
		
		hBox.add(vBox);
		hBox.add(Box.createHorizontalStrut(5));
		frame.pack();
		frame.setVisible(true);
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



