import java.util.Scanner;

public class NumberOperations {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method to reverse a number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Reverse Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to check prime: ");
                    int primeInput = scanner.nextInt();
                    if (isPrime(primeInput)) {
                        System.out.println(primeInput + " is a prime number.");
                    } else {
                        System.out.println(primeInput + " is not a prime number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter number to reverse: ");
                    int numToReverse = scanner.nextInt();
                    System.out.println("Reversed number: " + reverseNumber(numToReverse));
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}