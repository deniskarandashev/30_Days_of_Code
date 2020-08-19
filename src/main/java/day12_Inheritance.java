package main.java;

import java.util.Scanner;
import main.java.day4_Class_vs_Instance.Person;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day12_Inheritance {

  class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
      System.out.println(
          "Name: " + lastName + ", " + firstName
              + "\nID: " + idNumber);
    }

  }

  class Student extends Person {

    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName,
        int id, int[] scores) {
      super(firstName, lastName, id);
      this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

    public char calculate() {
      int sum = 0;
      char res = 0;
      for (int i = 0; i < testScores.length; i++) {
        sum += testScores[i];
      }
      sum = sum / testScores.length;
      if (sum >= 40 && sum < 55)
        res = 'D';
      else if (sum >= 55 && sum < 70)
        res = 'P';
      else if (sum >= 70 && sum < 80)
        res = 'A';
      else if (sum >= 80 && sum < 90)
        res = 'E';
      else if (sum >= 90 && sum <= 100)
        res = 'O';
      else if (sum < 40)
        res = 'T';

      return res;
    }
  }

  class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String firstName = scan.next();
      String lastName = scan.next();
      int id = scan.nextInt();
      int numScores = scan.nextInt();
      int[] testScores = new int[numScores];
      for (int i = 0; i < numScores; i++) {
        testScores[i] = scan.nextInt();
      }
      scan.close();

      Student s = new Student(firstName, lastName, id, testScores);
      s.printPerson();
      System.out.println("Grade: " + s.calculate());
    }
  }
}