
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter English marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science marks: ");
        int science = sc.nextInt();

        int total = english + maths + science;

        double percentage = total / 3.0;

        System.out.println("\n----- Student Result -----");

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (english < 0 || english > 100 ||
            maths < 0 || maths > 100 ||
            science < 0 || science > 100) {

            System.out.println("Invalid Marks!");

        } else if (english < 33 || maths < 33 ||
                   science < 33) {

            System.out.println("Result: Fail");

        } else if (percentage >= 90) {
            System.out.println("Grade: A+");

        } else if (percentage >= 75) {
            System.out.println("Grade: A");

        } else if (percentage >= 60) {
            System.out.println("Grade: B");

        } else if (percentage >= 45) {
            System.out.println("Grade: C");

        } else {
            System.out.println("Grade: D");
        }

        sc.close();
    }
}

