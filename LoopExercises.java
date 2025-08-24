/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopexercises;

/**
 *
 * @author T440s
 */
import java.util.Scanner;
public class LoopExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("--- LOOPS ---");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\n1. Find the factorial of a number");
            System.out.print("Enter a number for factorial: ");
            int numFact = scanner.nextInt();
            long factorial = 1;
            for (int i = 1; i <= numFact; ++i) {
                factorial *= i;
            }
            System.out.println("Factorial of " + numFact + " is " + factorial);

            System.out.println("\n2. Generate the Fibonacci series up to n terms");
            System.out.print("Enter number of terms for Fibonacci: ");
            int nTerms = scanner.nextInt();
            int firstTerm = 0, secondTerm = 1;
            System.out.print("Fibonacci Series up to " + nTerms + " terms: ");
            for (int i = 1; i <= nTerms; ++i) {
                System.out.print(firstTerm + " ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();

            System.out.println("\n3. Reverse a given number using a loop");
            System.out.print("Enter a number to reverse: ");
            int numRev = scanner.nextInt();
            int reversedNum = 0;
            while (numRev != 0) {
                int digit = numRev % 10;
                reversedNum = reversedNum * 10 + digit;
                numRev /= 10;
            }
            System.out.println("Reversed number: " + reversedNum);

            System.out.println("\n4. Find the sum of digits of a number");
            System.out.print("Enter a number to find the sum of its digits: ");
            int numSum = scanner.nextInt();
            int sumDigits = 0;
            int tempNum = numSum;
            while (tempNum != 0) {
                int digit = tempNum % 10;
                sumDigits += digit;
                tempNum /= 10;
            }
            System.out.println("The sum of digits of " + numSum + " is " + sumDigits);

            System.out.println("\n5. Prime numbers between 1 and 100:");
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}

    
