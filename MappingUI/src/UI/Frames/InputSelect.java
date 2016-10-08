package UI.Frames;

import java.awt.Color;
import java.awt.Font;
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

public class InputSelect extends JPanel {


	private MainClass mainClass;
	JButton openButton;
	JFileChooser chooser;
	
	private static final long serialVersionUID = -3099011863008576617L;


	public InputSelect(){

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		JLabel title = new JLabel();
		title.setText("Select a File");
		title.setFont(new Font("Dialog", Font.PLAIN, 70));
		title.setBounds(new Rectangle(new Point(200, 50), title.getPreferredSize()));

		openButton = new JButton("Open file...");
		openButton.setBounds(0,0,50,50);

		addListeners();

		add(openButton);
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
		    }
	}
}