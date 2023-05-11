import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Uttils {


    public static int countUniqueWords(File file){
        HashSet<String> uniqeWords=new HashSet<>();
        ArrayList<String> list=new ArrayList<>();

        list=Uttils.readUsingScanner(file);
        int wordcounter=0;
        for(String temp:list) {
            System.out.println(temp);
            wordcounter+=temp.split(" ").length;
            String [] tempArray=temp.split(" ");
            uniqeWords.addAll(Arrays.stream(tempArray).toList());
        }
        System.out.println(wordcounter);
        System.out.println("Total unique words:"+uniqeWords.size());


        System.out.println(uniqeWords);
        return uniqeWords.size();
    }

    public static ArrayList<String > readUsingScanner(File f){
        ArrayList<String> list=new ArrayList<>();
        try {
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
                list.add(sc.nextLine());  //

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static ArrayList<String> readFromFile(File fileName) {
        ArrayList<String> list=new ArrayList<>();
        try{
            FileReader fr=new FileReader(fileName);
            BufferedReader br=new BufferedReader(fr);
            String text= "";
            while((text= br.readLine())!=null) {

                list.add(text);
            }

        }
        catch(FileNotFoundException e){

        }
        catch(IOException e){

        }
        return list;
    }

    public static void writeToFile(File file, String text){


        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw = new FileWriter(file, true);
            bw=new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Some exception occured");
        }

    }
}
