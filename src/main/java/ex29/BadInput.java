package ex29;


import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

public class BadInput {
    public static void main(String[] args) {
        badInput();
    }

    public static void badInput() {
        Scanner input = new Scanner(System.in);
        int years, rate;
        boolean bError = false;


        do {
            try {
                System.out.print("What is the rate of return? ");
                rate = Integer.parseInt(input.next());
                years = 72 / rate;
                System.out.println("It will take " + years + " years to double your initial investment.");
                bError = true;

            } catch (NumberFormatException | ArithmeticException e) {
                System.out.print("Sorry. That's not a valid input\n");
            }


        } while (!bError);


    }
}

