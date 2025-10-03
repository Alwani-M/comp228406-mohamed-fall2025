package exercise3;

public class OverloadDemo {
    // method 1: area of a square
    public static int area(int side) {
        return side * side;
    }

    // method 2: area of a rectangle
    public static int area(int length, int width) {
        return length * width;
    }

    // method 3: area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
