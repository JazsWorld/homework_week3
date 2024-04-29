package homework_week3;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 */
public class Programme8_Alphabet
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F: ");
        char alpha = scanner.next().charAt(0);
        if (alpha == 'A') {
            System.out.println("City name: Ahmedabad");
        }
        else if (alpha == 'B')
        {
            System.out.println("City name: Bangalore");
        } else if (alpha == 'C')
        {
            System.out.println("City name: Chennai");
        } else if (alpha == 'D')
        {
            System.out.println("City name: Delhi");
        } else if (alpha == 'E')
        {
            System.out.println("City name: Mumbai");
        } else if (alpha == 'F')
        {
            System.out.println("City name: Kolkata");
        } else
        {
            System.out.println("Invalid Entry");
        }
        scanner.close();

    }


}
