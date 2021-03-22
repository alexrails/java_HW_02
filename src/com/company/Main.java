package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //First sentence
        int yearOfBirthday = 1989;
        int monthOfBirthday = 8;
        int dayOfBirthday = 14;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;

        System.out.println("Sum of year, month and day my birthday is " + sum);
        //Second sentence
        boolean monthBigger = (monthOfBirthday > dayOfBirthday) ? true : false;

        System.out.println("Month of my birthday more than day: " + monthBigger);

        //Third sentence
        String myName = "Alex";
        char[] myArray = new char[myName.length()];
        for(int i = 0; i < myName.length(); i++){
            myArray[i] = myName.charAt(i);
        }
        System.out.print("Array with my name is ");
        for(char c : myArray){
            System.out.print(c);
        }

        System.out.println();
        //Fourth sentence
        double myAge = 31.0;
        double partYear = 7.0 / 12.0;
        myAge += partYear;
        System.out.println("I am " + myAge);

    }
}
