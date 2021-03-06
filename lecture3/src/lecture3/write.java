package lecture3;

import java.io.*;   

public class write {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("a.txt");
      fw.write("My name is Varun Sharma. ");
      System.out.println("Done.");
      fw.close();
    } catch (IOException e) {
      System.out.println("There is an error.");
      e.printStackTrace();
    }
  }
}

