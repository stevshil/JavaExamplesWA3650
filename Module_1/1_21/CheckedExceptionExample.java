import java.io.File;
import java.io.IOException;

// NOTE: The permissions on the folder should deny write so you cannot create a file

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            File myFile = new File("nonexistentfile.txt");
            myFile.createNewFile();
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}