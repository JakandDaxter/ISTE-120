
import java.util.Scanner;
import java.util.regex.Pattern;


public class HowHealthy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        Pattern yes = Pattern.compile("yes");
        boolean matchFound = true;


        do{
            Healthy h = new Healthy();

            h.setName(Name());
            h.setGender(Gender(h.getName()));
            h.setWeight(Weight(h.getName()));
            h.setHeight(Height(h.getName()));
            h.setAge(Age(h.getName()));
            h.setI(Activity());

            h.printInfo();

            System.out.println(" Do you wish to do another calculation (yes/no)");
            choice = scan.nextLine();
            if(choice.matches(yes.pattern())){
                matchFound = true;
            }else{
                System.out.println("Have a good day");
                matchFound = false;
            }

        }while(matchFound);

    }

    public static String Name(){
        String name;
        boolean passThrough = true;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Person's name: ");
            name = scan.nextLine();
            if(name.equals("")){
                System.out.println("Invalid name - must have atleast one character");
                passThrough = true;
            }else{
                passThrough = false;
            }
        }while(passThrough);

        return name;
    }

    public static char Gender(String name){
        char gen = 0;
        String holder;
        boolean passThrough = true;
        String patternF = "[fF]{1}";
        String patternM = "[mM]{1}";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(name + ", are you male or female (M/F): ");
            holder = scan.nextLine();
            if (holder.matches(patternF)) {
                gen = 'F';
                passThrough = false;
            } else if (holder.matches(patternM)) {
                gen = 'M';
                passThrough = false;
            } else {
                System.out.println("Invalid Gender - Must be M or F (upper case or lower case)");
                passThrough = true;
            }
        }while (passThrough);

        return gen;
    }

    public static double Weight(String name){
        double weight;
        boolean passThrough = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(name + "'s weight (pounds): ");
            weight = scan.nextDouble();
            if (weight < 100) {
                System.out.println("Invalid weight - must be at least 100 pounds");
                passThrough = true;
            }else{passThrough = false;}
        }while(passThrough);

        return weight;
    }

    public static double Height(String name){
        boolean passThrough = true;
        Scanner scan = new Scanner(System.in);
        double height;

        do {
            System.out.print(name + "'s height (inches): ");
            height = scan.nextDouble();
            if(height <60 || height >84){System.out.println("Invalid Height - must be 60 . .84 inches inclusively");
                passThrough = true;
            }else{passThrough = false;}
        }while(passThrough);

        return height;
    }

    public static int Age(String name){
        int age;
        boolean passThrough = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(name + "'s age (years): ");
            age = scan.nextInt();
            if(age < 18){System.out.println("Invalid age - must be at least 18 years of age");
                passThrough = true;
            }else{passThrough = false;}
        }while(passThrough);

        return age;
    }

    public static int Activity(){
        boolean passThrough = true;
        int holder = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                    Activity Level: Use these categories:
                    \t1 -  Sedentary (little or no exercise, desk job)
                    \t2 -  Lightly active (light exercise/sports 1-3 days/wk)
                    \t3 -  Moderately active (moderate exercise/sports 3-5 days/wk)
                    \t4 -  Very active (hard exercise/sports 6-7 days/wk)
                    \t5 -  Extra active (hard exercise/sports & pysical job 2X da trainings (i.e marathon, contest, etc.)      
                    """);
        do{
            try {
                System.out.print("How active are you? ");
                holder = scan.nextInt();
                if(holder >=1 && holder <=5){
                passThrough = false;
                }
                else{
                    System.out.println("Invalid activity level - must be between 1..5, inclusively");
                    passThrough = true;
                }
            }catch(IllegalStateException e){
                System.out.println("Invalid activity level - must be between 1..5, inclusively");
                passThrough = true;
            }
        }while(passThrough);

        return holder;
    }

}
