public class s {
    public static void main(String[] args){
    int amount = 4500;
    if(amount>=5000) {
        System.out.println("20% Discount");
    }    
    else if (amount>=3000){
        System.out.println("15% Discount");
    }    
    else if (amount>=2000){
        System.out.println("10% Discount");
    } 
    else if (amount >= 1000) {
        System.out.println("5% Discount");
    } 
    else {
        System.out.println("No Discount");
    }
    }
}
