package ex27;

import java.util.Scanner;
import java.util.regex.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */
public class ValidatingInputs
{ static String result ="";
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the first name: " );
        String fn = input.nextLine();
        System.out.print( "Enter the last name: " );
        String ln = input.nextLine();
        System.out.print( "Enter the ZIP code: " );
        String zip = input.nextLine();
        System.out.print( "Enter the employee ID: " );
        String id = input.nextLine();

        validateInput(fn,ln,id,zip);

    }
    public static void validateInput(String fn,String ln,String zip, String id){
        boolean fname = validateFName(fn);
        boolean lname = validateLName(ln);
        boolean zipc = validateZip(zip);
        boolean emID = validateEmpID(id);
        if (fname || lname || zipc || emID){
            result = "There were no errors found.";
        }
        System.out.println(result);
    }
    public static boolean validateFName(String fn){
        boolean condition = true;
        if (fn.length()<2){
            result = result + "The first name must be at least 2 characters long.";
            condition = false;
        }
        if(fn.length()<1){
            result = result + "\nThe first name must be filled in.";
        }
        return condition;
    }
    public static boolean validateLName(String ln){
        boolean condition = true;
        if (ln.length()<2){
            result = result + "\nThe last name must be at least 2 characters long.";
            condition = false;
        }
        if(ln.length()<1) {
            result = result + "\nThe last name must be filled in.";
        }
        return condition;
    }

    public static boolean validateZip(String zip){
        boolean condition = true;
        try {
           Integer.parseInt(zip);
            if (zip.length() != 5) {
                result = result + "\nThe zip code must be a 5 digit number.";
                condition = false;
            }
        } catch (Exception e){
            result = result + "\nThe zip code must be a 5 digit number.";
            condition = false;
        }
            return condition;
    }

    public static boolean validateEmpID(String id){
        String sequence = "[a-zA-Z]{2}[-][0-9]{4}";
        if (!Pattern.matches(sequence, id)){
        result = result + "\nThe employee ID must be in the format of AA-1234.";
        return false;
        }

        return true;
    }


}