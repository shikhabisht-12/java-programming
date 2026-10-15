import java.util.Scanner;

public class project {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter balance");
        int balance = sc.nextInt();
        System.out.println("enter withdrawal  amount");
        int amount = sc.nextInt();
        System.out.println("enter pin");
        int pin = sc.nextInt();
        System.out.println("Account active (true/false)");
        boolean active = sc.nextBoolean();
        if(active == false){
            System.out.println("Account is inactive");
        }else if(pin!=1234){
            System.out.println ("invalid pin");

        }else if (amount<=0){
            System.out.println("invalid amount");
        }else if(amount>balance){
            System.out.println("insufficient balance");
        }else {
            System.out.println("withdrawal successful");
            int remainingBalance = balance - amount;
            System.out.println("Remaining balance:" + remainingBalance);
            sc.close();
            ;
        }
    }
}