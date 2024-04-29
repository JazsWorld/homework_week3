package homework_week3;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */


import java.util.Scanner;

public class Programme6_NoIsOddEven
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }

