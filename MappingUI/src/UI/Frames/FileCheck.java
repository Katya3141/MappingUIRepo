package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.Main.MainClass;

public class FileCheck extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;

	private MainClass mainClass;
	private JButton yesButton;
	private JButton noButton;

	public FileCheck(MainClass myClass) {

		mainClass = myClass;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		yesButton = new JButton("Yes");
		yesButton.setBounds(mainClass.getWidth()-100, mainClass.getHeight()-70, 100, 50);

		noButton = new JButton("No");
		noButton.setBounds(0, mainClass.getHeight()-70, 100, 50);
		
		JLabel title = new JLabel();
		title.setText("Is this your file?");
		title.setFont(new Font("Dialog", Font.PLAIN, 30));
		title.setBounds(new Rectangle(new Point(mainClass.getWidth()/2-title.getPreferredSize().width/2, 50), title.getPreferredSize()));

		if(mainClass.selectionMenu.theImage.getPath()!=null)
			ImageIcon image = new ImageIcon(mainClass.selectionMenu.theImage.getPath());
		JLabel label = new JLabel("", image, JLabel.CENTER);
		label.setBounds(30,30,40,40);
		
		addListeners();
		add(yesButton);
		add(noButton);
		add(title);
		add(label);
	}

	void addListeners(){

		yesButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				yesButtonPressed();
			}
		});
		
		noButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				toInputSelect();
			}
		});
	}

	void yesButtonPressed() {
		mainClass.showPanel("MainMenu");
	}
	
	void toInputSelect() {
		mainClass.showPanel("InputSelect");
	}

}
