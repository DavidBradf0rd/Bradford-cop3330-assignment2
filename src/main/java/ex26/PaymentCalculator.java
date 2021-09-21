package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;

public class PaymentCalculator
{
    public static int calculateMonthsUntilPaidOff(double b, double apr, double p){
        apr=apr/365;
        return (int) Math.ceil(-(1/30.0)*Math.log(1+b/p*(1-Math.pow(1+apr,30)))/Math.log(1+apr));
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        double b, apr, p;
        int months;

        System.out.print("Enter the balance of your credit card: ");
        b = input.nextDouble();
        System.out.print("Enter the APR of your credit card as %: ");
        apr = input.nextDouble();
        apr = apr/100;
        System.out.print("Enter the monthly payment: ");
        p = input.nextDouble();

        months= calculateMonthsUntilPaidOff(b, apr, p);
        System.out.println("It will take you "+months+" months to pay off this card.");


    }
}
