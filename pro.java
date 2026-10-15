import java.util.Scanner;
public class pro {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price");
        int price = sc.nextInt();
        System.out.println("enter quantity");
        int quantity = sc.nextInt();
        System.out.println("boolean member (true/false)");
        boolean member = sc.nextBoolean();
         int  total = price * quantity;
        System.out.println("Total Amount:" + total);
        if (member == true && member== false ){
            System.out.println("they are eligible for discount");
        }else if (total>=5000){
            System.out.println("20% discount");
        }else if (total>=3000){
            System.out.println("15% discount");
        }else if (total>=1000){
            System.out.println("10% discount");
        } else {
            System.out.println("5% discount");
        }
        sc.close();
        
    





    }
}
