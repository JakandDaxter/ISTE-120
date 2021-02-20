package Lab4Ex1;

public class StudentRecord {
    Student stu ;
    Address addr;

    public StudentRecord(Student stu, Address addr) {
        this.stu = stu;
        this.addr = addr;
    }

    public StudentRecord(String firstname,
                         String lastname,
                         int ID,
                         double gpa,
                         String Street,
                         String City,
                         String state,
                         int zip) {

        //setting the student records
        this.stu = new Student(firstname,lastname,ID,gpa);


        //setting the address records
        this.addr = new Address(Street,City,state,zip);

    }

    public String toString(){
        return this.stu.toString() +"\n" + this.addr.toString();
    }
}
