package homework_week3;
/**WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 */


import java.util.Scanner;

public class Programme5_SalarySlip
{
    static int employeeid;
    String employeename;
    static double basic,hra,ta,grossSalary,da,pf;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int employeeid = scanner.nextInt();
        System.out.println("Enter employee name: ");
        String employeename = scanner.next();
        System.out.println("Enter Basic Salary of the Employee:");
        double basic = scanner.nextDouble();
        scanner.close();

            hra = 0.10 * basic;  // 10% of basic
            ta = basic * 0.09;
            da = basic * 0.08;   // 9% of basic
            pf = 0.20 * basic ; // 20&
            double grossSalary = basic + hra + ta + da - pf;


        System.out.println("------------------------------");
        System.out.println("|        Salary Slip          |");
        System.out.println("|-----------------------------|");
        System.out.println("Employee Id       :"  +employeeid+"    |");
        System.out.println("Employee Id       :"  +employeename+"  |");
        System.out.println("|-----------------------------|");
        System.out.println("Basic Salary      : " +basic       +"|");
        System.out.println("HRA 10%           : " + hra        +"|");
        System.out.println("TA  8%            : " + ta       +"|");
        System.out.println("DA  9%            : " + da         +"|");
        System.out.println("PF  20&           : " + pf         +"|");
        System.out.println("Gross Salary      : " + grossSalary +"|");
        System.out.println("|==============================|");


    }


}
