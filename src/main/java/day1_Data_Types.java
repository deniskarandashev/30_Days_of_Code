package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 18.08.2020
 */
public class day1_Data_Types {
  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);
    /* Declare second integer, double, and String variables. */
    int i2;
    double d2;
    String s2;
    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
    i2 = scan.nextInt();
    d2 = scan.nextDouble();
    s2 = scan.next();
    s2 += scan.nextLine();


    /* Print the sum of both integer variables on a new line. */
    int s11 = i + i2;
    System.out.println(s11);

    /* Print the sum of the double variables on a new line. */
    double s22 = d + d2;
    System.out.println(s22);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
    String s33 = s + s2;
    System.out.println(s33);

  }
}
