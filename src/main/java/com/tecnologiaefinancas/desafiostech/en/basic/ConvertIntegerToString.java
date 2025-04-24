package com.tecnologiaefinancas.desafiostech.en.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertIntegerToString {

    /*
    You are given an integer , you have to convert it into a string.

    Please complete the partially completed code in the editor.
    If your code successfully converts  into a string  the code will print "Good job".
    Otherwise it will print "Wrong answer".

    Integer can range between -100 to 100 inclusive.

    Sample Input =
    100
    Sample Output =
    Good job
    */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number between -100 and 100:");

        try {
            int n = scanner.nextInt();

            //Convert the integer to a string
            String s = Integer.toString(n);

        //Check if the conversion was sucessful
        if (s.equals(Integer.toString(n)) && -100 <= n && n <= 100){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        }  catch (InputMismatchException error) {
            System.out.println("Please insert only numbers between -100 and 100. Try again");


        }
        scanner.close();
    }
}
