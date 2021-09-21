package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.*;



public class Password
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pw = input.nextLine();
        passwordValidator(pw);

    }


    public static void passwordValidator(String pw){
        int l = pw.length();
        boolean letter= false, num=false, specialChar=false;


        for(char i:pw.toCharArray())
        {
            if (Character.isLetter(i))
                letter = true;
            if (Character.isDigit(i))
                num = true;
            if (String.valueOf(i).matches("[^a-zA-Z0-9]")) {
                specialChar = true;
            }
        }
        if (num && letter && specialChar && (l>=8))
            System.out.print("The password '"+pw+"' is a very strong password.");
        else if (letter  && num || (l>=8))
            System.out.print("The password '"+pw+"' is a strong password.");
        else if (letter)
            System.out.print("The password '"+pw+"' is a weak password.");
        else
            System.out.print("The password '"+pw+"' is a very weak password.");

    }






}