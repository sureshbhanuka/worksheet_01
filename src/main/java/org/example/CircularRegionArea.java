package org.example;
import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor to set the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute the circumference of the circle
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegionArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for outer circle radius
        System.out.print("Enter the radius of the outer circle (ro): ");
        double outerRadius = scanner.nextDouble();

        // Input for inner circle radius
        System.out.print("Enter the radius of the inner circle (ri): ");
        double innerRadius = scanner.nextDouble();

        // Ensure that outer radius is greater than inner radius
        if (outerRadius > innerRadius) {
            Circle outerCircle = new Circle(outerRadius);
            Circle innerCircle = new Circle(innerRadius);

            // Compute areas and circumferences
            double outerArea = outerCircle.computeArea();
            double innerArea = innerCircle.computeArea();
            double outerCircumference = outerCircle.computeCircumference();
            double innerCircumference = innerCircle.computeCircumference();

            // Calculate the area of the circular region
            double regionArea = outerArea - innerArea;

            // Output the result
            System.out.println("The area of the circular region (shaded area) is: " + regionArea);
            System.out.println("Outer circle circumference: " + outerCircumference);
            System.out.println("Inner circle circumference: " + innerCircumference);
        } else {
            System.out.println("Error: Outer radius must be greater than inner radius.");
        }

        scanner.close();
    }
}



