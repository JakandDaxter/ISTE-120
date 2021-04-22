package Exercise1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise2.TestGPA - Class to test class GPA to compute GPA of a student
 * using standard points of A=4, B=3, C=2, D=1, and F=0
 * ISTE-120 Lab 09 Exercise 2
 * @author  D. Patric (adapted from R. Niemi)
 * @version 2205
 */

public class TestGPA {

   final static int numCourses = 4;   //number of courses - can be changed

   public enum Grade {

      A(4, 'A', 'a'),
      B(3, 'B', 'b'),
      C(2, 'C', 'c'),
      D(1, 'D', 'd'),
      F(0, 'F', 'f');

      int code;
      char desc1;
      char desc2;

      Grade(int code, char desc1, char desc2) {
         this.code = code;
         this.desc1 = desc1;
         this.desc2 = desc2;
      }

      public static int calcPoints(char desc) {
         for (Grade m : Grade.values()) {
            if (m.desc1 == desc) {
               return m.code;
            }
            if (m.desc2 == desc) {
               return m.code;
            }
         }
         return -1;
      }

   }

   public static void main(String[] args) {
      int[] credits = new int[numCourses];      //number of credits for a course
      char[] grade = new char[numCourses];         //grade for course
      String input;
      int points = 0;       //sum of points
      int point;
      int sum = 0;
      Pattern p = Pattern.compile("[ABCDFabcdf]{1}"); // pattern for grade input

      // create scanner
      Scanner in = new Scanner(System.in);

      // read in all courses and course information
      for (int k = 0; k < numCourses; k++) {
         System.out.print("Enter credits for course " + (k + 1) + ": ");
         credits[k] = in.nextInt();
         System.out.print("Enter grade for course " + (k + 1) + ": ");
         input = in.next();

         Matcher m = p.matcher(input);
         if (m.find()) {
            grade[k] = m.group(0).charAt(0);
            point = Grade.calcPoints(m.group(0).charAt(0));
            points += point * credits[k];
            //myGPA.addCourse(credits, grade);
         } else {
            System.out.println(" Invalid Grade - must enter A,B,C,D,F (upper or lower case)");
         }

      }
      // print results
      for(int i = 0; i <= credits.length - 1;i++){
         sum += credits[i];
      }

      double gpa =((double) points/(double)sum);
      System.out.println("Total Number of Credits : " + sum);
      System.out.println("Total Number of Points : " + points);
      System.out.printf("GPA : %4.2f%n" , gpa);
   }
}