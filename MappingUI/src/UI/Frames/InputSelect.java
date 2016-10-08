package UI.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UI.Main.MainClass;

public class InputSelect extends JPanel {


	private MainClass mainClass;

	private static final long serialVersionUID = -3099011863008576617L;


	public InputSelect(){

		setLayout(null);
		setBackground(Color.DARK_GRAY);

		JLabel title = new JLabel();
		title.setText("TEST");
		title.setFont(new Font("Dialog", Font.PLAIN, 70));
		title.setBounds(new Rectangle(new Point(200, 50), title.getPreferredSize()));

		add(title);
	}
}