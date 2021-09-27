package ex39;



/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.*;
import java.lang.*;



public class SortRecords {



    public static void main(String[] args ) {
        List<Employee>empList = new ArrayList<>();

        empList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        empList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        empList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        empList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        empList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        empList.add(new Employee("Sally", "Weber", "Web Developer", "2015-12-18"));
        empList.sort(new LNOrder());


        System.out.println(getHeader());
        for (Employee emp: empList){

            System.out.format("%2s %2s    | %5s", emp.getFirstName(), emp.getLastName(), emp.getPosition());
        }





    }
    public static String getHeader() {
        return (String.format("%-25s| %-30s| %s\n" +
                        "-----------------------------------------------------------------------------\n",
                "Name", "Position", "Separation Date"));
    }

}
