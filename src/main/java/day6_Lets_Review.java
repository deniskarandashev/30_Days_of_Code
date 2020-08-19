package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day6_Lets_Review {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    sc.nextLine();
    String myString = null;
    for(int n = 0; n < T; n++){
      myString = sc.nextLine();

      char[] myCharArray = myString.toCharArray();

      for(int i = 0; i < myCharArray.length; i++){
        if(i % 2 == 0) System.out.print(myCharArray[i]);
      }

      System.out.print(" ");

      for(int j = 0; j < myCharArray.length; j++){
        if(j % 2 != 0) System.out.print(myCharArray[j]);
      }
      System.out.println();
    }
  }
}
