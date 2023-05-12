package temp;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo3 {
    public static void main(String[] args) {
        String inputFilePath = "src/temp/input.txt";
        String outputFilePath = "src/temp/output.txt";


        try {
            // Read all bytes from the file
            byte[] allBytes = Files.readAllBytes(Paths.get(inputFilePath));

            // Convert bytes to string using UTF-8 encoding
            String content = new String(allBytes, StandardCharsets.UTF_8);

//            System.out.println("Content of the file:");
            System.out.println(allBytes[2]);
//
//            // Modify the content
            content += "\nThis line was added by Java.";
//
//            // Write the modified content to another file, using UTF-8 encoding
            Files.write(Paths.get(outputFilePath), content.getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("/data"),allBytes);
//
            System.out.println("Modified content was written to " + outputFilePath);

        } catch (IOException e) {
            System.err.println("An error occurred:");
            e.printStackTrace();
        }
    }
}

