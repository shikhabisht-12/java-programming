import java.util.Scanner;
public class mini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter marks");
        int marks = sc.nextInt();

        System.out.println("enter attendance (true/false)");
        boolean attendance = sc.nextBoolean();
        
        if ( attendance == false) {
            System.out.println("Not eligible due to attendance");
        } else if (marks >= 90 && attendance == true) {
            System.out.println("Grade A - excellent");
        } else if (marks >= 75 && attendance == true) {
            System.out.println("Grade B - very good");
        } else if (marks >= 60 && attendance == true) {
            System.out.println("Grade C - good");
        }else if (marks>= 40 && attendance == true){
            System.out.println("Grade D - pass");
        } else {
            System.out.println("fail");
        }
        sc.close();
    }
}
