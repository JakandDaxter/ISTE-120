package labEx4;

import java.util.Scanner;

public class TestPicture {

    public static void main(String[] args) {
        Picture4 gr = new Picture4();
        Scanner in = new Scanner(System.in);
        gr.draw();

        System.out.println("Type 'Enter' to Continue: ");
        in.nextLine();
        gr.setNewColors();

        System.out.println("Type 'Enter' to Continue: ");
        in.next();
        gr.OrigColor();

    }
}
