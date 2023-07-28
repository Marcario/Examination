import question4.Box;

import java.util.IllegalFormatWidthException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {


        // Create a new instance of the Box class
        Box myBox = new Box(10.0);

        // Get the current width of the box
        double currentWidth = myBox.getWidth();
        System.out.println("Current width of the box: " + currentWidth);

        // Update the width to a new value
        double newWidth = 15.0;
        myBox.setWidth(newWidth);

        // Get the updated width
        double updatedWidth = myBox.getWidth();
        System.out.println("Updated width of the box: " + updatedWidth);
    }
    }

