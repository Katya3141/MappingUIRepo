package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import UI.Main.MainClass;

public class InputSelect extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;

	private MainClass mainClass;
	JButton openButton;
	JButton pictureButton;
	JButton webButton;
	JFileChooser chooser;
	public File theImage;//TODO make this store in the main class
	
	public InputSelect(MainClass myClass) {

		mainClass = myClass;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);


		
		openButton = new JButton("From file...");
		openButton.setBounds(mainClass.getWidth()/2-200, 150, 400, 50);
		addListeners();
		add(openButton);

		pictureButton = new JButton("From camera...");
		pictureButton.setBounds(mainClass.getWidth()/2-200, 210, 400, 50);
		add(pictureButton);
		
		webButton = new JButton("From the web...");
		webButton.setBounds(mainClass.getWidth()/2-200, 270, 400, 50);
		add(webButton);

		JLabel title = new JLabel();
		title.setText("How do you want to input your map?");
		title.setFont(new Font("Dialog", Font.PLAIN, 30));
		title.setForeground(Color.LIGHT_GRAY);
		title.setBounds(new Rectangle(new Point(mainClass.getWidth()/2-title.getPreferredSize().width/2, 50), title.getPreferredSize()));
		add(title);
		
	}

	private void addListeners() {
		openButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				openButtonPressed();
			}

		});

	}

	private void openButtonPressed() {
		chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to open this file: " +
					chooser.getSelectedFile().getName());
			theImage = chooser.getSelectedFile();
			mainClass.showPanel("FileCheck");
			mainClass.fileCheck.displayImage(theImage);
		}
	}
}

