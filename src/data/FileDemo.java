package data;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class FileDemo {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        HashSet<String> uniqeWords=new HashSet<>();

        File fileName=new File("file1.txt");
//        File inputFile=new File("src\\data\\sample-text-file.txt");
        File inputFile=new File("src\\data\\sample-2mb-text-file.txt");


        System.out.println(Uttils.countUniqueWords(inputFile));

        //append mode
        //rewrite mode

//        data.Uttils.writeToFile(fileName,"this is second line of text");
//        ArrayList<String>list=data.Uttils.readFromFile(fileName);
// //       ArrayList<String>list=data.Uttils.readUsingScanner(fileName);
//        System.out.println(list);


        // 001 name price qty rating





    }



}
