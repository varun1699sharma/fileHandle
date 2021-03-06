package lecture3;

import java.io.*;   
import java.util.*; 

public class read {
  public static void main(String[] args) {
    try {
      File f = new File("a.txt");
      Scanner sn = new Scanner(f);
      while (sn.hasNextLine()) {
        String r = sn.nextLine();
        System.out.println(r);
      }
      sn.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

