package homework_week3;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12_NumberOrAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        char input = scanner.next().charAt(0);

        if (Character.isLetter(input)) {
            System.out.println("Input is an alphabet.");
        } else if (Character.isDigit(input)) {
            System.out.println("Input is a number.");
        } else {
            System.out.println("Input is a symbol.");
        }

        scanner.close();
    }
}
