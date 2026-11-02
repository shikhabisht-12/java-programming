
public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("===== EXCEPTION HANDLING =====");

        // 1. Arithmetic Exception
        System.out.println("\n1. Arithmetic Exception");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        // 2. Array Index Exception
        System.out.println("\n2. Array Index Exception");

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid!");
        }

        // 3. Number Format Exception
        System.out.println("\n3. Number Format Exception");

        try {
            String value = "Hello";

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }

        // 4. Multiple Catch Blocks
        System.out.println("\n4. Multiple Catch");

        try {
            int[] arr = {10, 20, 30};

            int result = arr[1] / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error!");

        } catch (Exception e) {
            System.out.println("Some other error!");
        }

        // 5. Finally Block
        System.out.println("\n5. Finally Block");

        try {
            int x = 10 / 2;
            System.out.println("Result: " + x);

        } catch (Exception e) {
            System.out.println("Error occurred!");

        } finally {
            System.out.println("Finally block always executes.");
        }

        // 6. Throw Keyword
        System.out.println("\n6. Throw Keyword");

        try {
            int age = 15;

            if (age < 18) {
                throw new ArithmeticException(
                    "Not eligible to vote"
                );
            }

            System.out.println("Eligible to vote");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 7. Throws Keyword
        System.out.println("\n7. Throws Keyword");

        try {
            checkAge(16);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 8. Custom Exception
        System.out.println("\n8. Custom Exception");

        try {
            checkBalance(500);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }

    // Method using throws
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above!");
        }

        System.out.println("Age is valid.");
    }

    // Custom exception method
    static void checkBalance(double balance)
            throws InsufficientBalanceException {

        if (balance < 1000) {
            throw new InsufficientBalanceException(
                "Minimum balance is not maintained!"
            );
        }

        System.out.println("Balance is sufficient.");
    }
}

// Custom Exception Class
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

