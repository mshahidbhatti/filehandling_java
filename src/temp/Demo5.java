package temp;

import filehandling.Product;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) throws IOException {
        List<String> list=Files.readAllLines(Paths.get("src/temp/input.txt"));

        for(String temp:list)
            System.out.println(temp);


            Scanner sc=new Scanner(System.in);

            Method method[]=sc.getClass().getMethods();

//            for(Method m: method)
//                System.out.println(m.getName()+" "+m.getReturnType());


//        Field feilds[]=sc.getClass().getFields();
//
//
//        System.out.println(feilds[0].getName());

        Product product=new Product("","",0,1);

        Method meth[]=product.getClass().getMethods();

        for(Method m:meth)
            System.out.println(m.getName());
    }
}
