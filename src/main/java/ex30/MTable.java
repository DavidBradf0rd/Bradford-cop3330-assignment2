package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */




public class MTable {
    public static void main(String[] args) {

        for(int t=1; t<=12; t++){
            System.out.printf("%5d ", t);
        }
        System.out.println(" ");

        for (int r=2;r<=12; r++){
            System.out.printf("%5d ", r);
            for (int c=2;c<=12;c++){
                System.out.printf("%5d ", r*c);

            }
            System.out.println(" ");
        }



    }
}
