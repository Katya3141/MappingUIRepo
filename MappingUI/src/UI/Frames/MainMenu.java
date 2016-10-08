package UI.Frames;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;
	
	private JFrame myFrame;
	
	public MainMenu(JFrame frame) {
		
		myFrame = frame; //TODO resizing window reset myFrame
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		JButton inputNewButton = new JButton("Input New Map");
		inputNewButton.setBounds(myFrame.getWidth()/2-200, myFrame.getHeight()/2-25, 400, 50);
		JButton viewPathButton = new JButton("View Path");
		viewPathButton.setBounds(myFrame.getWidth()/2-200, myFrame.getHeight()/2+40, 400, 50);
		
		add(inputNewButton);
		add(viewPathButton);
	}
}
