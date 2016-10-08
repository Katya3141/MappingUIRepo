package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;
import java.awt.Rectangle;
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

		addListeners();
		add(yesButton);
		add(noButton);
		add(title);
	}

	void addListeners(){

		noButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				inputNewPressed();
			}
		});
	}

	void inputNewPressed(){
		mainClass.showPanel("InputSelect");
	}

}