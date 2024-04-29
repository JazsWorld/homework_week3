package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2_Leapyear
{
    int year;

    public static void main(String[] args) {
        //scanner method declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = scanner.nextInt();
        //static method calling
        leapyear(year);
        scanner.close();
    }

    public static void leapyear(int year)
    {
        // Logic for finding the leap year using ifelse statement
        if ((( year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }

}
