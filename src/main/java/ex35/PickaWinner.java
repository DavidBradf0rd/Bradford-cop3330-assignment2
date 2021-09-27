package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.*;
import java.lang.*;

public class PickaWinner {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();

            ArrayList<String> contestants = new ArrayList<>();
            String name;

            do{
                System.out.print("Enter a name: ");
                name = input.nextLine();
                if(!name.isEmpty())
                    contestants.add(name);
            }while(!name.isEmpty());

            int ranWin = rand.nextInt(contestants.size());
            System.out.println("The winner is... "+contestants.get(ranWin));

        }
 }