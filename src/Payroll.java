import java.util.ArrayList;
import java.util.Scanner;

public class Payroll{//class Payroll
    static Scanner scan = new Scanner (System.in);
    public static void Menu(){//method Menu
        System.out.println ("\nWhat do you want to do?");//Menu
        System.out.println ("1.Create a new employee");
        System.out.println ("2.Set pay");
        System.out.println ("3.Show weekly pay");
        System.out.println ("4.Show annual pay");
        System.out.println ("5.Show summary");
        System.out.println ("6.Quit");
        System.out.print("==>");

    }
    public static void main (String[]args){//method main
        ArrayList<Company> list=new ArrayList<>();//ArrayList
        Company c1,c2;
        int employID;
        String name="",ssn,employee;
        double annualSalary,hourlyRate,avgHoursPerWeek,pay;
        do{
            Menu();
            int input = scan.nextInt();
            if (input <=0 || input > 6)
                System.out.println ("\nError Bad option, please try again");
            else{
                //switch
                switch (input) {
                    case 1 -> {
                        do {
                            System.out.print("What type of employee would you like to create (Salaried or Hourly)? ");
                            employee = scan.next();
                            if (!employee.equals("salaried") && !employee.equals("hourly"))
                                System.out.println("***Please enter either 'salaried' or 'hourly' .");
                        } while (!employee.equals("salaried") && !employee.equals("hourly"));
                        System.out.print("Please enter the name: ");
                        name = scan.next() + scan.next();
                        System.out.print("Please enter the social security number: ");
                        ssn = scan.next();
                        if (employee.equals("salaried")) {

                            System.out.print("Please enter the annual pay: ");
                            annualSalary = scan.nextDouble();
                            c1 = new Salaried(name, ssn, annualSalary);//Salaried object
                            list.add(c1);
                        } else {
                            do {
                                System.out.print("Please enter the hourly rate of pay: ");
                                hourlyRate = scan.nextDouble();
                                if (hourlyRate <= 0)
                                    System.out.println("***Please enter a number > 0 ");
                            } while (hourlyRate <= 0);

                            do {
                                System.out.print("Please enter the average number of hours worked per week: ");
                                avgHoursPerWeek = scan.nextDouble();
                                if (avgHoursPerWeek <= 0)
                                    System.out.println("***Please enter a number > 0 ");
                            } while (avgHoursPerWeek <= 0);

                            c2 = new Hourly(name, ssn, hourlyRate, avgHoursPerWeek);//Hourly object
                            list.add(c2);
                        }
                        System.out.println("Employee " + list.size() + " has been created");
                    }
                    case 2 -> {
                        do {
                            System.out.print("Which employee do you wish to use (enter 1 or 2)?");
                            employID = scan.nextInt();
                            if (employID < 1 || employID > 2)
                                System.out.println("***ERROR Please enter an employee number from 1 to 2:");
                        } while (employID < 1 || employID > 2);
                        do {
                            System.out.print("How much would you like to set the annual pay to? ");
                            pay = scan.nextDouble();
                            System.out.println();
                            if (pay <= 0)
                                System.out.println("***ERROR Please enter an amount > 0");
                        } while (pay <= 0);
                        if (employID == 1)
                            list.get(employID - 1).setPay(pay);//call method setPay
                        else
                            list.get(employID - 1).setPay(pay);//call method setPay
                    }
                    case 3 -> {
                        do {
                            System.out.print("Which employee do you wish to use (enter 1 or 2)?");
                            employID = scan.nextInt();
                            System.out.println();
                            if (employID < 1 || employID > 2)
                                System.out.println("***ERROR Please enter an employee number from 1 to 2:");
                        } while (employID < 1 || employID > 2);
                        if (employID == 1)
                            System.out.println("The weekly pay is $" + list.get(employID - 1).calcWeeklyPay());
                        else
                            System.out.println("The weekly pay is $" + list.get(employID - 1).calcWeeklyPay());
                    }
                    case 4 -> {
                        do {
                            System.out.print("Which employee do you wish to use (enter 1 or 2)?");
                            employID = scan.nextInt();
                            if (employID < 1 || employID > 2)
                                System.out.println("***ERROR Please enter an employee number from 1 to 2:");
                        } while (employID < 1 || employID > 2);
                        if (employID == 1)
                            System.out.println("The annual pay is $" + list.get(employID - 1).calcAnnualPay());
                        else
                            System.out.println("The annual pay is $" + list.get(employID - 1).calcAnnualPay());
                    }
                    case 5 -> {
                        do {
                            System.out.print("Which employee do you wish to use (enter 1 or 2)?");
                            employID = scan.nextInt();
                            if (employID < 1 || employID > 2)
                                System.out.println("***ERROR Please enter an employee number from 1 to 2:");
                        } while (employID < 1 || employID > 2);
                        if (employID == 1) {
                            System.out.println(list.get(employID - 1));
                        } else {
                            System.out.println(list.get(employID - 1));
                        }
                    }
                    case 6 -> System.exit(0);
                    default -> throw new IllegalStateException("Unexpected value: " + input);
                }
            }
        }while (true);
    }}

