import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class WebPage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://swapi.dev/api/people/1");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();

            // String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            String result = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

            System.out.println("Returned: " + result);

            // Read data from the input stream (process and display as needed)

            inputStream.close();
        } catch (Exception e) {
            System.err.println("Failed to fetch URL");
        }
    }
}