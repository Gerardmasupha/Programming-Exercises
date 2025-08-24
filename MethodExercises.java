/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodexercises;

/**
 *
 * @author T440s
 */

public class MethodExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  System.out.println("--- METHODS ---");

        System.out.println("\n1. Check if a number is prime");
        System.out.println("Is 17 a prime number? " + isPrime(17));
        System.out.println("Is 18 a prime number? " + isPrime(18));

        System.out.println("\n2. Calculate factorial of a number");
        System.out.println("Factorial of 5 is: " + factorial(5));

        System.out.println("\n3. Calculate GCD of two numbers");
        System.out.println("GCD of 48 and 18 is: " + gcd(48, 18));

        System.out.println("\n4. Reverse a string");
        String originalStr = "Java Programming";
        System.out.println("Original: " + originalStr);
        System.out.println("Reversed: " + reverseString(originalStr));

        System.out.println("\n5. Check if a number is a palindrome");
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("Is 123 a palindrome? " + isPalindrome(123));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}

