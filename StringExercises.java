/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringexercises;

/**
 *
 * @author T440s
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class StringExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        System.out.println("--- STRINGS ---");

        System.out.println("\n1. Check if a string is a palindrome");
        String str1 = "racecar";
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        if (str1.equals(reversedStr1)) {
            System.out.println("'" + str1 + "' is a palindrome.");
        } else {
            System.out.println("'" + str1 + "' is not a palindrome.");
        }

        System.out.println("\n2. Count the number of vowels in a string");
        String str2 = "Hello World";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : str2.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("The number of vowels in '" + str2 + "' is: " + vowelCount);

        System.out.println("\n3. Find the frequency of characters in a string");
        String str3 = "programming";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str3.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character frequencies in '" + str3 + "': " + freqMap);

        System.out.println("\n4. Check if two strings are anagrams");
        String s1 = "listen";
        String s2 = "silent";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("'" + s1 + "' and '" + s2 + "' are anagrams.");
        } else {
            System.out.println("'" + s1 + "' and '" + s2 + "' are not anagrams.");
        }

        System.out.println("\n5. Find the longest word in a sentence");
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in the sentence is: '" + longestWord + "'");
    }
}
    

