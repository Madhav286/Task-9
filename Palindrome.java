package javabasics.OOPS;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
    
     // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Initialize variables to store reversed string and length of the input string
        String reversed = "";
        int length = input.length();
        
        // Iterate over each character of the input string in reverse order and append it to the reversed string
        for (int i = length - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        // Check if the input string is equal to its reversed version
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome");
        }
    }
}
