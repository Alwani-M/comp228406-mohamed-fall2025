package exercise3;

import javax.swing.JOptionPane;

public class OverloadApp {
    public static void main(String[] args) {
        int square = OverloadDemo.area(5);
        int rectangle = OverloadDemo.area(4, 6);
        double circle = OverloadDemo.area(3.0);

        String result = "Area of square (5x5): " + square
                + "\nArea of rectangle (4x6): " + rectangle
                + "\nArea of circle (r=3): " + String.format("%.2f", circle);

        JOptionPane.showMessageDialog(null, result);
    }
}
