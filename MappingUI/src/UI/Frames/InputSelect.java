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

public class InputSelect extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;

	private MainClass mainClass;
	private JButton fileBrowseButton;
	private JButton cameraButton;

	public InputSelect(MainClass myClass) {

		mainClass = myClass;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		fileBrowseButton = new JButton("From file...");
		fileBrowseButton.setBounds(mainClass.getWidth()/2-200, 200, 400, 50);

		cameraButton = new JButton("Camera...");
		cameraButton.setBounds(mainClass.getWidth()/2-200, 250, 400, 50);
		
		JLabel title = new JLabel();
		title.setText("How do you want to input your map?");
		title.setFont(new Font("Dialog", Font.PLAIN, 30));
		title.setBounds(new Rectangle(new Point(mainClass.getWidth()/2-title.getPreferredSize().width/2, 50), title.getPreferredSize()));

		addListeners();
		add(fileBrowseButton);
		add(cameraButton);
		add(title);
	}

	void addListeners(){

		fileBrowseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				inputNewPressed();
			}
		});
	}

	void inputNewPressed(){
		mainClass.replacePanel(mainClass.selectionMenu);
	}

}
