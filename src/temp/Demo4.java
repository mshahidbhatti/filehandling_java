package temp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Demo4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/");

            // Open a connection to the URL and obtain a buffered reader


            try (InputStream in = url.openStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {

                StringBuilder content = new StringBuilder();
                String line;

                // Read line by line
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                    content.append("\n");
                }

                // Remove HTML tags
                String textOnly = content.toString().replaceAll("<[^>]*>", "");

                System.out.println("Content of the URL without HTML tags:");
                System.out.println(textOnly);
            }

        } catch (IOException e) {
            System.err.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
