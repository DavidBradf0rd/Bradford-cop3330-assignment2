package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.*;

public class Karvonen {
    public static void main( String[] args ) {

        getKarvonen();
    }

    private static void getKarvonen() {
        Scanner input = new Scanner(System.in);

        int age = 0, rate = 0;
        boolean bError=false;

        do {
            try {
                System.out.print("Enter age: ");
                age = Integer.parseInt(input.next());
                System.out.print("Enter resting heart rate: ");
                rate = Integer.parseInt(input.next());
                bError=true;
            } catch (NumberFormatException e){
                System.out.print("invalid entry, please only digits\n");
            }
        } while(!bError);

        System.out.printf("\nResting Pulse: %d      Age: %d\n", rate, age);
        System.out.println("\nIntensity    | Rate");
        System.out.println("-------------|--------");
        for (double i=55;i<=95;i+=5){
            double thrate = (((((220 - age) - rate) * i) / 100) + rate);
            System.out.printf("%.0f%%          | %.0f bpm\n",i,thrate);

        }
    }



}

