package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */


import java.util.*;

public class EmpList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> employee = new ArrayList<>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printList(employee);

        System.out.print("\nEnter an employee name to remove: ");
        String nameRemoved= input.nextLine();
        employee.remove(nameRemoved);
        printList(employee);
    }
    public static void printList(ArrayList<String>employee){
        System.out.print("\nThere are "+employee.size()+" employees:\n");
        for(String emp:employee){
            System.out.println(emp);
        }
    }
}

