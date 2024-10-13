package org.example;
import java.util.Scanner;

public class worksheet2_02 {
    public static int countDigits(int number) {
        int digits = 0;


        if (number == 0) {
            return 1;
        }


        while (number != 0) {
            number /= 10;
            digits++;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter an integer (negative to quit):");
            int input = scanner.nextInt();


            if (input < 0) {
                System.out.println("Negative number entered. Exiting...");
                break;
            }

            int numDigits = countDigits(input);
            System.out.println("The number " + input + " has " + numDigits + " digits.");
        }
    }
}
