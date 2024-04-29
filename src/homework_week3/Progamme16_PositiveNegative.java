package homework_week3;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

public class Progamme16_PositiveNegative
{

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int n = in.nextInt();

            if (n > 0)
            {
                System.out.println("Number is positive");
            }
            else if (n < 0)
            {
                System.out.println("Number is negative");
            }
            else
            {
                System.out.println("Number is zero");
            }
        }
    }

