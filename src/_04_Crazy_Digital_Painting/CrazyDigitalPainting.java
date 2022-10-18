package _04_Crazy_Digital_Painting;

import java.awt.Color;

public class CrazyDigitalPainting {
	static final int width = 400;
    static final int height =400;
	// 1. Create two final static integers for the width and height of the display.


    // 2. Create a 2D array of Color objects. You will need to import
    //    java.awt.Color. Initialize the size of the array using the 
    //    integers created in step 1.
Color hues[][];


    public CrazyDigitalPainting() {
        // 3. Open the crazy_digital_painting.png file and look at the image.

        // 4. Iterate through the 2D array and initialize each Color object
        //    to a new color. The sample image was created using the following 
        //    pattern:
        //    colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
hues = new Color[height][width];
for (int i = 0; i < hues.length; i++) {
	for (int j = 0; j < hues.length; j++) {
		hues[i][j] = new Color(i % 100, (i * j) % 100, j % 256);
	}
}
        // 5. Come up with your own pattern to make a cool crazy image.

        // 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
        //    to show off your picture.
ColorArrayDisplayer cad = new ColorArrayDisplayer();
cad.displayColorsAsImage(hues);
    }

    public static void main(String[] args) {
        new CrazyDigitalPainting();
    }
}
