import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age ");
        int age = sc.nextInt();
        System.out.println("enter days");
        int days = sc.nextInt();
        System.out.println("choose room type ");
        int roomType = sc.nextInt();
        System.out.println("enter boolean member");
        boolean member = sc.nextBoolean();
        //age checking
        if (age < 18) {
            System.out.println("booking not allowed");
          } else {
            System.out.println("booking allowed");
        }
        //room type
        int roomPrice = 0;
        if (roomType == 1) {
            System.out.println("Standard");
            roomPrice = 1500;
        } else if (roomType == 2) {
            System.out.println("deluxe");
            roomPrice = 2500;
        } else if (roomType == 3) {
            System.out.println("premium");
            roomPrice = 4000;
        } else {
            System.out.println("invalid room type");
        }
        int total = roomPrice * days;
        System.out.println("total amount:₹" + total);
        //discount part
        double  memberDiscount = 0;
        if (member == true) {
            memberDiscount = total * 10 / 100.0;
            System.out.println("memberDiscount:₹" +memberDiscount);
        } else {
            System.out.println("no discount");
        }
        double daysDiscount = 0;
        if (days >= 7) {
            System.out.println("10% discount");
            daysDiscount = total * 10 / 100.0; 
        } else if (days >= 3) {
            System.out.println("5% discount");
            daysDiscount = total * 5 / 100.0;
        } else {
            System.out.println("no additional discount");
        }
        double totalDiscount = memberDiscount + daysDiscount;
        double finalAmount = total - totalDiscount;
        System.out.println(" total Discount:₹"+totalDiscount);
        System.out.println("finalAmount:₹"+ finalAmount);
        
        sc.close();
        

    }
}
