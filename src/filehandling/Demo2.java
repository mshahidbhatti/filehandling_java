package filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src/data2/text2.txt");
        ArrayList<String> list=new ArrayList<>();
//        Utils.writeToFile(file,"E005\tGPU\t50000.0\t1");

        list=Utils.readFromFile(file);
        ArrayList<Product> productlist=new ArrayList<>();
        for(String temp:list) {
//            System.out.println(
//                    temp.split("\t")[0]
//
//            );
            String tempArray[]=temp.split("\t");

            String prodID=tempArray[0];
            String prodName=tempArray[1];
            double prodPrice=Double.parseDouble(tempArray[2]);
            int prodQuantity=Integer.parseInt(tempArray[3]);

            productlist.add(new Product(prodID,prodName, prodPrice, prodQuantity));

        }

            for (Product p:productlist) {
                System.out.println(p);
            }
    }


}
