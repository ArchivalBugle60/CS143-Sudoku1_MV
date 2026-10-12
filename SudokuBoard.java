import java.util.*;
import java.io.*;

public class SudokuBoard {
   protected char[][] contents;
   
   public SudokuBoard(String parameter) throws FileNotFoundException {
      contents = new char[9][9];
      File fileName = new File(parameter);
      Scanner scanFile = new Scanner(fileName);
      
      for (int i = 0; i < 9; i++) {
         String next = "";
         next = scanFile.nextLine();
         
         for (int j = 0; j < 9; j++) { 
            contents[i][j] = next.charAt(j);
         }
      }
      scanFile.close();
   }
   
   public String toString() {
      String finalString = "";
      for (int i= 0; i < contents.length; i++) {
         for (int j = 0; j < contents[i].length; j++) {
            finalString = finalString + contents[i][j];
      }
      finalString = finalString + "\n";
      }
      
      
      return finalString;
   }

}
