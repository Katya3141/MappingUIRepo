package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.Main.MainClass;

public class MainMenu extends JPanel{

	private static final long serialVersionUID = 6203946356665308224L;

	private MainClass mainClass;
	private JButton inputNewButton;
	private JButton viewPathButton;

	public MainMenu(MainClass myClass) {

		mainClass = myClass;//TODO resizing window reset myFrame

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		inputNewButton = new JButton("Input New Map");
		inputNewButton.setBounds(mainClass.getWidth()/2-200, 200, 400, 50);


		viewPathButton = new JButton("View Path");
		viewPathButton.setBounds(mainClass.getWidth()/2-200, 250, 400, 50);

		JLabel title = new JLabel();
		title.setText("Mapper");
		title.setFont(new Font("Dialog", Font.PLAIN, 70));
		title.setBounds(10, 50, 1000, 1000);

		addListeners();
		add(inputNewButton);
		add(viewPathButton);
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
	}

	void inputNewPressed(){
		mainClass.replacePanel(mainClass.selectionMenu);

	}

}
