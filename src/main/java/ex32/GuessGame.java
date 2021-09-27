package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */


import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level;


        System.out.print("Let's play Guess the Number!\n" + "\n" + "Enter the difficulty level (1, 2, or 3): ");
        level = input.nextInt();
        if (level == 1) {
            LevelOne();
        } else if (level == 2) {
            LevelTwo();
        } else if (level == 3) {
            LevelThree();
        }
        while(true){
        System.out.print("Do you wish to play again (Y/N) ? ");
        String playAgain = input.next();
            if (playAgain.equalsIgnoreCase("y")){
                System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
                level = input.nextInt();
                if (level == 1) {
                    LevelOne();
                } else if (level == 2) {
                    LevelTwo();
                } else if (level == 3) {
                    LevelThree();
                }
            }else {
                return;
            }
        }
    }

    public static void LevelOne() {
        Scanner input = new Scanner(System.in);
        int total=0;
        int guess;
        int ranNumber= (int)(Math.random()*10+1);
        System.out.print("I have my number. What's your guess? ");
        do { guess = input.nextInt();
            total++;
            if (guess == ranNumber){
                System.out.print("You got it in "+total+" guesses.\n");
            }
            else if (guess < ranNumber)
                System.out.print("Too low. Guess again: ");

            else
                System.out.print("Too high. Guess again: ");


        } while (guess!= ranNumber);



    }

    public static void LevelTwo() {
        Scanner input = new Scanner(System.in);
        int total=0;
        int guess;
        int ranNumber= (int)(Math.random()*100+1);
        System.out.print("I have my number. What's your guess? ");
        do { guess = input.nextInt();
            total++;
            if (guess == ranNumber){
                System.out.print("You got it in "+total+" guesses.\n");
            }
            else if (guess < ranNumber)
                System.out.print("Too low. Guess again: ");

            else
                System.out.print("Too high. Guess again: ");

        } while (guess!= ranNumber);


    }
    public static void LevelThree() {
        Scanner input = new Scanner(System.in);
        int total=0;
        int guess;
        int ranNumber= (int)(Math.random()*1000+1);
        System.out.print("I have my number. What's your guess? ");
        do { guess = input.nextInt();
            total++;
            if (guess == ranNumber){
                System.out.print("You got it in "+total+" guesses.\n");
            }
            else if (guess < ranNumber)
                System.out.print("Too low. Guess again: ");

            else
                System.out.print("Too high. Guess again: ");

        } while (guess!= ranNumber);
    }
}






