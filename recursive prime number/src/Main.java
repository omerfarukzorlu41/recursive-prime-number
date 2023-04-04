import java.util.Scanner;

public class Main {
    static boolean isPrime(int num, int diviser) {
        if (num < 2) {
            return false;
        }
        if (diviser == 1) {
            return true;
        }

        if (num % diviser == 0) {
            return false;
        }
        return isPrime(num, diviser - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean primeNumber;

        System.out.print("Please enter a number: ");
        number = scanner.nextInt();
        primeNumber = isPrime(number, number / 2);
        if (primeNumber == true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}
