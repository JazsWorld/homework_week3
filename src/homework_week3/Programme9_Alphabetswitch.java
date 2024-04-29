package homework_week3;
/**Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 *
 */

import java.util.Scanner;

public class Programme9_Alphabetswitch
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alpha = scanner.next().charAt(0);

        // Print corresponding city name or "Invalid Entry"
        switch(alpha)
        {
            case 'A':
                System.out.println("City name: Ahmedabad");
                break;
            case 'B':
                System.out.println("City name: Baroda");
                break;
            case 'C':
                System.out.println("City name: Chennai");
                break;
            case 'D':
                System.out.println("City name: Delhi");
                break;
            case 'E':
                System.out.println("City name: Mumbai");
                break;
            case 'F':
                System.out.println("City name: Kolkata");
                break;
            default:
                System.out.println("Invalid Entry");
        }

        scanner.close();
    }

}
