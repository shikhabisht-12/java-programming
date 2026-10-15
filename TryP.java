import java.util.Scanner;
public class TryP{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    
    System.out.println("enter price");
    int price = sc.nextInt();

    System.out.println("enter quantity");
    int quantity = sc.nextInt();

    System.out.println("enter member");
    boolean member = sc.nextBoolean();

    System.out.println(" Enter payment method(1=cash,2=card,3=UPI)");
    int method = sc.nextInt();

    int  total = price * quantity;
        System.out.println("Total Amount:" + total);
      
    if (method == 1) {
        System.out.println("cash");
    } 
    else if (method == 2) {
        System.out.println("card +50processing charges");
    } 
    else if (method == 3) {
        System.out.println("UPI");
    } 
    else {
        System.out.println("invalid payment method");
    }
       double discount;
        
        if (total >= 5000) {
            discount = total * 20 / 100.0;
        } 
        else if (total >= 3000) {
            discount = total * 15 / 100.0;
        } 
        else if (total >= 1000) {
            discount = total * 10 / 100.0;
        } 
        else {
            discount = total * 5 / 100.0;
        }
        if (member == true) {
            discount = discount + (total * 5 / 100.0);
            System.out.println("additional 5% discount");
        }
        double finalAmount = total-discount;
        System.out.println("discount:" + discount);
        System.out.println("finalAmount:" + finalAmount);
        
        sc.close();
        
        }
   }

