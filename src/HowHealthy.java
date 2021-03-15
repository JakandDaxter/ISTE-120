import java.util.Scanner;

import static java.lang.System.exit;

public class HowHealthy {

    public static void main(String[] args) {
        String patternF = "[fF]{1}";
        Scanner scan = new Scanner(System.in);

        double weight,height;
        int age;
        String name;
        char gen = 0;

        System.out.print("Person's name: ");
        name = scan.nextLine();
        if(name.equals("")){
            System.out.println("Invalid name - must have atleast one character");
            exit(0);
        }

        System.out.print(name + ", are you male or female (M/F): ");
        if(scan.nextLine().matches(patternF)){
            gen = 'F';
        }
        else{
            gen ='M';
        }


        System.out.print(name + "'s weight (pounds): ");
        weight = scan.nextDouble();
        if(weight <100){
            System.out.println("Invalid weight - must be at least 100 pounds");exit(0);}

        System.out.print(name + "'s height (inches): ");
        height = scan.nextDouble();
        if(height <60 || height >84){System.out.println("Invalid Height - must be 60 . .84 inches inclusively");exit(0);}

        System.out.print(name + "'s age (years): ");
        age = scan.nextInt();
        if(age < 18){System.out.println("Invalid age - must be at least 18 years of age");exit(0);}

        Healthy h = new Healthy(name,gen,weight,height,age);

        System.out.println("""
                Activity Level: Use these categories:
                \t1 -  Sedentary (little or no exercise, desk job)
                \t2 -  Lightly active (light exercise/sports 1-3 days/wk)
                \t3 -  Moderately active (moderate exercise/sports 3-5 days/wk)
                \t4 -  Very active (hard exercise/sports 6-7 days/wk)
                \t5 -  Extra active (hard exercise/sports & pysical job 2X da trainings (i.e marathon, contest, etc.)      
                """);
        System.out.print("How active are you? ");
        h.setI(scan.nextInt());

        h.printInfo();

    }

}
