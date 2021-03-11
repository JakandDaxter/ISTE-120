package EX1;

import java.util.Scanner;

public class TestTimeInterval {



    public static void main(String[] args) {
        TimeInterval time = new TimeInterval();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first time: ");
        int time1 = scan.nextInt();
        scan.reset();

        System.out.print("Please enter the second time: ");
        int time2 = scan.nextInt();
        scan.reset();

        if(time.validate(time1) && time.validate(time2)){
            time = new TimeInterval(time1,time2);
            System.out.println(time.printValues());
        }


    }

}
