import java. util.Scanner;

public class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name");
        String name = sc.nextLine();

        System.out.println("enter initialize balance");
        double balance = sc.nextDouble();
           
        System.out.println("enter deposit amount");
        double deposit = sc.nextDouble();
        balance = balance + deposit;

        System.out.println("enter withdwawal amount ");
        double withdraw = sc.nextDouble();

        System.out.println("enter age");
        int age = sc.nextInt();

        if (withdraw <= balance) {
            System.out.println("withdrawal successful");
            balance = balance - withdraw;
        } else {
            System.out.println("insufficient balance");
        }
        if (age >= 18) {
            System.out.println("account opening allowed ");
        } else if (age<18) {
            System.out.println("account opening  not allowed");
        }
        System.out.println("Account holder:" + name);
        System.out.println("Final balance:" + balance);
        System.out.println("account status: active");

        System.out.println(" 1 deposit");
        System.out.println(" 2 withdraw");
        System.out.println(" 3 check balance");
        System.out.println(" 4 exit");

        System.out.println("choice one of these");
        int choice = sc.nextInt();
    
        if (choice == 1) {
            System.out.println("enter deposit amount");
            double depositAmount = sc.nextInt();

            balance = balance + depositAmount;
            System.out.println("Amount deposit successfully");
            System.out.println("updated balance:" + balance);
        }
        else if (choice == 2) {
            System.out.println("enter withdrawal amount");
            double withdrawAmount = sc.nextDouble();

            if (withdrawAmount <= balance) {
                balance = balance - withdrawAmount;
                System.out.println("withdraw successful");
                System.out.println("remaining balance:" + balance);
            } else {
                System.out.println("insufficient balance");
            }
        }
        else if (choice == 3) {
            System.out.println("Current balance:" + balance);
        }
        else if (choice == 4) {
            System.out.println("thankyou for suing our bank account");
        }
        else {
            System.out.println("invalid choice");
        }
        sc.close();

    }

}