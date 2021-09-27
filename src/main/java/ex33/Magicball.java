package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */


import java.util.*;


public class Magicball {


    public int randomNumber(){
        Random rand = new Random();
        return rand.nextInt(4);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> resp = new ArrayList<> (Arrays.asList("Yes", "No", "Maybe", "Ask again later."));
        Magicball roll = new Magicball();
        int randresp = roll.randomNumber();

        System.out.print("What's your question?\n> ");
        input.next();
        System.out.println(resp.get(randresp));

    }
}


