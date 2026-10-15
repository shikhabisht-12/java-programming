public class B {
    public static void main(String[] args) {
        
        int balance=5000;
        int amount=3000;
        boolean cardValid = true;
        
        if (balance>=amount && cardValid==true){
            System.out.println("withdrawal successful");
        }    
        else if (amount>=balance){
            System.out.println("insufficient balance");
        }  
        else{
            System.out.println("card invalid");
        }
    }
}
