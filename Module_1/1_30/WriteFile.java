import java.io.File;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 

public class WriteFile {
    public static void main(String[] args) {
        try {
            File file = new File("outputFile.txt");
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("This is a line written to the file.");
            bufferedWriter.newLine();
            bufferedWriter.write("This is another line.");

            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to open file");
        }
    }
}