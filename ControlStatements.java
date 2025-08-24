/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlstatements;

/**
 *
 * @author T440s
 */
import java.util.Scanner;
public class ControlStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- CONTROL STATEMENTS ---");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\n1. Check if a number is even or odd");
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }

            System.out.println("\n2. Find the largest of three numbers using if-else");
            int x = 100, y = 200, z = 150;
            if (x >= y && x >= z) {
                System.out.println(x + " is the largest number.");
            } else if (y >= x && y >= z) {
                System.out.println(y + " is the largest number.");
            } else {
                System.out.println(z + " is the largest number.");
            }

            System.out.println("\n3. Check if a year is a leap year");
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            System.out.println("\n4. Calculator program using switch-case");
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter two numbers: ");
            double numA = scanner.nextDouble();
            double numB = scanner.nextDouble();
            double result;

            switch (operator) {
                case '+' -> {
                    result = numA + numB;
                    System.out.println(numA + " + " + numB + " = " + result);
                }
                case '-' -> {
                    result = numA - numB;
                    System.out.println(numA + " - " + numB + " = " + result);
                }
                case '*' -> {
                    result = numA * numB;
                    System.out.println(numA + " * " + numB + " = " + result);
                }
                case '/' -> {
                    result = numA / numB;
                    System.out.println(numA + " / " + numB + " = " + result);
                }
                default -> System.out.println("Invalid operator!");
            }

            System.out.println("\n5. Check if a character is a vowel or consonant");
            System.out.print("Enter a character: ");
            char ch = Character.toLowerCase(scanner.next().charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }
    }
}

    
    

