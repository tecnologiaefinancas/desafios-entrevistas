package com.tecnologiaefinancas.desafiostech.en.basic.oneclasschallenges;

import java.util.Scanner;

public class MultiplicationTable {

    /*
    Objective
    In this challenge, we're going to use loops to help us do some simple math.

    Task
    Given an integer, N, print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

            Input Format

    A single integer, N.

    Constraints

    Output Format

    Print  lines of output; each line  (where ) contains the  of  in the form:
    N x i = result.

        Sample Input

        2
            Sample Output

        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        2 x 4 = 8
        2 x 5 = 10
        2 x 6 = 12
        2 x 7 = 14
        2 x 8 = 16
        2 x 9 = 18
        2 x 10 = 20

    https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    scanner.close();
    }
}
