import java.io.*;

class Copy {
    public static void main(String ...args){
        // Fetching command line arguments
        // Input file name, output file name, mode of opening for output file.
        String inputFileName = args[0];
        String outputFileName = args[1];
        String mode = args[2];
        // Creating file objects.
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
        // Using exception handling.
        try {
            // Creating object of file reader class.
            FileReader fr = new FileReader(inputFile);
            FileWriter wr;
            // Checking if output file is already exist.
            if(outputFile.exists()) {
                if(mode.equals("a")) {
                    wr = new FileWriter(outputFile, true);
                }
                else {
                    wr = new FileWriter(outputFile);
                }
            }
            // Otherwise creating output file and then opening it.
            else {
                outputFile.createNewFile();
                wr = new FileWriter(outputFile);
            }
            // Writing in output file one character at a time.
            int ch;
            while((ch = fr.read()) != -1) {
                wr.write((char)ch);
            }
            // Closing files.
            fr.close();
            wr.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
        } catch (IOException e) {
            System.out.println("ERROR: IOError has occurred.");
        }
    }
}
