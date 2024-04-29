package homework_week3;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Programme3_Marksheet {
    static String studentname, grade, result;

    static int marks, Englishmarks, Mathsmarks, Sciencemarks, rollno, total;

    static double percentage;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentname = scanner.nextLine();
        System.out.println("Enter student roll no.: ");
        int rollno = scanner.nextInt();
        System.out.println("Enter English marks: ");
        int Englishmarks = scanner.nextInt();
        System.out.println("Enter Maths marks:  ");
        int Mathsmarks = scanner.nextInt();
        System.out.println("Enter Science marks: ");
        int Sciencemarks = scanner.nextInt();
        scanner.close();

        total = Englishmarks + Mathsmarks + Sciencemarks;
        percentage = total / 300.0 * 100.0;
        grade = "";
        result = "";

        marksmethod();
        marksmethod1();
        System.out.println("-----------------------------------------                        ");
        System.out.println("|               MarkSheet                                       |");
        System.out.println("|________________________________________                       |");
        System.out.println("|   Name         :    " + studentname + "                       |");
        System.out.println("|   Roll No.     :    " + rollno + "                            |");
        System.out.println("|________________________________________                       |");
        System.out.println("|   Subject      :       Marks                                  |");
        System.out.println("|   Maths        :    " + Mathsmarks + "                        |");
        System.out.println("|   Science      :    " + Sciencemarks + "                      |");
        System.out.println("|   English      :    " + Englishmarks + "                      |");
        System.out.println("|________________________________________                       |");
        System.out.println("|   Total        :    " + total + "                             |");
        System.out.println("|________________________________________                       |");
        System.out.println("|   percentage   :    " + percentage + " " + "                  |");
        System.out.println("|   Result       :    " +result+ "                              |");
        System.out.println("|   Grade        :    " + grade + "                             |");
        System.out.println("|________________________________________                       |");

        scanner.close();
    }

    public static void marksmethod() {

        if (percentage >= 80)
            grade = "A+";

        else if (percentage >= 60)
            grade = "A";

        else if (percentage >= 50)
            grade = "B";

        else if (percentage >= 35)
            grade = "C";

        else
            grade = "Invalid input";
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);

    }

    public static void marksmethod1() {

        if (grade == "A+")
            result = "Pass";

        else if (grade == "A" )
            result = "Pass";

        else if (grade == "B")
            result = "Pass";

        else if (grade == "C")
            result = "Pass";
        else
            result = "Fail";

        System.out.println("Result = " +result);
    }
}