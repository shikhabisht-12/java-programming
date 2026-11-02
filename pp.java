
import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {

    private double balance = 10000;

    // Check Balance
    void checkBalance() {
        System.out.println("Available Balance: Rs." + balance);
    }

    // Deposit Money
    void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be greater than zero!"
            );
        }

        balance += amount;

        System.out.println("Money deposited successfully!");
    }

    // Withdraw Money
    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Invalid withdrawal amount!"
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance -= amount;

        System.out.println("Withdrawal successful!");
    }
}

public class ATMException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        int choice = 0;

        System.out.println("===== WELCOME TO ATM =====");

        try {

            do {

                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");

                        double deposit = sc.nextDouble();

                        atm.deposit(deposit);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");

                        double withdraw = sc.nextDouble();

                        atm.withdraw(withdraw);
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 4);

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {

            System.out.println("Please enter numbers only!");

        } finally {

            sc.close();

            System.out.println("ATM session closed.");
        }
    }
}

