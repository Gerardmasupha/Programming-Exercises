/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicexercises;

/**
 *
 * @author T440s
 */
import java.util.Scanner;
public class BasicExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- BASICS OF JAVA & SYNTAX ---");

        System.out.println("\n1. Hello, World!");
        System.out.println("Hello, World!");

        System.out.println("\n2. Swap two numbers without using a temporary variable");
        int num1 = 10, num2 = 20;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n3. Convert Celsius to Fahrenheit");
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        System.out.println("\n4. Find the largest of three numbers");
        int a = 10, b = 50, c = 30;
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("The largest of " + a + ", " + b + ", " + c + " is " + largest);

        System.out.println("\n5. Print ASCII value of a character");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);
            int asciiValue = ch;
            System.out.println("The ASCII value of '" + ch + "' is " + asciiValue);
        }
    }
}

    
    
