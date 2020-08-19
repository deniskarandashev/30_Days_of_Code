package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day5_Loops {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    if(N >= 2 && N <= 20){
      for(int i = 1; i <= 10; i++){
        int res = N * i;
        System.out.printf("%d x %d = %d\n", N, i, res);
      }
    }

    scanner.close();
  }
}
