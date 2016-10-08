package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Point;
import java.awt.Rectangle;

import javax.imageio.ImageIO;
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
	private ImageIcon image;
	private JLabel label;

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
		title.setForeground(Color.LIGHT_GRAY);

		addListeners();
		add(yesButton);
		add(noButton);
		add(title);
	}
	
	public void displayImage(File path) {
		BufferedImage image = null;
		try {
		    image = ImageIO.read(new File(path.getPath()));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		double scaleFactor = 250.0/(double)image.getHeight();
		Image newImage = image.getScaledInstance((int) (image.getWidth()*scaleFactor), 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon = new ImageIcon(newImage);
		label = new JLabel("", icon, JLabel.CENTER);
		
		label.setBounds(mainClass.getWidth()/2-(int)(image.getWidth()*scaleFactor)/2,100,(int) (image.getWidth()*scaleFactor),250);
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
		mainClass.menu.createPathButton.setEnabled(true); 

	}
	
	void toInputSelect() {
		remove(label);
		mainClass.showPanel("InputSelect");
	}

}
