package lecture3;

import java.io.*;

class append
{
   public static void main( String[] args )
   {	
      try{
    	String s2 = "I am a CS student. ";
    	File f =new File("a.txt");
    	FileWriter fw = new FileWriter(f,true);
    	fw.write(s2);
    	fw.close();
	System.out.println("TEXT appended");
      }catch(IOException e){
         System.out.println("There is an error");
    	 e.printStackTrace();
       }
   }
}
