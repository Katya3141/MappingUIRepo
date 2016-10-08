package UI.Frames;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import UI.Main.MainClass;

public class MainMenu extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;
	
	private MainClass mainClass;
	
	public MainMenu(MainClass myClass) {
		
		mainClass = myClass;//TODO resizing window reset myFrame
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		JButton inputNewButton = new JButton("Input New Map");
		inputNewButton.setBounds(mainClass.getWidth()/2-200, mainClass.getHeight()/2-25, 400, 50);
		
		JButton viewPathButton = new JButton("View Path");
		viewPathButton.setBounds(mainClass.getWidth()/2-200, mainClass.getHeight()/2+40, 400, 50);
		
		add(inputNewButton);
		add(viewPathButton);
	}
}
