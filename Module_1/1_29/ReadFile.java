import java.io.File;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            }

            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Failed to open file");
        }
    }
}