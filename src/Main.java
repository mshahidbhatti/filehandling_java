import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        File file=new File("samplefile001.txt");

        if(file.exists())
            System.out.println("File already exist");
        else {
            System.out.println("File does not exist");
            try {
                file.createNewFile();
            }
            catch (IOException e){
                System.out.println("Exception description :"+e.getMessage());

            }
        }

        if(file.isDirectory()){
            System.out.println("This is directory");
        }


        File dataDirectory=new File("data");


        if(dataDirectory.isFile()){
            System.out.println("dataDirectory is a folder");
        }
        else
            System.out.println("this is a file");
    }
}