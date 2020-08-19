package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 18.08.2020
 */
public class day2_Operators {

  // Complete the solve function below.
  static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip = (double) (meal_cost * tip_percent * 0.01);
    double tax = (double) (meal_cost * tax_percent * 0.01);
    double double_sum = meal_cost + tip + tax;
    int sum = 0;
    if (double_sum * 10 % 10 >= 5) {
      sum++;
    }
    sum += (int) double_sum;
    System.out.println(sum);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    double meal_cost = scanner.nextDouble();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int tip_percent = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int tax_percent = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    solve(meal_cost, tip_percent, tax_percent);

    scanner.close();
  }
}
