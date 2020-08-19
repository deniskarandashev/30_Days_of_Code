package main.java;

import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day4_Class_vs_Instance {
   class Person {

     private int age;

     public Person(int initialAge) {
       // Add some more code to run some checks on initialAge
       int age;
       if (initialAge >= 0) {
         this.age = initialAge;
       } else {
         this.age = 0;
         System.out.println("Age is not valid, setting age to 0.");
       }
     }

     public void amIOld() {
       // Write code determining if this person's age is old and print the correct statement:
       String text;
       if (this.age < 13)
         text = "You are young.";
       else if (this.age >= 13 && this.age < 18)
         text = "You are a teenager.";
       else
         text = "You are old.";
       System.out.println(text/*Insert correct print statement here*/);
     }

     public void yearPasses() {
       // Increment this person's age.
       this.age++;
     }

//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int T = sc.nextInt();
//       for (int i = 0; i < T; i++) {
//         int age = sc.nextInt();
//         Person p = new Person(age);
//         p.amIOld();
//         for (int j = 0; j < 3; j++) {
//           p.yearPasses();
//         }
//         p.amIOld();
//         System.out.println();
//       }
//       sc.close();
//     }
   }
}
