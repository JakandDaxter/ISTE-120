package EX2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGradePoint {
    public static void main(String[] args) {
        GradePoint point = new GradePoint();
        String input;
        char grade;
        int loop = 0;

        Pattern p = Pattern.compile("[ABCDFabcdf]{1}");

        do{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Grade (one character): ");
            input = scan.nextLine();
            scan.reset();
            Matcher m = p.matcher(input);
            if(m.find()){
                try{
                    loop++;
                    grade = m.group(0).charAt(0);
                    //System.out.println("Points: "+grade);
                    System.out.print("Enter Credits: ");
                    int creds = scan.nextInt();
                    scan.reset();
                    point.addToTotals(grade,creds);
                    System.out.println(point.print());


                }catch(NullPointerException e)
                {
                    System.out.println("Invalid Input");

                }
                }else{
                System.out.println("Points: "+ -1);
            }
        }while(loop!=3);
        System.out.printf("%.2f GPA: ", point.calcGPA());
    }
}
