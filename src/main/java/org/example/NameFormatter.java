package org.example;
import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name (first middle last):");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        String middleInitial = middleName.substring(0, 1);
        System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
    }
}
