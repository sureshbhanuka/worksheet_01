package org.example;
import java.util.Scanner;

public class CentimetersToFeetInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in centimeters:");
        double cm = scanner.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) inches / 12;
        inches = inches % 12;

        System.out.println("The length is: " + feet + " feet " + inches + " inches");
    }
}
