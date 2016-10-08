package UI.Frames;

import java.awt.Color;

import javax.swing.JPanel;

import UI.Main.MainClass;
import UI.Util.Picture;
import UI.Util.Pixel;

public class DoPath extends JPanel{

	MainClass mainClass;
	Picture thePicture;

	public DoPath(MainClass myClass){
		mainClass = myClass;//TODO resizing window reset myFrame
		thePicture = new Picture(mainClass.selectionMenu.theImage.getPath());
		thePicture.grayscale();



		setLayout(null);
		setBackground(Color.DARK_GRAY);
	}

	int[][] pictureToArray(){
		Pixel[][] array = thePicture.getPixels2D();
		int[][] intArray = new int[array.length][array[0].length];

		for(Pixel[] pixArr : array){
			for(Pixel pix : pixArr){
				///
			}
		}
		return ;
	}

}
