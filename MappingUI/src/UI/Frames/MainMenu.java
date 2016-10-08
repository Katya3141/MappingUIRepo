package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.Main.MainClass;

public class MainMenu extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;

	private JFrame frame;
	private JButton inputNewButton;
	private JButton createPathButton;

	public MainMenu(JFrame myFrame) {

		frame = myFrame;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		inputNewButton = new JButton("Input New Map");
		inputNewButton.setBounds(frame.getWidth()/2-200, 200, 400, 50);

		createPathButton = new JButton("Create Path");
		createPathButton.setBounds(frame.getWidth()/2-200, 250, 400, 50);
		
		JLabel title = new JLabel();
		title.setText("Mapper");
		title.setFont(new Font("Dialog", Font.PLAIN, 70));
		title.setBounds(new Rectangle(new Point(frame.getWidth()/2-title.getPreferredSize().width/2, 50), title.getPreferredSize()));

		add(inputNewButton);
		add(createPathButton);
		add(title);
	}
}
