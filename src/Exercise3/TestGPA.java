package Exercise3;

import java.util.Scanner;

/**
 * Exercise2.TestGPA - Class to test class GPA to compute GPA of a student
 * using standard points of A=4, B=3, C=2, D=1, and F=0
 * ISTE-120 Lab 09 Exercise 2
 * @author  D. Patric (adapted from R. Niemi)
 * @version 2205
 */

public class TestGPA {
   public static void main (String[] args) {
      int numCourses;   //number of courses - can be changed
      int credits;      //number of credits for a course
      String grade;     //grade for course
      
      // create scanner
      Scanner in = new Scanner(System.in);
      
      // read in number of courses
      System.out.print("Enter number of courses: ");
      numCourses = in.nextInt();
      
      // create GPA object to hold specified number of courses
      GPA myGPA = new GPA();
            
      // read in all courses and add course information to GPA object
      for (int k=0; k < numCourses; k++) {
         System.out.print("Enter credits for course " + (k+1) + ": ");
         credits = in.nextInt();
         System.out.print("Enter grade for course " + (k+1) + ": ");
         grade = in.next();
         
         myGPA.addCourse(credits, grade);
      }
      
      // print results
      System.out.println();
      System.out.printf("GPA is %4.2f%n", myGPA.calcGPA( ));

   } //end main
}