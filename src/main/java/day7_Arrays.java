package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day7_Arrays {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    for (int i = arrItems.length - 1; i >= 0; i--) {
      System.out.print(arrItems[i] + " ");
    }

    scanner.close();
  }
}
