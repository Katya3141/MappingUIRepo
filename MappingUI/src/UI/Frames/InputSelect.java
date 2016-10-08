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
	JFileChooser chooser;
	public File theImage;
	
	public InputSelect(MainClass myClass) {

		mainClass = myClass;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);


		openButton = new JButton("From file...");
		openButton.setBounds(mainClass.getWidth()/2-200, 200, 400, 50);
		addListeners();
		add(openButton);


		JLabel title = new JLabel();
		title.setText("How do you want to input your map?");
		title.setFont(new Font("Dialog", Font.PLAIN, 30));
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

