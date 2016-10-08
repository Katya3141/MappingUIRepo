package UI.Main;

import javax.swing.*;//for JFrame etc.
import UI.Frames.MainMenu;

public class MainClass extends JFrame{

	private static final long serialVersionUID = -4080966872671085583L;

	MainMenu menu;
	
	//start of everything
	MainClass(){
		setupFrame();
		
	}
	
	void setupFrame(){
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initPanels();//setup panel objects
		add(menu);
		setVisible(true);
	}
	
	void replacePanel(JPanel panel){
		removeAll();
		add(panel);
	}
	
	void initPanels(){
		menu = new MainMenu(this);
	}
}