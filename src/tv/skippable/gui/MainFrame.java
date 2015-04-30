package tv.skippable.gui;



import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
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
		
		this.setPreferredSize(new Dimension(700,500));
		this.setLocation(450, 200);
		
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
		frame.add(Box.createVerticalStrut(10));
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
		addShow.setFont(new Font("Times Roman", Font.PLAIN, 40));
		
		JButton myShows = new JButton ("My Shows...");
		myShows.setFont(new Font("Times Roman", Font.BOLD, 40));
		
		menuBox.add(Box.createHorizontalStrut(10));
		menuBox.add(addShow);
		menuBox.add(Box.createHorizontalStrut(100));
		menuBox.add(myShows);
		menuBox.add(Box.createHorizontalStrut(10));
		
		//showBox
		
		JLabel title = new JLabel ("Title of Show");
		title.setFont(new Font("Times Roman", Font.BOLD, 40));
		
		String s = "Season 3" + ":" + "" + "2hrs 30 min";
		
		JLabel seasonNum = new JLabel (s);
		JProgressBar seasonPro = new JProgressBar();
		
		showBox.add(Box.createHorizontalStrut(10));
		showBox.add(title);
		showBox.add(Box.createHorizontalStrut(50));
		showBox.add(seasonNum);
		showBox.add(Box.createHorizontalStrut(10));
		showBox.add(seasonPro);
		showBox.add(Box.createHorizontalStrut(30));
		
		
		//episodes
		
			//png 
		//episode Progress
		
			JLabel question = new JLabel("What Episode?");
			
			
			JComboBox episodeList = new JComboBox ();
			
			episodeProgress.add(Box.createHorizontalStrut(10));
			episodeProgress.add(question);
			episodeProgress.add(Box.createHorizontalStrut(20));
			episodeProgress.add(episodeList);
			episodeProgress.add(Box.createHorizontalStrut(50))
;			
		
		
		//JLabel showBox = new JLabel (show)
		
		
		
		
		
	

		
	
		
		
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

