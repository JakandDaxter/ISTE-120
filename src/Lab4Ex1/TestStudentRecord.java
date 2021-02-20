package Lab4Ex1;

public class TestStudentRecord {
    public static void main(String[] args) {

        //Inilizaing two objects for each student of class Student
        Student student1 = new Student("Barbara","Bluestone",23686,2.8);


        //Inilizaing two objects for each student of class address
        Address studentaddy1 = new Address("Main St.","Any Town","NY",14539);


        //Print out the student1 data Colectivly
        StudentRecord addy1 = new StudentRecord(student1,studentaddy1);
        System.out.print(addy1.toString() + "\n\n");

        //Print out the student2 data Colectivly
        StudentRecord test = new StudentRecord("Matthew","Broderick",39872,3.5,"34 Worsted Pl", "NoPlaceVille","UT",29873);
        System.out.print(test.toString()+ "\n\n");
    }
}
