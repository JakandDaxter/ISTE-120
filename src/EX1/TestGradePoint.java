package EX1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGradePoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int grade = 0;
        Pattern p = Pattern.compile("[ABCDFabcdf]{1}");
        do{
            System.out.print("Enter Grade (one character): ");
            input = scan.nextLine();
            Matcher m = p.matcher(input);
            if(m.find()){
                try{
                    grade = GradePoint.parse(m.group(0).charAt(0));
                    System.out.println("Points: "+grade);

                }catch(NullPointerException e)
                {
                    System.out.println("Invalid Input");
                }
                }else{
                System.out.println("Points: "+ -1);
            }
        }while(grade!=-2);
    }
}
