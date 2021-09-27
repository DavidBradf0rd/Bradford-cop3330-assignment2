package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.*;
import java.lang.*;



public class FilterValues {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String number = input.nextLine();
        String[] space = number.split(" ");
        Integer[] filteredList = filterValues(space);
        System.out.print("The even numbers are ");
        for (int i=0; i<filteredList.length;i++){
            if(i<filteredList.length-1){
                System.out.print(filteredList[i]+" ");
            }else{
                System.out.print(filteredList[i]+".");
            }
        }


    }
    public static Integer[]filterValues(String[] list){
        ArrayList<Integer> evens = new ArrayList<>();
        for (String s : list) {
            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
      Integer[] intArray = new Integer[evens.size()];
        intArray= evens.toArray(intArray);
        return intArray;
    }
}
