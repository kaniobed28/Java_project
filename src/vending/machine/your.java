package vending.machine;
import java.io.*;

public class your {

 public static void main(String[] args) {
  
  //CSV = Comma-Separated Values 
  //   text file that uses a comma to separate values
  
  String file = "students.csv";
  BufferedReader reader = null;
  String line = "";
  
  try {
   reader = new BufferedReader(new FileReader(file));
   while((line = reader.readLine()) != null) {
    
    String[] row = line.split(",");
    //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
//use this if your values already contain commas
    for(String index : row) {
     System.out.printf("%-10s", index);
    }
    System.out.println();
   }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
  finally {
   try {
    reader.close();
   } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
  }
 }
}