public class FibonacciRecursion {
    public static int getFibonacci(int n) {
        // BASE CASES: Return 0 or 1 for the first two positions
        if (n == 0) return 0;
        if (n == 1) return 1;

        // RECURSIVE CASE: Sum of the two previous positions
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int index = 6;
        System.out.println("Fibonacci number at index " + index + " is: " + getFibonacci(index)); // Output: 8
    }
}
