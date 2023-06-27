import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            boolean isPrime = checkPrime(number);

            if (isPrime) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
