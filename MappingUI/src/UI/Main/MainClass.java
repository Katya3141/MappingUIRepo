package UI.Main;

import java.awt.CardLayout;

import javax.swing.*;//for JFrame etc.

import UI.Frames.InputSelect;
import UI.Frames.MainMenu;

public class MainClass extends JFrame{

	private static final long serialVersionUID = -4080966872671085583L;

	public MainMenu menu;
	public InputSelect selectionMenu;
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
		selectionMenu = new InputSelect();
		
		panels.add(menu, "MainMenu");
		panels.add(selectionMenu, "InputSelect");
	}
	
	public void showPanel(String panel){
		myCardLayout.show(panels, panel);
		repaint();
		revalidate();
	}
	
	
}