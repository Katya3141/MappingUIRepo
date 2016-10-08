package UI.Main;

import javax.swing.*;//for JFrame etc.

import UI.Frames.FileCheck;
import UI.Frames.InputSelect;
import UI.Frames.MainMenu;

public class MainClass extends JFrame{

	private static final long serialVersionUID = -4080966872671085583L;

	public MainMenu menu;
	public InputSelect selectionMenu;
	public FileCheck fileCheck;
	
	//start of everything
	MainClass(){
		setupFrame();
		
	}
	
	void setupFrame(){
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initPanels();//setup panel objects
		add(fileCheck);
		setVisible(true);
	}
	
	void initPanels(){
		menu = new MainMenu(this);
		selectionMenu = new InputSelect(this);
		fileCheck = new FileCheck(this);
	}
	
	public void replacePanel(JPanel panel){
		removeAll();
		add(panel);
	}
	
	
}