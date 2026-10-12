import java.util.*;
import java.io.*;

public class SudokuMain{
   public static void main(String[] args) throws FileNotFoundException{
      SudokuBoard sudBo = new SudokuBoard("data1.sdk");
      System.out.println(sudBo);
   }
}