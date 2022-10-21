package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    ArrayList<String> productList = new ArrayList<>();
    public static void main(String[] args) {
        new test().go();
    }

    public void go(){
        getProducts();
        System.out.println(productList);
        Collections.sort(productList);
        System.out.println(productList);
    }
    void getProducts(){
        try {
            File file = new File("testfile.bin");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                addProducts(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void addProducts(String lineP){
        String[] product = lineP.split("/");
        productList.add(product[0]);
    }
}
