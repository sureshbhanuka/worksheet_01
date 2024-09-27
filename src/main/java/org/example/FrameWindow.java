package org.example;
import javax.swing.JFrame;

public class FrameWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(300, 200);
        frame.setLocation(100, 50); // Left from screen: 100, Top: 50
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
