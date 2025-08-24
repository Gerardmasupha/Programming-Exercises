/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayexercises;

/**
 *
 * @author T440s
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class ArrayExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        System.out.println("--- ARRAYS ---");

        int[] numbers = {10, 5, 20, 15, 25};

        System.out.println("\n1. Find the largest element in an array");
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest element is: " + max);

        System.out.println("\n2. Sort an array in ascending order");
        int[] arrToSort = {10, 5, 20, 15, 25};
        Arrays.sort(arrToSort);
        System.out.println("Sorted array: " + Arrays.toString(arrToSort));

        System.out.println("\n3. Search for an element in an array (linear search)");
        int target = 15;
        boolean found = false;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        System.out.println("\n4. Reverse an array");
        int[] originalArr = {10, 5, 20, 15, 25};
        int[] reversedArr = new int[originalArr.length];
        for (int i = 0; i < originalArr.length; i++) {
            reversedArr[i] = originalArr[originalArr.length - 1 - i];
        }
        System.out.println("Original array: " + Arrays.toString(originalArr));
        System.out.println("Reversed array: " + Arrays.toString(reversedArr));

        System.out.println("\n5. Find the second largest number in an array");
        int[] sortedArr = {10, 5, 20, 15, 25};
        Arrays.sort(sortedArr);
        int secondLargest = sortedArr[sortedArr.length - 2];
        System.out.println("The second largest number is: " + secondLargest);
    }
}
