package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Denis Karandashev
 * @project 30_Days_of_Code
 * @date 19.08.2020
 */
public class day8_Dictionaries_and_Maps {
  public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> book = new HashMap<String, Integer>();
    if (n >= 1 && n <= Math.pow(10, 5)){
      for(int i = 0; i < n; i++){
        String name = in.next();
        int phone = in.nextInt();
        // Write code here
        book.put(name, phone);
      }
    }
    while(in.hasNext()){
      String s = in.next();
      // Write code here
      if (book.containsKey(s) == false){
        System.out.println("Not found");
      } else if (book.get(s) != null) {
        System.out.println(s + "=" + book.get(s));
        //book.remove(s);
      }
    }
    in.close();
  }
}
