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
		Pixel[][] arrayPix = thePicture.getPixels2D();
		int[][] intArray = new int[arrayPix.length][arrayPix[0].length];

		for(int pixArr = 0; pixArr < arrayPix.length; pixArr++){
			for(int pix = 0; pix < arrayPix[0].length; pix++){

				if(arrayPix[pixArr][pix].getRed() < 100)//TODO tune the greater than
					intArray[pixArr][pix] = 1;//TODO does it default to 0????
			}
		}


		return intArray;
	}

}
