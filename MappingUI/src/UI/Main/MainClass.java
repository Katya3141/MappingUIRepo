package UI.Main;

import java.awt.CardLayout;

import javax.swing.*;//for JFrame etc.

import UI.Frames.*;

public class MainClass extends JFrame{

	private static final long serialVersionUID = -4080966872671085583L;

	public MainMenu menu;
	public InputSelect selectionMenu;
	public FileCheck fileCheck;
	public DoPath doPath;
	public MakePicture makePicture;
	CardLayout myCardLayout;
	JPanel panels;

	//start of everything
	MainClass(){
		setupFrame();

	}
	
	void setupFrame(){
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myCardLayout = new CardLayout();
		panels = new JPanel();
		panels.setLayout(myCardLayout);
		
		initPanels();//setup panel objects
		myCardLayout.show(panels, "MainMenu");
		
		add(panels);
		setVisible(true);
	}
	
	void initPanels(){
		menu = new MainMenu(this);
		selectionMenu = new InputSelect(this);
		fileCheck = new FileCheck(this);
		doPath = new DoPath(this);
		makePicture = new MakePicture(this);
		
		panels.add(makePicture, "MakePicture");
		//panels.add(doPath, "DoPath");
		panels.add(menu, "MainMenu");
		panels.add(selectionMenu, "InputSelect");
		panels.add(fileCheck, "FileCheck");
	}
	
	public void showPanel(String panel){
		myCardLayout.show(panels, panel);
		repaint();
		revalidate();
	}
	
	
}