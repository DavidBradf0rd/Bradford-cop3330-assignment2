package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.*;

public class Anagram
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter two strings and I'll tell you if they are anagrams. ");
        System.out.print("Enter the first string: ");
        s1 = input.next();
        System.out.print("Enter the second string: ");
        s2 = input.next();
        if (isAnagram(s1, s2)) {
            System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are anagrams.");
        } else {
            System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are not anagrams.");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        if (s1.length() == s2.length()) {
            int arr1[] = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                arr1[(int) (s1.charAt(i) - 97)]++;
            }
            int arr2[] = new int[26];
            for (int i = 0; i < s2.length(); i++) {
                arr2[(int) (s2.charAt(i) - 97)]++;
            }
            for (int i = 0; i < 26; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
            return true;
        } else {
            return false;
        }
    }

}