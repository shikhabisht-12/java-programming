public class y {
    public static void main(String[]args){
        int n = 17;
        boolean prime = true;
        if (n<=1){
            prime = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("prime");
        }else{
           System.out.println("not prime ");
        }
    }
    
}
