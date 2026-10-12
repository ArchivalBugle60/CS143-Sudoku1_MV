import java.util.*;
import java.io.*;

public class SudokuMain{
   public static void main(String[] args) throws FileNotFoundException{
      SudokuBoard sudBo = new SudokuBoard("data1.sdk");
      System.out.println(sudBo);
   }
}

/*
# PROGRAM OUTPUT

Paste the output from JGrasp here.
Altering output will earn you an automatic zero for the assignment.

 2..1.5..3
 .54...71.
 .1.2.3.8.
 6.28.73.4
 .........
 1.53.98.6
 .2.7.1.6.
 .81...24.
 7..4.2..1
 

*/
