package UI.Frames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JPanel;

import UI.Main.MainClass;
import UI.Util.Picture;

public class MakePicture extends JPanel{

	private static final long serialVersionUID = 5538667180352547676L;

	MainClass mainClass;
	Files files;
	ArrayList<String> lines = new ArrayList<String>();
	Picture thePicture;

	public MakePicture(MainClass myClass) {
		mainClass = myClass;
		
	}
	
	public void setupPicture(){
		
		try {
			for(String line : Files.readAllLines(Paths.get("mapData.txt"))){
				lines.add(line);
			}
		} catch (IOException e) { e.printStackTrace(); }
		
		thePicture = new Picture(mainClass.selectionMenu.theImage.getPath());
		for(int i = 0; i < lines.size(); i++){
			for(int pixX = 0; pixX < lines.get(i).length(); pixX++){
				thePicture.getPixel(pixX, i).setRed(255 * Integer.valueOf(lines.get(i).charAt(pixX)));
				thePicture.getPixel(pixX, i).setGreen(255 * Integer.valueOf(lines.get(i).charAt(pixX)));
				thePicture.getPixel(pixX, i).setBlue(255 * Integer.valueOf(lines.get(i).charAt(pixX)));
			}
		}
		
		thePicture.repaint();
		thePicture.write(mainClass.selectionMenu.theImage.getPath());
		
	}
	
	
}
