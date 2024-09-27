package org.example;
import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word:");
        String word = scanner.next();

        if (word.length() % 2 != 0) {
            int middleIndex = word.length() / 2;
            System.out.println("Middle character: " + word.charAt(middleIndex));
        } else {
            System.out.println("The word length is not odd.");
        }
    }
}
