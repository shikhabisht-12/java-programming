public class Check {
    public static void main(String[] args) {
        
        int temperature = 35;

        if (temperature >= 40) {
            System.out.println("very hot");
        } 
        else if (temperature >= 30) {
            System.out.println("Hot");
        } 
        else if (temperature >= 20) {
            System.out.println("normal");
        } 
        else if (temperature >= 10) {
            System.out.println("cold");
        } 
        else {
            System.out.println("very cold");
        }
    }
}
