import java.util.ArrayList;

class Square {
    ArrayList<Integer> numbers = new ArrayList<Integer>(); // ArrayList attribute "numbers" to store user input
    int[][] square = new int[100][100]; // A 2-D int array attribute "square" that will add the user inputs into a square
    int no_of_elements, sqr;

    // Method that adds a number to the ArrayList of numbers
    public void add(int i)
    {
        numbers.add(i);
    }

    //Method that that checks the size of the ArrayList is a perfect square.
    public boolean isSquare(){
        double sqroot = Math.sqrt(numbers.size());
        return ((sqroot - Math.floor(sqroot)) == 0.0);
    }

    // Method that converts ArrayList to 2-D array
    public void addSquare()
    {
        int j = 0, k = 0;
        sqr = (int) (Math.sqrt(numbers.size()));
        for (int i : numbers) {
            square[j][k] = i;
            k++;
            if (k == sqr)
            {
                j++;
                k = 0;
            }
        }
    }

    //Method that returns true if the ArrayList
    //contains all of the numbers from 1 to n2
    public boolean isUnique(){
        no_of_elements = numbers.size();
        for (int i = 0; i < no_of_elements; i++) {
            for (int j = i + 1; j < no_of_elements; j++) {
                if (numbers.get(i).equals(numbers.get(j)))
                    return false;
            }

        }
        return true;
    }

    //Method that checks if the array square is a magic square
    public boolean isMagic() {
        addSquare();
        no_of_elements = numbers.size();
        sqr = (int) (Math.sqrt(numbers.size()));

        int sum_diag1 = 0, sum_diag2 = 0;

        for (int i = 0; i < sqr; i++)
            sum_diag1 = sum_diag1 + square[i][i]; // Calculate the sum of left to right diagonal

        for (int i = 0; i < sqr; i++)
            sum_diag2 = sum_diag2 + square[i][sqr - 1 - i]; // Calculate the sum of the right to left diagonal

        if (sum_diag1 != sum_diag2) //Checking if the sums of diagonals are equal or not
            return false;

        for (int i = 0; i < sqr; i++) {
            int sum_row = 0;
            for (int j = 0; j < sqr; j++)
                sum_row += square[i][j]; // Calculate the sums of rows

            if (sum_row != sum_diag1) // Check if every row sum is equal to left right diagonal sum
                return false;
        }

        for (int i = 0; i < sqr; i++) {
            int sum_col = 0;
            for (int j = 0; j < sqr; j++)
                sum_col += square[j][i]; // Calculate the sums of columns

            if (sum_diag1 != sum_col) // Check if every column sum is equal to left right diagonal sum
                return false;
        }
        return true;
    }
}