package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day10_Binary_Numbers {

  public static int tempI = 1;

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String temp = Integer.toString(n, 2);
    String[] tempArr = temp.split("0");
    for (int i = 0; i < tempArr.length; i++) {
      if (tempI < tempArr[i].length()) {
        tempI = tempArr[i].length();
      }
    }

    System.out.println(tempI);

    scanner.close();
  }
}
