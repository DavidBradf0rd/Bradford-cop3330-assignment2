package ex36;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.*;
import java.util.stream.Collectors;

public class CompStats {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userIN;


        do {
            System.out.print("Enter a number: ");
            userIN = input.nextLine();

            if(!userIN.equalsIgnoreCase("done")){
                try{
                    double value = Integer.parseInt(userIN);
                    numbers.add(value);
                }catch (NumberFormatException ignored){
                }
            }
        } while(!userIN.equalsIgnoreCase("done"));

        System.out.print("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print("\nThe average is "+String.format("%.1f",average(numbers)));
        System.out.print("\nThe minimum is "+String.format("%.0f",min(numbers)));
        System.out.print("\nThe maximum is "+String.format("%.0f",max(numbers)));
        System.out.print("\nThe standard deviation is "+String.format("%.2f",std(numbers)));


    }
    public static double average(ArrayList<Double>numbers){
        int sum = 0;
        for (Double item: numbers){
            sum+= item;
        }
        return sum / numbers.size();
    }
    public static double max(List<Double>numbers){
        double max = numbers.get(0);
        for (double i: numbers){
            max = Math.max(max, i);
        }
        return max;
    }
    public static double min(List<Double>numbers) {
        double min = numbers.get(0);
        for (double i : numbers) {
            min = Math.min(min, i);
        }
        return min;
    }
    public static double std(List<Double>numbers) {
        double mean = average((ArrayList<Double>) numbers);
        double sum =0;
        for (double i : numbers) {
            sum = sum + Math.pow((i-mean),2);
        }
        return Math.sqrt(sum/numbers.size());
    }
}
