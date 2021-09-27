package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        addNumbers();
    }

    public static void addNumbers() {
        {
            Scanner input = new Scanner(System.in);
            int number;
            int sum = 0;
            
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter a number: ");
                number = input.nextInt();
                sum += number;
            }

            System.out.println("The total is " + sum + ".");
        }


    }
}