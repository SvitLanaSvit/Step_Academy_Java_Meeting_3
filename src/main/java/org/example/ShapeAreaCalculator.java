package org.example;

public class ShapeAreaCalculator {
    public static int numberOfCalculations = 0;

    public int getNumberOfCalculations(){
        return numberOfCalculations;
    }

    public static double calculateTriangleArea(double base, double height){
        numberOfCalculations++;
        return 0.5 * base * height;
    }

    public static double calculateTriangleArea(double side1, double side2, double side3){
        numberOfCalculations++;
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double calculateRectangleArea(double length, double width) {
        numberOfCalculations++;
        return length * width;
    }

    public static double calculateSquareArea(double side) {
        numberOfCalculations++;
        return side * side;
    }

    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        numberOfCalculations++;
        return 0.5 * diagonal1 * diagonal2;
    }
}
