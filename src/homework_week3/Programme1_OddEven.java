package homework_week3;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator ( ? :)
 */

import java.util.Scanner;

public class Programme1_OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        oddevenmethod(num);
        scanner.close();
    }

    public static void oddevenmethod(int num)
    {
        String evenOrOdd = (num % 2 == 0) ? "even number" : "odd number";
        System.out.println(num + " is an " + evenOrOdd);
    }

}
