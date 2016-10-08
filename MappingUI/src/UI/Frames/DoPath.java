package UI.Frames;

import java.awt.Color;

import javax.swing.JPanel;

import UI.Main.MainClass;
import UI.Util.Picture;
import UI.Util.Pixel;

public class DoPath extends JPanel{

	MainClass mainClass;
	Picture thePicture;
	int[][] pixels;

	public DoPath(MainClass myClass){
		mainClass = myClass;//TODO resizing window reset myFrame
		thePicture = new Picture(mainClass.selectionMenu.theImage.getPath());
		thePicture.grayscale();

		pixels = pictureToArray();

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
	
	void drawPath() {
		Pixel[][] array = thePicture.getPixels2D();
		
		for(int x = 0; x < array.length; x++) {
			for(int y = 0; y < array[0].length; y++) {
				if(pixels[x][y] == 2 || pixels[x][y] == 3 || pixels[x][y] == 4)
					array[x][y].setRed(255);
			}
		}
	}

}
