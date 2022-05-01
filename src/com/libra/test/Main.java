package com.libra.test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password;
        System.out.println("Hello, Please enter your password: ");
        password = read.nextInt();

        if (password != 8819){
            do {
                System.out.print("Wrong password, Please try again: ");
                password = read.nextInt();
            } while (password != 8819);
        }
        menu();
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void menu() {
        Scanner read = new Scanner(System.in);

        Animal dog = new Animal(); // Creating an object to call methods from "Class_1"

        System.out.println("____________________________________________________________________");
        System.out.println("""
                Welcome! Please choose your service from option below:
                1) Reverse a string
                2) Average Function
                3) Bark
                4) Beep
                5) List Creator"""); // Three double quotation marks allows us to create a text block.

        int entry = read.nextInt(); double no1 = 0; double no2 = 0;
        switch (entry) {
            case 1 -> string_Reverse();
            case 2 -> {             //this curly brace here lets us use second statement in "enhanced switch statement"
                System.out.println(avrg(no1,no2));
                menu();
            }
            case 3 -> dog.bark();
            case 4 -> {
                Toolkit.getDefaultToolkit().beep();
                menu();
            }
            case 5 -> arrlist();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void string_Reverse(){

        System.out.print("Please enter your text to reverse it.");
        System.out.println(" (enter \"EXIT\" to go main menu.)");
        // Here we use scanner to create a text receiver for console ( aka scanner :-p )
        Scanner juliet = new Scanner(System.in);
        String text = juliet.nextLine();    // we assign the scanner to a string variable to store it

        if(Objects.equals(text, "EXIT")){ // Objects.equals() makes sure EXIT texts runs condition not reversed through "arr" Char array
            menu();
        } else {

            char[] arr = text.toCharArray();    // then we create a character type array to be able to split characters from received text.

            System.out.print("The reversed string is:\n----------------------> "); // a bit of styling :)
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            System.out.println("\n");
            string_Reverse();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static double avrg(double x, double y){

        Scanner juliet = new Scanner(System.in);
        System.out.println("PLease enter two numbers to calculate the average.");

        x = juliet.nextDouble();y = juliet.nextDouble();

        System.out.print("\nThe average of numbers are: ");
        return (x+y)/2;

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void arrlist(){

        Scanner juliet = new Scanner(System.in);
        ArrayList<String> userArr = new ArrayList<>();
        
        String entry; //boolean end = false;

        System.out.println("\nPlease enter your items:");
        entry = juliet.nextLine();


        while(entry != null) {
            userArr.add(entry);
        }


        System.out.println("Your List:\n\n" + userArr);

    }
}


