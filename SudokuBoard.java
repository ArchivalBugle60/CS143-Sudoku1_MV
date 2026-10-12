import java.util.*;
import java.io.*;

public class SudokuBoard {
   char[][] contents = new char[9][9];
   
   public SudokuBoard(String parameter) throws FileNotFoundException {
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
      return "";
   }
}
