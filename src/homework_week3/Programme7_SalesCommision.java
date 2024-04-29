package homework_week3;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */

import java.util.Scanner;

public class Programme7_SalesCommision
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sales ID: ");
        int salesId = scanner.nextInt();
        System.out.print("Seller's Name: ");
        String sellerName = scanner.next();
        System.out.print("Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate sales commission
        double commission = 0.0;
        if (salesAmount >= 50000)
        {
            commission = salesAmount * 0.35;
        }
        else if (salesAmount >= 30000)
        {
            commission = salesAmount * 0.20;
        }
        else if (salesAmount >= 20000)
        {
            commission = salesAmount * 0.10;
        }
        else if (salesAmount >= 10000)
        {
            commission = salesAmount * 0.05;
        } else
        {
            commission = salesAmount * 0.02;
        }

        // Print sales commission
        System.out.println("\n--------------------------------------");
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("--------------------------------------");
        System.out.println("Sales Commission: " + commission);
        System.out.println("--------------------------------------");

        // Calculate total salary
        double totalSalary = basicSalary + commission;
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("--------------------------------------");

    }
}

