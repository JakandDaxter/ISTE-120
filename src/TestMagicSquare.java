import java.util.Scanner;

class TestMagicSquare
{
    public static void main(String[] args)
    {
        String inp;
        char[] str=new char[100001];
        int no;

        Scanner sc = new Scanner(System.in);
        Square square1 = new Square();

        do
        {
            System.out.print("Enter an integer (x to exit): ");
            inp=sc.nextLine(); // Taking input of integer
            str=inp.toCharArray();
            if (str[0]=='x' || str[0]=='X') // Signifying the end of input
                break;
            else if(str[0]>='0' && str[0]<='9') // If the input contains digit
            {
                no=Integer.parseInt(inp); // Converting string to integer
                square1.add(no);
            }
            else // Check for invalid type of data entry
            {
                System.out.println("*** Invalid data entry ***");
            }
        } while(str[0]!='x' || str[0]!='X');

        if(!square1.isSquare()) // number dont make a swaue
            System.out.println(" Step 1. Numbers do not make a square: Program Stopped");
        else
        {
            System.out.println(" Step 1. Numbers make a square ***");
            if(!square1.isUnique()) // numbers make a square but not uniwue
                System.out.println(" Step 2. Numbers are not unique: Program Stopped");
            else
            {
                System.out.println(" Step 2. Numbers are unique");
                if(!square1.isMagic()) // invalid both checks
                    System.out.println(" Step 3. But it is NOT a magic square. ***");
                else
                {
                    System.out.println( " Step 3. Yes, it is a MAGIC SQUARE! ***");
                }
            }
        }

    }
}