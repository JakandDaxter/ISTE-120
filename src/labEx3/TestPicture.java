package labEx3;

import java.util.Scanner;

public class TestPicture {

    public static void main(String[] args) {
        Picture3 gr = new Picture3();
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
