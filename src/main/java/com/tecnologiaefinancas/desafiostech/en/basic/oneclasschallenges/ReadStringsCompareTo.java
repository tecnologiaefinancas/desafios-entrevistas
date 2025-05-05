package com.tecnologiaefinancas.desafiostech.en.basic.oneclasschallenges;

import java.util.Scanner;

public class ReadStringsCompareTo {

    /*
    Challenge: To read n lines of input until you reach end of file, then number and print all n lines of content.

    Hint: Java's Scanner.hasNext() method is helpful for this problem.

    Input Format: Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

    Output Format: For each line, print the line number, followed by a single space, and then the line content received as input.

    Sample Input

    Hello world
    I am a file
    Read me until end-of-file.

    -------------

    Sample Output

    1 Hello world
    2 I am a file
    3 Read me until end-of-file.

    https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
     */

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 1;
        System.out.print("Insert your text and then press enter to count lines");
        // Read input until EOF
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            // Print the line number followerd by the content
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        scanner.close();
    }
}
