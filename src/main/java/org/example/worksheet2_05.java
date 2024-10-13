package org.example;
import java.util.Scanner;
import java.util.StringTokenizer;

public class worksheet2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String cleanSentence = "";
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:\"'()-");


        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            cleanSentence += word.toLowerCase();
        }


        boolean isPalindrome = true;
        int length = cleanSentence.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanSentence.charAt(i) != cleanSentence.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }
}
