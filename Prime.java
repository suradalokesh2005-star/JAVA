import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isPrime = true;

        // Prime numbers must be greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check for divisors from 2 up to the square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Found a divisor, not prime
                }
            }
        }

        if (isPrime) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}