import java.util.Scanner;
import java.util.Random;

public class patri {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("i have generated a number between 1 and 100");

        while (guess != number) {
            System.out.println("guess the number");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("too high");
            } else if (guess < number) {
                System.out.println("too low");
            } else {
                System.out.println("correct you guessed the number");
                System.out.println("Attempts:" +attempts);
                
                
            }
        }
        sc.close();
            }
}