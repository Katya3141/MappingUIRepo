package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.Main.MainClass;

public class MainMenu extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;

	private MainClass mainClass;
	private JButton inputNewButton;
	JButton createPathButton;
	boolean gotPicture;

	public MainMenu(MainClass myClass) {
		gotPicture = false;
		mainClass = myClass;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		inputNewButton = new JButton("Input New Map");
		inputNewButton.setBounds(mainClass.getWidth()/2-200, 200, 400, 50);

		createPathButton = new JButton("Create Path");
		createPathButton.setBounds(mainClass.getWidth()/2-200, 260, 400, 50);
		createPathButton.setEnabled(false); 

		
		JLabel title = new JLabel();
		title.setText("Mapper");
		title.setFont(new Font("Dialog", Font.PLAIN, 70));
		title.setBounds(new Rectangle(new Point(mainClass.getWidth()/2-title.getPreferredSize().width/2, 50), title.getPreferredSize()));
		title.setForeground(Color.LIGHT_GRAY);

		addListeners();
		add(inputNewButton);
		add(createPathButton);
		add(title);
	}

	void addListeners(){

		inputNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				inputNewPressed();
			}
		});

		createPathButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				createPathPressed();
			}
		});
	}

	protected void createPathPressed() {
		if(gotPicture)	{
			mainClass.showPanel("DoPath");
			mainClass.doPath.setupPicture();
		} 
	}

	void inputNewPressed(){
		mainClass.showPanel("InputSelect");
	}

}
