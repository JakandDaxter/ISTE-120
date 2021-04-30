import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        ArrayList<Student> studList = new ArrayList<>();
        while (choice != 3) {
            System.out.println("What type of student do you wish to enter?");
            System.out.println("\t1.Undergrad");
            System.out.println("\t2.Graduate");
            System.out.println("\t3.Done");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Student name: ");
                String name = sc.nextLine();
                System.out.print("Student id: ");
                String id = sc.nextLine();
                System.out.print("Number of credits: ");
                int count = sc.nextInt();
                System.out.print("Level: ");
                int level = sc.nextInt();
                sc.nextLine();
                Undergrad stud = new Undergrad(name, id, count, level);
                studList.add(stud);
            } else if (choice == 2) {
                System.out.print("Student name: ");
                String name = sc.nextLine();
                System.out.print("Student id: ");
                String id = sc.nextLine();
                System.out.print("Number of credits: ");
                int count = sc.nextInt();
                sc.nextLine();
                System.out.print("Research Area: ");
                String rsrch = sc.nextLine();
                Grad stud = new Grad();
                stud.setId(id);
                stud.setName(name);
                stud.setNumCredits(count);
                stud.setResearchArea(rsrch);
                studList.add(stud);
            }
        }
        for (Student stud : studList) {
            System.out.println(stud);
        }
    }
}

