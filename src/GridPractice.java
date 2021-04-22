import java.util.Scanner;
import java.util.Random;

/**
 * GridPractice - Class to work with 2D arrays
 * ISTE-120 Lab 10 Starter Code
 * @author  D. Patric (adapted from J. Leone/R. Niemi)
 * @version 2205
 */

public class GridPractice  {
   public static void main(String[] args)  {
      // declarations
      Scanner in = new Scanner(System.in);
      Random  generator = new Random();
      int [][] grid;	//un-instantiated grid
      int size = 0;	//number of rows and columns
   
     //get size of grid - no validation & instantiate
      System.out.print("Enter size of grid: ");
      size = in.nextInt();
      grid = new int[size][size];

      System.out.print("Random values assigned to " + size + " by " + size  +" grid");

      //fill grid with random number from 1..99
      //STEP 3(exercise 1):  print grid with formatting to align
      System.out.println();
      StringBuilder str;
      for (int row = 0; row < size; row++)  {
         str = new StringBuilder();
         for (int col = 0; col < size; col++)  {
            grid[row][col] = generator.nextInt(100); //random numbers 0.99 - not 100
            str.append(String.format("%3d " ,grid[row][col]));
            //System.out.printf ("%3d |" ,grid[row][col]);
         }
         System.out.println(str.toString());

      }

      System.out.println();

      //STEP 4A (exercise 2): print each row sum
      System.out.println("Row    Sum");
      System.out.println("-----------");
      for(int i = 0; i < size; i++){
         int sumrow = 0;
         for(int j = 0; j < size; j ++){
            sumrow = sumrow + grid[i][j];
         }
         System.out.println(i + "     " + sumrow);
      }

      System.out.println();

      //STEP 4B (exercise 2): print each column sum
      System.out.println("Col    Sum");
      System.out.println("-----------");
      for(int i = 0; i < size; i++){
         int sumcol = 0;
         for(int j = 0; j < size; j ++){
            sumcol = sumcol + grid[j][i];
         }
         System.out.println(i + "     " + sumcol);
      }

   
      //STEP 5 (exercise 3): print two diagonal sums
      int LR = 0;
      for(int i = 0; i <= size - 1; i++){
            LR = LR + grid[i][i];
      }
      System.out.println("Diagonal total form upper left to lower right is   " + LR);

      int RL = 0;
      int y = size - 1;
      for(int x = 0; x <= size - 1; x++){
            RL += grid[x][y--];

      }
      System.out.println("Diagonal total from upper right to lower left is    " + RL);
   }
}