package EX3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGradePoint {

    private static int loop;

    public static void main(String[] args) {
        GradePoint point = new GradePoint();
        int increment = 0;
        String input;
        int creds = 0;
        char grade;

        Pattern p = Pattern.compile("[ABCDFabcdf]{1}");

        try{
            do{checker(point);}while(loop==0);

            do{
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter Grade (one character): ");
                input = scan.nextLine();
                scan.reset();
                Matcher m = p.matcher(input);
                if(m.find()){
                    try{
                        increment++;
                        grade = m.group(0).charAt(0);
                        do{
                        System.out.print("Enter Credits: ");
                            creds = scan.nextInt();
                            if(creds>0&&creds<9){
                                scan.reset();
                                point.addToTotals(grade,creds);
                            }else{
                            creds = 0;
                            System.out.println("Invalid credits - must be between 0 and 9, inclusively");}
                        }while(creds==0);


                    }catch(NullPointerException e)
                    {
                        System.out.println("Invalid Input");

                    }
                    }else{
                    System.out.println(" Invalid Grade - must enter A,B,C,D,F (upper or lower case)");
                }
            }while(increment!=loop);
        System.out.printf("%.2f GPA: ", point.calcGPA());
    }
        catch(InputMismatchException e){
        System.out.println("Invalid Input");
    }

    }

    public static void checker(GradePoint grade) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        if(scan.hasNextInt()){
            int input = scan.nextInt();
           if(grade.numberOfCourses(input)){
               loop = input;
           }else{
               System.out.println("Invalid number of courses - must be greater than 0");
           }
        }else{loop= 0;}
    }
}
