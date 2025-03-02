package Q_12;

import javax.swing.*;

public class MyFirstframe {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("My First Frame");

        // Set the size of the frame (width = 300, height = 200)
        frame.setSize(300, 200);

        // Set the location of the frame (x = 100, y = 50)
        frame.setLocation(100, 50);

        // Ensure the program exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
