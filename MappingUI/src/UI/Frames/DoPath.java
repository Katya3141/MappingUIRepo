package UI.Frames;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPanel;

import UI.Main.MainClass;
import UI.Util.Picture;
import UI.Util.Pixel;

public class DoPath extends JPanel{

	MainClass mainClass;
	Picture thePicture;
	int[][] pixels;
	FileWriter fw;
	BufferedWriter bw;

	public DoPath(MainClass myClass){
		mainClass = myClass;//TODO resizing window reset myFrame
		try {
			fw = new FileWriter("mapData.txt");
			bw = new BufferedWriter(fw);
			bw.write("TEST");
		} catch (IOException e){e.printStackTrace();}
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
	}

	public void setupPicture(){
		thePicture = new Picture(mainClass.selectionMenu.theImage.getPath());
		thePicture.grayscale();
		pixels = pictureToArray();

		try{
			for(int[] iArr : pixels){
				for(int i : iArr){
					bw.write(String.valueOf(i));
				}
				//bw.write("\n");
			}
		
		}catch (IOException e){e.printStackTrace();}
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
