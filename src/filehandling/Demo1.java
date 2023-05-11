package filehandling;

//import java.io.*;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {

        //File handling
        File file =new File("src/data2/text2.txt");

        File folder=new File("src/data3");

        folder.mkdir();

        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            try {
                file.createNewFile();
                System.out.println("does not exist");
            }
            catch (IOException e){

            }
        }


        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println("Folder is a file :"+folder.isFile());
        File data2=new File("src/data2");
        if(data2.isDirectory()){
            File files[]=data2.listFiles();
            System.out.println(files);
            for(File f:files)
                System.out.println(f.getName());
        }

        System.out.println(data2.getParentFile());

    }
}
