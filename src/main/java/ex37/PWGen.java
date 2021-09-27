package ex37;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.*;
import java.lang.*;


public class PWGen {

   public static String allLetters = "aAbBCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
   public static String allSpecial = "^@-=$!#%&?*+";
   public static String allNums = "0123456789";


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(input.nextLine());
        System.out.print("How many special characters? ");
        int specialChar = Integer.parseInt(input.nextLine());
        System.out.print("How many numbers? ");
        int num = Integer.parseInt(input.nextLine());
        System.out.print("Your password is "+getsPW(length, specialChar, num));
    }

    public static String getsPW(int length, int specialChar, int num){
        Random random = new Random();
        ArrayList<Character>characters=new ArrayList<>();
        StringBuilder password = new StringBuilder();
        for (int i = 1; i <= specialChar; i++) {
            characters.add(allSpecial.charAt(random.nextInt(allSpecial.length())));
        }
        for (int i=1; i<= num; i++){
            characters.add(allNums.charAt(random.nextInt(allNums.length())));
        }
        for (int i=characters.size()-1;i<length;i++){
            characters.add(allLetters.charAt(random.nextInt(allLetters.length())));
        }
        Collections.shuffle(characters);
        for(Character c: characters){
            password.append(c);
        }
        return password.toString();

    }



}
