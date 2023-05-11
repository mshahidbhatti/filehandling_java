package filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

public static void readFileUsingScanner(File file)  {

    try {
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
    catch(IOException e){

    }
}
    public static ArrayList<String> readFromFile(File file) {
        ArrayList<String> list=new ArrayList<>();
        FileReader fr= null;
        try {
            fr = new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
//            System.out.println(br.readLine());
            String text="";
            while((text=br.readLine())!=null)
//                System.out.println(text);
                    list.add(text);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch(IOException e){

        }
        return list;
    }

    public static void writeToFile(File file, String text) {
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
